
package com.rosales.ejVeterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class MascotaDueñoDto {
    private String nombreMascota;
    private String especie;
    private String raza;
    private String nombreDuenio;
    private String apellidoDuenio;

    public MascotaDueñoDto() {
    }

    public MascotaDueñoDto(String nombreMascota, String especie, String raza, String nombreDuenio, String apellidoDuenio) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
    }
    
    
}
