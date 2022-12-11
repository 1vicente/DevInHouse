import { Component } from '@angular/core';

@Component({
  selector: 'ntap-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {

  action(link: any) {
    console.log("Evento pai", link)
    
  }

}
