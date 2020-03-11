import { MealType } from './mealtype';

import { Rating } from './rating';

export class Product {
    id: number;
    name: string;
    price: number;
    days: Day[];
    mealtypes: MealType[];
    stock : number;
    description: string;
    composition: string;
    image : string;
    rating: Rating[];

}

