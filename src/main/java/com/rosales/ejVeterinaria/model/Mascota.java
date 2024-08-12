
package com.rosales.ejVeterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idMascota;
    private String nombreMascota;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    private Dueño dueño;

    public Mascota() {
    }

    public Mascota(Long idMascota, String nombreMascota, String especie, String raza, String color, Dueño dueño) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.dueño = dueño;
    }
    
}
