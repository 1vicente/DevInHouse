import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  page:string = "";

  cliqueBotao (x:string) {
    this.page = x;
    console.log(this.page);
  };


}
