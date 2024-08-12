
package com.rosales.ejVeterinaria.controller;

import com.rosales.ejVeterinaria.model.Dueño;
import com.rosales.ejVeterinaria.service.IDueñoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DueñoController {
    @Autowired
    private IDueñoService dueServ;
    
    @PostMapping("/dueño/crear")
    public void saveDueño(@RequestBody Dueño due){
        dueServ.saveDueño(due);
    }
    
    @PostMapping("/dueño/eliminar/{id}")
    public void deleteDueño(@PathVariable Long id){
        dueServ.deleteDueño(id);
    }
    
    @PutMapping("/dueño/editar")
    public void editDueño(@RequestBody Dueño due){
        dueServ.editDueño(due);
    }
    
    @GetMapping("/dueño/traer/{id}")
    public Dueño findDueño(@PathVariable Long id){
        return dueServ.findDueño(id);
    }
    
    @GetMapping("/dueño/traer")
    public List<Dueño> getDueños(){
        return dueServ.getDueños();
    }
    
    
}
