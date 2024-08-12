
package com.rosales.ejVeterinaria.service;

import com.rosales.ejVeterinaria.dto.MascotaDueñoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MascotaDueñoDtoService implements IMascotaDueñoDtoService{

    @Autowired
    private IMascotaService mascoServ;
    
    @Override
    public MascotaDueñoDto findMascotaDueño(Long idMascota) {
        MascotaDueñoDto mascoDueño=new MascotaDueñoDto();
        mascoDueño.setNombreMascota(mascoServ.findMascota(idMascota).getNombreMascota());
        mascoDueño.setEspecie(mascoServ.findMascota(idMascota).getEspecie());
        mascoDueño.setRaza(mascoServ.findMascota(idMascota).getRaza());
        mascoDueño.setNombreDuenio(mascoServ.findMascota(idMascota).getDueño().getNombreDueño());
        mascoDueño.setApellidoDuenio(mascoServ.findMascota(idMascota).getDueño().getApellido());
        return mascoDueño;
    }
    
}
