import { Personne } from './../../models/personne';

import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-formulaire-personne',
  templateUrl: './formulaire-personne.component.html',
  styleUrls: ['./formulaire-personne.component.sass']
})
export class FormulairePersonneComponent implements OnInit {
  @Output() savePersonneEvent: EventEmitter<Personne> = new EventEmitter<Personne>();
  personne: Personne;

  constructor() { }

  ngOnInit(): void {
    this.personne = new Personne();
  }

  save(): void {
    this.savePersonneEvent.emit(this.personne);
  }

}
