
package com.rosales.ejVeterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idDueño;
    private String dni;
    private String nombreDueño;
    private String apellido;
    private String celular;

    public Dueño() {
    }

    public Dueño(Long idDueño, String dni, String nombreDueño, String apellido, String celular) {
        this.idDueño = idDueño;
        this.dni = dni;
        this.nombreDueño = nombreDueño;
        this.apellido = apellido;
        this.celular = celular;
    }
    
}
