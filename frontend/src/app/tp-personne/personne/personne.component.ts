import { Personne } from './../../models/personne';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.sass']
})
export class PersonneComponent implements OnInit {
  personnes: Personne[] = [];
  count: number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  addPersonneToArray(personne: Personne) {
    let newPersonne = new Personne();
    newPersonne.id = this.count.valueOf();
    newPersonne.email = personne.email ? personne.email.valueOf() : "";
    newPersonne.nom = personne.nom ? personne.nom.valueOf() : "";
    newPersonne.prenom = personne.prenom ? personne.prenom.valueOf() : "";
    newPersonne.password = personne.password ? personne.password.valueOf() : "";
    newPersonne.birthday = personne.birthday ? new Date(personne.birthday.valueOf()) : new Date();
    newPersonne.profil = personne.profil ? personne.profil.valueOf() : "";
    this.personnes.push(newPersonne);
    this.count++;
    console.log(this.personnes);
  }

}
