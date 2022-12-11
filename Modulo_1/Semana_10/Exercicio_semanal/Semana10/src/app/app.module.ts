import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NotificationListComponent } from './componentes/notification-list/notification-list.component';
import { MenuNavbarComponent } from './componentes/menu-navbar/menu-navbar.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { FiltroComponent } from './componentes/filtro/filtro.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { Routes, RouterModule } from '@angular/router';

const rotas: Routes = [
  {
    path: '',
    redirectTo: 'inicio',
    pathMatch: 'full'
  },
  {
    path: 'inicio',
    component: HomeComponent,
    // children: [{
    //     path: 'todos',
    //   },
    //   {
    //     path: 'nao-lidos',
    //   },
    //   {
    //     path: 'lidos',
    //   }  ]
  },
  {
    path: 'sobre',
    component: AboutComponent,
  },
  {
    path: '**',
    redirectTo: 'inicio'
  }
];

@NgModule({
  declarations: [
    AppComponent,
    NotificationListComponent,
    MenuNavbarComponent,
    FooterComponent,
    FiltroComponent,
    HomeComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(rotas)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
