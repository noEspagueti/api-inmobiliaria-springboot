package com.inmobiliaria.inmobiliaria.models.inmuebles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.inmobiliaria.inmobiliaria.models.publicacionEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class departamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartamento")
    private Long idDepartamento;
    private int numeroHabitaciones;
    private int numeroBanio;
    private int numeroPisos;
    private double areaTotal;

    @OneToOne(mappedBy = "tipoDepartamento")
    @JsonBackReference
    private publicacionEntity publicacion;

    public departamentoEntity() {
    }

    public departamentoEntity(int numeroHabitaciones, int numeroBanio, int numeroPisos, double areaTotal) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanio = numeroBanio;
        this.numeroPisos = numeroPisos;
        this.areaTotal = areaTotal;
    }

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long id) {
        this.idDepartamento = id;
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

    public int getNumeroPisos() {
        return this.numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public double getAreaTotal() {
        return this.areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

}
