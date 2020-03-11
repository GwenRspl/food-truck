import { Product } from './../models/product';
import { Component, OnInit, Input } from '@angular/core';
import { Actualite } from '../models/actualite';
import { ActualiteService } from '../services/actualite.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.sass']
})
export class HomeComponent implements OnInit {
  featuredProduits: Product[] = [];
  actualite : Array<Actualite> = new Array<Actualite>();
  filteredActualite  : Actualite[]=[];



  constructor(private _actualiteService : ActualiteService) {

  }

  ngOnInit() {
    this._actualiteService.GetActualite().subscribe((data) =>{
      this.actualite = data;
      this.filteredActualite = data;
      console.log(this.filteredActualite);
    });
  }
}
