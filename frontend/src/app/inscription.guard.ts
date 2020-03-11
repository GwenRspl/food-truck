import { FormulaireComponent } from './formulaire/formulaire.component';
import { Injectable } from '@angular/core';
import { CanDeactivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class InscriptionGuard implements CanDeactivate<FormulaireComponent> {

  canDeactivate(
    component: FormulaireComponent,
    currentRoute: ActivatedRouteSnapshot,
    currentState: RouterStateSnapshot,
    nextState: RouterStateSnapshot
  ): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    if (localStorage.getItem('connected')) {
      return true;
    } else {
      alert('Are you sure you want to quit ?');
    }

  }


}
