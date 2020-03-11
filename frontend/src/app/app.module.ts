
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormulaireComponent } from './formulaire/formulaire.component';
import { ConvertToSpacePipe } from './convert-to-space.pipe';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { RatingModule } from 'ng-starrating';
import { HttpClientModule } from '@angular/common/http';
import { FilterPipe } from './filter.pipe';
import { ProductDetailComponent } from './catalogue/product-detail/product-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    FormulaireComponent,
    ConvertToSpacePipe,
    HomeComponent,
    PageNotFoundComponent,
    CatalogueComponent,
    FilterPipe,
    ProductDetailComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RatingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FontAwesomeModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
