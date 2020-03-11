import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, ValidatorFn, Validators } from '@angular/forms';

export const validPassword: ValidatorFn = (control) => {
  /* Is not valid. */
  if (/.*[A-Z]+.*/i.test(control.value)) {
    return {
      'validPassword': {
        reason: 'invalid-password',
        value: control.value
      }
    };
  }
  /* Is valid. */
  return null;
};

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.sass']
})
export class ReactiveFormComponent implements OnInit {
  form: FormGroup;

  constructor(private _formBuilder: FormBuilder) {
    this.form = this._formBuilder.group({
      email: null,
      nom: null,
      prenom: null,
      password: [null, validPassword],
      birthday: null,
      profil: null
    });
  }

  ngOnInit(): void {
  }

  logPersonne() {
    console.log(this.form);
    console.log(this.form.value);
    console.log(this.form.value.email, this.form.value.nom, this.form.value.prenom,
      this.form.value.password, this.form.value.birthday, this.form.value.profil);

  }

}
