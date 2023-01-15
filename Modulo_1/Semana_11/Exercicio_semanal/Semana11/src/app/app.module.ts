import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { CaptalizePhillipsPipe } from './pipes/captalize-phillips.pipe';
import { NavbarComponent } from './componentes/navbar/navbar.component';
import { ModalComponent } from './componentes/modal/modal.component';
import { NgContentComponent } from './compnentes/ng-content/ng-content.component';
import { CardsComponent } from './componentes/cards/cards.component';
import { InputValidadoComponent } from './componentes/input-validado/input-validado.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CaptalizePhillipsPipe,
    NavbarComponent,
    ModalComponent,
    NgContentComponent,
    CardsComponent,
    InputValidadoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
