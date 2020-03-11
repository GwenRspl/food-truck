import { Product } from './../models/product';
import { ProductsService } from './../services/products.service';
import { User } from './../models/user';
import { UsersService } from './../services/users.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.sass']
})
export class CatalogueComponent implements OnInit {
  userList: User[];
  productsList: Product[];
  searchString: string = '';

  constructor(private _users: UsersService, private _products: ProductsService) {
    this._users.getUsers().subscribe((data) => {
      this.userList = data as User[];
      console.log(data);
    });

    this._products.getProducts().subscribe((data) => {
      this.productsList = data as Product[];
      console.log(data);
    });
  }

  ngOnInit(): void {
  }

}
