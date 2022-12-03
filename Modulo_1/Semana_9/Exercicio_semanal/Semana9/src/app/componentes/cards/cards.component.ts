import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css']
})
export class CardsComponent {
  tituloPersonagem: string = "Personagem";
  imagemPersonagem: string = "https://i.pinimg.com/originals/e4/34/2a/e4342a4e0e968344b75cf50cf1936c09.jpg";
  atorPersonagem: string = "Nome do ator que faz o personagem";
  descPersonagem: string = "Descrição do personagem";

}
