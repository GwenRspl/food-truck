import { MealType } from './../models/mealtype';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { MealTime } from './../models/mealtime';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MealsService {

  private _mealTimes = 'http://localhost:8080/api/mealtimes';
  private _mealTypes = 'http://localhost:8080/api/mealtypes';

  constructor(private _http: HttpClient) { }

  getMealTimes(): Observable<MealTime[]> {
    return this._http.get<MealTime[]>(this._mealTimes);
  }

  getMealTypes(): Observable<MealType[]> {
    return this._http.get<MealType[]>(this._mealTypes);
  }
}
