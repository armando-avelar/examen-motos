package com.example.motoservice.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="motorcycles")
public class Motorcycle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String version;
    private Double precio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Seguro seguro;

    @OneToMany(targetEntity = Adicional.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_motorcycle", referencedColumnName = "id")
    private List<Adicional> Adicional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public List<com.example.motoservice.models.entity.Adicional> getAdicional() {
        return Adicional;
    }

    public void setAdicional(List<com.example.motoservice.models.entity.Adicional> adicional) {
        Adicional = adicional;
    }

    private static final long serialVersionUID = 1L;
}
