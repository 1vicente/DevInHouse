import { Component } from '@angular/core';
import { Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-busca',
  templateUrl: './busca.component.html',
  styleUrls: ['./busca.component.css']
})
export class BuscaComponent {

  @Output() RetornoPai = new EventEmitter<string>();

  buscaHtml: any = ''

  addNewItem(value: string) {
    this.RetornoPai.emit(value)
  }
}
