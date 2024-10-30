import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product, Products} from './models/products';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private apiServerUrl = 'http://localhost:8081/product';

  constructor(private http: HttpClient) { }

  public getAllProduct(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.apiServerUrl}/findAll`);
  }

  public addProduct(product: Products): Observable<Product> {
    return this.http.post<Product>(`${this.apiServerUrl}/addProduct`, product);
  }
}
