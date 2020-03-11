import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Actualite } from '../models/actualite';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ActualiteService {
  private _actualiteUrl = 'http://localhost:8082/api/actualites';

  constructor(private _http: HttpClient) {

   }

  GetActualite() : Observable<Actualite[]> {
    return this._http.get<Actualite[]>(this._actualiteUrl);
  }
}

