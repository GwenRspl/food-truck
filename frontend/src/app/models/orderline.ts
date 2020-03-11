import { User } from './user';
import { Address } from './address';
import { MealTime } from './mealtime';
import { Product } from './product';
import { OrderHeader } from './orderheader';

export class OrderLine {
  id: number;
  product : Product;
  quantity : number;
  unitPrice : number;
}
