import { Component } from '@angular/core';
@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss']
})
export class NotificationListComponent {
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

  mensagemLida(x: boolean, index: number) {
    console.log(x, index)
    this.notificacoes[index].lido = true
    console.log(this.notificacoes[index].lido)
  }
}
