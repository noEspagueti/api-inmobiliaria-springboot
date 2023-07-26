package com.inmobiliaria.inmobiliaria.models.inmuebles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.inmobiliaria.inmobiliaria.models.publicacionEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "terreno")
public class terrenoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTerreno")
    private Long idTerreno;
    private double areaConstruida;
    private double areaTotal;

    @OneToOne(mappedBy = "terreno")
    @JsonBackReference
    private publicacionEntity publicacion;

    public terrenoEntity() {
    }

    public terrenoEntity(double areaConstruida, double areaTotal) {
        this.areaConstruida = areaConstruida;
        this.areaTotal = areaTotal;
    }

    public Long getIdTerreno() {
        return this.idTerreno;
    }

    public void setIdTerreno(Long idTerreno) {
        this.idTerreno = idTerreno;
    }

    public double getAreaConstruida() {
        return this.areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public double getAreaTotal() {
        return this.areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public publicacionEntity getPublicacion() {
        return this.publicacion;
    }

    public void setPublicacion(publicacionEntity publicacion) {
        this.publicacion = publicacion;
    }

}
