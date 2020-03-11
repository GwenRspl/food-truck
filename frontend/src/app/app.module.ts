import { PersonneComponent } from './tp-personne/personne/personne.component';
import { FormulairePersonneComponent } from './tp-personne/formulaire-personne/formulaire-personne.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyFirstComponent } from './my-first/my-first.component';
import { AppareilComponent } from './appareil/appareil.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { ConvertToSpacePipe } from './convert-to-space.pipe';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { RatingModule } from 'ng-starrating';
import { HttpClientModule } from '@angular/common/http';
import { FilterPipe } from './filter.pipe';
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';

@NgModule({
  declarations: [
    AppComponent,
    MyFirstComponent,
    AppareilComponent,
    FormulaireComponent,
    FormulairePersonneComponent,
    PersonneComponent,
    ConvertToSpacePipe,
    HomeComponent,
    PageNotFoundComponent,
    CatalogueComponent,
    FilterPipe,
    ProductDetailComponent,
    ReactiveFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RatingModule,
    HttpClientModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
