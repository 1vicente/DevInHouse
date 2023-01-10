import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  page:string = "";

  arrayFotos: any = [
 	 {
	    url: "https://img.freepik.com/fotos-gratis/foto-de-grande-angular-de-uma-unica-arvore-crescendo-sob-um-ceu-nublado-durante-um-por-do-sol-cercado-por-grama_181624-22807.jpg?w=2000",
	    description:"Descrioção 1"
	  },
	  {
	    url: "https://www.viajali.com.br/wp-content/uploads/2019/05/fotos-de-paris-49-730x913.jpg",
	    description:"Descrioção 2"
	  },
	  {
	    url: "https://turismo.eurodicas.com.br/wp-content/uploads/2018/12/fotos-da-torre-de-paris-1.jpg",
	    description:"Descrioção 3"
	  },
	  {
	    url: "https://img.freepik.com/fotos-gratis/bela-foto-da-praia-no-algarve-portugal_181624-26718.jpg?w=2000",
	    description:"Descrioção 4"
	  },
	  {
	    url: "https://media-cdn.tripadvisor.com/media/photo-s/19/36/20/9b/dopo-tre-anni-di-nuovo.jpg",
	    description:"Descrioção 5"
	  }
	]

  cliqueBotao (x:string) {
    this.page = x;
    console.log(this.page);
  };


}
