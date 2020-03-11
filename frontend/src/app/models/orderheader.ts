import { User } from './user';
import { Address } from './address';
import { MealTime } from './mealtime';
import { OrderLine } from './orderline';

export class OrderHeader {
  id: number;
  user: User;
  orderDate: string;
  totalprice : number;
  deliveryAddress: Address;
  billingAddress : Address;
  receiptNumber : number;
  delivered : boolean;
  mealTime : MealTime;
  orderLines : OrderLine[];

}
