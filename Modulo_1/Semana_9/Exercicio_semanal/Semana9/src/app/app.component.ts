import { Component } from '@angular/core';
import { LocalStorageService } from  'src/app/services/local-storage.service'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Semana9';

  retorno: string = ''

  constructor (private bigode:LocalStorageService) {

  }

  buscaTexto (ablablublu: any) {
    this.retorno=ablablublu
    console.log('Pai', this.retorno)
  }
}
