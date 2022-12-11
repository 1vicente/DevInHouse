import { Component, Input, OnChanges, OnInit } from '@angular/core';
@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss']
})
export class NotificationListComponent implements OnChanges{

  @Input() cavalo: any = '';

  notificacoes = [{
    index: 0,
    titulo: 'teste1',
    subtitulo: 'subtitulo1',
    data: 'data1',
    lido: false
  },
  {
  index: 1,
  titulo: 'teste2',
  subtitulo: 'subtitulo2',
  data: 'data2',
  lido: false
  },
  {
  index: 2,
  titulo: 'teste3',
  subtitulo: 'subtitulo3',
  data: 'data3',
  lido: false
}]
notificacoesFiltradas: any = [];

 ngOnChanges(): void {

  if (this.cavalo == 'todos' || this.cavalo == '' ) {
    this.notificacoesFiltradas=this.notificacoes
  } else if (this.cavalo[0] == 'nao-lidos'){
    // this.notificacoesFiltradas=[]
    this.notificacoesFiltradas=this.notificacoes.filter(  (x) => x.lido==false)
  } else if (this.cavalo == 'lidos'){
    this.notificacoesFiltradas=[]
    this.notificacoesFiltradas=this.notificacoes.filter( (x) => x.lido==true)
  }
}

  mensagemLida(x: boolean, index: number) {
    this.notificacoes[index].lido = true
  }
}