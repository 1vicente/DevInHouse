import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Semana9';

  tituloPersonagem: string = '@Input Personagem';
  imagemPersonagem: string = 'https://i.pinimg.com/originals/e4/34/2a/e4342a4e0e968344b75cf50cf1936c09.jpg';
  atorPersonagem: string = '@Input Nome do Ator';
  descPersonagem: string = '@Input Descrição do ator';


}
