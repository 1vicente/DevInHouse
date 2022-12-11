import { Component } from '@angular/core';

@Component({
  selector: 'ntap-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {

  retornodoFiltro: any = '';

  action(link: any) {
    this.retornodoFiltro = link;
    
  }
}
