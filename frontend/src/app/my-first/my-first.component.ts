import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-my-first',
  templateUrl: './my-first.component.html',
  styleUrls: ['./my-first.component.sass']
})
export class MyFirstComponent implements OnInit {
  @Input() username: string;
  @Input() lastName: string;

  constructor() { }

  ngOnInit(): void {
  }

}
