import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LocalStorageService {

  constructor() { }

  tomedo (x: object) {
    localStorage.setItem('Barriga', JSON.stringify(x))
  }

  
}
