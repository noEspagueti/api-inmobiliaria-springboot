package com.inmobiliaria.inmobiliaria.models.inmuebles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.inmobiliaria.inmobiliaria.models.publicacionEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "casa")
public class casaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCasa")
    private Long idCasa;

    private double areaConstruida;
    private double areaTotal;
    private int numeroBanio;
    private int numeroHabitaciones;
    private int numeroPisos;

    @OneToOne(mappedBy = "tipoCasa")
    @JsonBackReference
    private publicacionEntity publicacion;

    public casaEntity() {
    }

    public casaEntity(double areaConstruida, double areaTotal, int numeroBanio, int numeroHabitaciones,
            int numeroPisos) {
        this.numeroPisos = numeroPisos;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanio = numeroBanio;
        this.areaConstruida = areaConstruida;
        this.areaTotal = areaTotal;
    }

    public Long getIdCasa() {
        return this.idCasa;
    }

    public void setIdCasa(Long id) {
        this.idCasa = id;
    }

    public int getNumeroPisos() {
        return this.numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroHabitaciones() {
        return this.numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanio() {
        return this.numeroBanio;
    }

    public void setNumeroBanio(int numeroBanio) {
        this.numeroBanio = numeroBanio;
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
