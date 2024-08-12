
package com.rosales.ejVeterinaria.controller;

import com.rosales.ejVeterinaria.model.Mascota;
import com.rosales.ejVeterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascoServ;
    
    @PostMapping("/mascota/crear")
    public void saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
    }
    
    @PostMapping("/mascota/eliminar/{id}")
    public void deleteMascota(@PathVariable Long id){
        mascoServ.deleteMascota(id);
    }
    
    @PutMapping("/mascota/editar")
    public void editMascota(@RequestBody Mascota masco){
        mascoServ.editMascota(masco);
    }
    
    @GetMapping("/mascota/traer/{id}")
    public Mascota findMascota(@PathVariable Long id){
        return mascoServ.findMascota(id);
    }
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascoServ.getMascotas();
    }
    
    @GetMapping("/mascota/traer/caniches")
    public List<Mascota> getPerrosCaniche(){
        return mascoServ.getPerrosCaniche();
    }
}
