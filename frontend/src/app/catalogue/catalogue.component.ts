import { MealsService } from './../services/meals.service';
import { MealType } from './../models/mealtype';
import { MealTime } from './../models/mealtime';
import { Product } from './../models/product';
import { ProductsService } from './../services/products.service';
import { Component, OnInit } from '@angular/core';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import { faPlus } from '@fortawesome/free-solid-svg-icons';
import { faMinus } from '@fortawesome/free-solid-svg-icons';
import { Rating } from '../models/rating';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.sass']
})
export class CatalogueComponent implements OnInit {
  faSearch = faSearch;
  faPlus = faPlus;
  faMinus = faMinus;
  productsList: Product[];
  searchString: string = '';
  selectedMealTime: string = 'all';
  selectedMealType: string = 'all';
  mealTimes: MealTime[];
  mealTypes: MealType[];

  constructor(private _products: ProductsService, private _meals: MealsService) {
    this._products.getProducts().subscribe((data) => {
      this.productsList = data;
      console.log(data);
    });

    this._meals.getMealTimes().subscribe((data) => {
      this.mealTimes = data;
    });

    this._meals.getMealTypes().subscribe((data) => {
      this.mealTypes = data;
    });

  }

  ngOnInit(): void {
  }

  getAverage(ratings: Rating[]): number {
    let result = 0;
    for (let rating of ratings) {
      result += rating.grade;
    }
    result /= ratings.length;
    return result;

  }

}
