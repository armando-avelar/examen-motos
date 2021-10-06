import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CotizadorService } from 'src/app/services/cotizador.service';

@Component({
  selector: 'app-cotizador',
  templateUrl: './cotizador.component.html',
  styleUrls: ['./cotizador.component.css']
})
export class CotizadorComponent implements OnInit {

  forma: FormGroup;
  motoData: any;
  carga: boolean = false;
  isComplete: boolean = false;

  constructor(private wsCotizador: CotizadorService) {
    this.forma = new FormGroup({
      'nombre': new FormControl('', [Validators.required, Validators.minLength(3), Validators.maxLength(50)]),
      'telefono': new FormControl('', [Validators.required, Validators.maxLength(10)]),
      'email': new FormControl('', [Validators.required, Validators.email]),
      'moto': new FormControl('', Validators.required)
    });
  }

  ngOnInit() {
  }

  cotizar() {
    this.carga = true;
    this.isComplete = false;
    this.wsCotizador.getCotizacion(this.forma.value.moto).subscribe((data: any) => {
      this.carga = false;
      this.isComplete = true;
      this.motoData = data;
      this.motoData.persona = this.forma.value;
      this.motoData.total = this.motoData.precio * 1.16;
      this.motoData.enganche = (this.motoData.total) * 0.10;
      this.motoData.fecha = new Date();
      this.motoData.credito = (this.motoData.total) + (this.motoData.total * 12.5)
    })
  }

}
