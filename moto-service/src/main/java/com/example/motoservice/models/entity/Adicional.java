package com.example.motoservice.models.entity;

import javax.persistence.*;

@Entity
@Table(name="adicionales")
public class Adicional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="gastos_administrativos")
    private Double gastosAdministrativos;

    @Column(name="costos_accesorios")
    private Double costosAccesorios;

    @Column(name="id_motorcycle")
    private Long idMotorcycle;

    public Long getIdMotorcycle() {
        return idMotorcycle;
    }

    public void setIdMotorcycle(Long idMotorcycle) {
        this.idMotorcycle = idMotorcycle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(Double gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }

    public Double getCostosAccesorios() {
        return costosAccesorios;
    }

    public void setCostosAccesorios(Double costosAccesorios) {
        this.costosAccesorios = costosAccesorios;
    }
}
