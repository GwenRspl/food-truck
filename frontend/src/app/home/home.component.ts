import { Produit } from './../models/produit';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {
  featuredProduits: Produit[] = [];

  constructor() { }

  ngOnInit(): void {
    this.featuredProduits = [
      { id: 1, img: './../../assets/img/img1.jpg', nom: 'Banane', prix: 12, note: 1 },
      { id: 1, img: './../../assets/img/img1.jpg', nom: 'Banane', prix: 12, note: 1 },
      { id: 1, img: './../../assets/img/img1.jpg', nom: 'Banane', prix: 12, note: 1 }
    ];
  }

}
