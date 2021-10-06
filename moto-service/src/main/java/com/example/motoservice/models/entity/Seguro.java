package com.example.motoservice.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="seguros")
public class Seguro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "monto_minimo")
    private Double montoMinimo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(Double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    private static final long serialVersionUID = 1L;
}
