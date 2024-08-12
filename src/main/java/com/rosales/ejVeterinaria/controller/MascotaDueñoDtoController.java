
package com.rosales.ejVeterinaria.controller;

import com.rosales.ejVeterinaria.dto.MascotaDueñoDto;
import com.rosales.ejVeterinaria.service.IMascotaDueñoDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaDueñoDtoController {
    @Autowired
    private IMascotaDueñoDtoService mascoDueñoServ;
    
    @GetMapping("/mascota/dueño/{id}")
    public MascotaDueñoDto findMascotaDueño(@PathVariable Long id){
        return mascoDueñoServ.findMascotaDueño(id);
    }
}
