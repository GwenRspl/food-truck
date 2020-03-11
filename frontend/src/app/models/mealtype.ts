import { MealTime } from './mealtime';
import { Product } from './product';

export class MealType {
  id: number;
  label: string;
  active: boolean;
  mealTimes: MealTime[];
  /* products : Product[]; */

}
