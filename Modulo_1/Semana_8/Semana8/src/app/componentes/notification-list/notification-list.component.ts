import { Component } from '@angular/core';
@Component({
  selector: 'ntap-notification-list',
  templateUrl: './notification-list.component.html',
  styleUrls: ['./notification-list.component.scss']
})
export class NotificationListComponent {
  notificacoes = [{
    titulo: 'teste1',
    subtitulo: 'subtitulo1',
    data: 'data1'
  },
  {
  titulo: 'teste2',
  subtitulo: 'subtitulo2',
  data: 'data2'
  },
  {
    titulo: 'teste3',
  subtitulo: 'subtitulo3',
  data: 'data3'
}]
}
