import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NotificationListComponent } from './componentes/notification-list/notification-list.component';
import { MenuNavbarComponent } from './componentes/menu-navbar/menu-navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    NotificationListComponent,
    MenuNavbarComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
