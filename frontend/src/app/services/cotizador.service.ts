import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CotizadorService {

  url:string = 'http://localhost:8080/api';

  constructor(private app: HttpClient) { 

  }

  getCotizacion(id:number){
      return this.app.get(`${this.url}/motorcycles/${id}`);
  }
}
