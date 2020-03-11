import { Product } from './../models/product';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {
  featuredProduits: Product[] = [];

  constructor() { }

  ngOnInit(): void {
    this.featuredProduits = [];
  }

}
