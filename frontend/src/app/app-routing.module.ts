
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'catalogue', component: CatalogueComponent },
  { path: 'catalogue/:id', component: ProductDetailComponent },
  { path: 'inscription', component: FormulaireComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
