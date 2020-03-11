import { Component, OnInit, Input, Output, EventEmitter, OnChanges } from '@angular/core';



@Component({
  selector: 'app-appareil',
  templateUrl: './appareil.component.html',
  styleUrls: ['./appareil.component.sass']
})
export class AppareilComponent implements OnChanges {
  @Input() appareilName: string;
  @Input() username: string;
  @Input() lastname: string;
  @Output() ratingUsername: EventEmitter<string> = new EventEmitter<string>();
  @Output() ratingLastName: EventEmitter<string> = new EventEmitter<string>();

  constructor() { }

  ngOnChanges(): void {
  }

  notifyUsername() {
    this.ratingUsername.emit(this.username);
  }
  notifyLastName() {
    this.ratingLastName.emit(this.lastname);
  }

}
