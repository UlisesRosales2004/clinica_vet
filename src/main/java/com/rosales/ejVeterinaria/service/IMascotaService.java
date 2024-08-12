
package com.rosales.ejVeterinaria.service;

import com.rosales.ejVeterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    public void saveMascota(Mascota masco);
    public void deleteMascota(Long id);
    public void editMascota(Mascota masco);
    public Mascota findMascota(Long id);
    public List<Mascota> getMascotas();
    public List<Mascota> getPerrosCaniche();
}
