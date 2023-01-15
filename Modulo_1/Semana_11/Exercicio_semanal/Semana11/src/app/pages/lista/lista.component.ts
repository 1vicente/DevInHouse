import { Component } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent {
  tituloCard: string="";
  descricaoCard: string="";

  cardOn:boolean = true;
  cards:any=[];
  cardTemp:any="";



  salva(titulo:string, descricao:string) {
    console.log(this.cardOn)
    this.cardOn = false;
    this.cardTemp={
      titulo:titulo,
      descricao:descricao
    }
    this.cards.push(this.cardTemp);
  }
}
