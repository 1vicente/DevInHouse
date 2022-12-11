import { Component } from '@angular/core';

@Component({
  selector: 'ntap-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {
  
  botoes: any = [{
    botao: 'Todes',
  },
  {
    botao: 'Não lidos',
  },
  {
    botao: 'Lidos',
  }
  ];

}
