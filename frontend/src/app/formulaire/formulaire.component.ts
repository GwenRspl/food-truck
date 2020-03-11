import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formulaire',
  templateUrl: './formulaire.component.html',
  styleUrls: ['./formulaire.component.sass']
})
export class FormulaireComponent implements OnInit {
  email: string;
  nom: string;
  prenom: string;
  birthday: Date;

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit() {
    let result = `${this.email} ${this.nom} ${this.prenom} ${this.birthday}`;
    console.log(result);
    localStorage.setItem('connected', this.nom);
  }

}
