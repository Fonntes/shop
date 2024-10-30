import {Gender} from './gender';

export interface Product {
  productId: string;
  name: string;
  price: number;
  quantity: number;
  gender: Gender;
  size: number;
  imageUrl: string;
  description: string;
  active: number;
  productCode: string;
}

export class Products {
}
