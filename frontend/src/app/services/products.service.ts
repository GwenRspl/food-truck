import { Product } from './../models/product';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private _productsUrl = './../../assets/api/products/products.json';

  constructor(private _http: HttpClient) { }

  getProducts() {
    return this._http.get(this._productsUrl);
  }

  getProductsById(id: number) {
    return this.getProducts().pipe(map((txs: Product[]) => txs.find(item => item.productId === id)));
  }
}
