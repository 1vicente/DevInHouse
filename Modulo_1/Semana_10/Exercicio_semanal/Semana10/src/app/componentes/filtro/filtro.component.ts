import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'ntap-filtro',
  templateUrl: './filtro.component.html',
  styleUrls: ['./filtro.component.scss']
})
export class FiltroComponent {
  
  botoes: any = [{
    botao: 'Todes',
    link: 'todos'
  },
  {
    botao: 'Não lidos',
    link: 'nao-lidos'
  },
  {
    botao: 'Lidos',
    link: 'lidos'
  }
  ];

  @Output() retornoFiltro = new EventEmitter<string>();

  filtro (link: any) {
    console.log("Evento Componente filho", link)
    this.retornoFiltro.emit(link)
  }
}
