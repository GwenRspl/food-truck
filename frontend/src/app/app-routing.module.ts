import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { InscriptionGuard } from './inscription.guard';
import { ConnectedGuard } from './connected.guard';
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PersonneComponent } from './tp-personne/personne/personne.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'reactive', component: ReactiveFormComponent },
  { path: 'catalogue', component: CatalogueComponent, canActivate: [ConnectedGuard] },
  { path: 'catalogue/:id', component: ProductDetailComponent },
  { path: 'users', component: PersonneComponent },
  { path: 'inscription', component: FormulaireComponent, canDeactivate: [InscriptionGuard] },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
