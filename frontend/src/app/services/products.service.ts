import { Product } from './../models/product';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  private _productsUrl = 'http://localhost:8080/api/products';

  constructor(private _http: HttpClient) { }

  getProducts(): Observable<Product[]> {
    return this._http.get<Product[]>(this._productsUrl);
  }

  getProductsById(id: number) {
    return this.getProducts().pipe(map((txs: Product[]) => txs.find(item => item.id === id)));
  }
}
