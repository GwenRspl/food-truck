import { Product } from './../../models/product';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductsService } from 'src/app/services/products.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.sass']
})
export class ProductDetailComponent implements OnInit {
  product: Product;

  constructor(private _route: ActivatedRoute, private _products: ProductsService) {
    const id = +this._route.snapshot.paramMap.get('id');
    this._products.getProductsById(id).subscribe(data => this.product = data as Product);
    // this._products.getProducts().subscribe((data: Product[]) => {
    //   this.product = data.find(item => item.productId === id);
    //   console.log(this.product);
    // });
  }

  ngOnInit(): void {
  }

}
