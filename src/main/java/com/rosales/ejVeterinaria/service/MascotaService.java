
package com.rosales.ejVeterinaria.service;

import com.rosales.ejVeterinaria.model.Mascota;
import com.rosales.ejVeterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascoRepo;
    
    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public List<Mascota> getPerrosCaniche() {
        List<Mascota> listaMascotas=this.getMascotas();
        List<Mascota> listaCaniche=new ArrayList();
        for(Mascota masco:listaMascotas){
            if (masco.getEspecie().toLowerCase().contains("perro") && masco.getRaza().toLowerCase().contains("caniche")){
                listaCaniche.add(masco);
            }
        }
        return listaCaniche;
    }
    
}
