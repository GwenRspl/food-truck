import { User } from './user';

export class Address {
  id: number;
 /*  user: User[]; */
  number : number;
  street : string;
  zipcode: string;
  city: string;
  country : string;
  billingAdress: boolean;
}
