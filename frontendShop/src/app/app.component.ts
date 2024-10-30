import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import { Product } from './models/products';
import {
  MatCell,
  MatCellDef,
  MatColumnDef,
  MatHeaderCell,
  MatHeaderCellDef,
  MatHeaderRow, MatHeaderRowDef, MatRow, MatRowDef, MatTable
} from '@angular/material/table';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: true,
  imports: [
    MatColumnDef,
    MatHeaderCell,
    MatCell,
    MatCellDef,
    MatHeaderCellDef,
    MatHeaderRow,
    MatHeaderRowDef,
    MatRow,
    MatRowDef,
    MatTable
  ],
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public products: Product[] = [];
  displayedColumns: string[] = ['image', 'name', 'description', 'price', 'quantity', 'size', 'gender', 'productCode'];

  constructor(private productService: ProductService) {}

  ngOnInit() {
    this.getProducts();
  }

  private getProducts(): void {
    this.productService.getAllProduct().subscribe(
      (response: Product[]) => {
        this.products = response;
      },
      error => {
        console.error('Erro ao carregar produtos:', error.message);
      }
    );
  }
}
