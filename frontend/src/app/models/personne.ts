export class Personne {
  private _id: number;
  private _email: string;
  private _nom: string;
  private _prenom: string;
  private _password: string;
  private _birthday: Date;
  private _profil: string;


  constructor() {
  }

  public get id(): number {
    return this._id;
  }
  public set id(value: number) {
    this._id = value;
  }


  public get email(): string {
    return this._email;
  }
  public set email(value: string) {
    this._email = value;
  }
  public get nom(): string {
    return this._nom;
  }
  public set nom(value: string) {
    this._nom = value;
  }
  public get prenom(): string {
    return this._prenom;
  }
  public set prenom(value: string) {
    this._prenom = value;
  }
  public get password(): string {
    return this._password;
  }
  public set password(value: string) {
    this._password = value;
  }
  public get birthday(): Date {
    return this._birthday;
  }
  public set birthday(value: Date) {
    this._birthday = value;
  }
  public get profil(): string {
    return this._profil;
  }
  public set profil(value: string) {
    this._profil = value;
  }

}
