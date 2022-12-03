import { Component } from '@angular/core';
import { LocalStorageService } from  'src/app/services/local-storage.service'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Semana9';

  passHtml: string = '' 
  emailHtml: string = '' 

  objInfo: any = {}

  constructor (private bigode:LocalStorageService) {

  }

  salvaLocalStorage(){
    this.objInfo = {
      email: this.emailHtml, 
      senha: this.passHtml
    }
    console.log(this.objInfo)
    this.bigode.tomedo(this.objInfo)
  }

}
