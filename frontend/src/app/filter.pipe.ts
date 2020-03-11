import { MealType } from './models/mealtype';
import { MealTime } from './models/mealtime';
import { Product } from './models/product';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(items: Product[], searchText: string, mealtype: string, mealtime: string): any[] {
    if (!items) {
      return [];
    }
    if (!searchText && !mealtype && !mealtime) {
      return items;
    }
    searchText = searchText.toLowerCase();

    let array: Product[] = this.filterByMealTime(this.filterByMealType(items, mealtype), mealtime);

    return array.filter(it => {
      return it.name.toLowerCase().includes(searchText);
    });
  }

  filterByMealType(items: Product[], mealtype: string): Product[] {
    if (mealtype === 'all') {
      return items;
    }
    let array: Product[] = [];
    items.map(it => {
      it.mealtypes.map(type => {
        if (type.label === mealtype) {
          array.push(it);
        }
      });
    });
    return array;
  }

  filterByMealTime(items: Product[], mealtime: string): Product[] {
    if (mealtime === 'all') {
      return items;
    }
    let array: Product[] = [];
    items.map(it => {
      it.mealtypes.map(type => {
        type.mealTimes.map(time => {
          if (time.label === mealtime) {
            array.push(it);
          }
        });
      });
    });
    return array;
  }

}
