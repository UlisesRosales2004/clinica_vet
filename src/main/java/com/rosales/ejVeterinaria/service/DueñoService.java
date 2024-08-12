
package com.rosales.ejVeterinaria.service;

import com.rosales.ejVeterinaria.model.Dueño;
import com.rosales.ejVeterinaria.repository.IDueñoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DueñoService implements IDueñoService{
    @Autowired
    private IDueñoRepository dueñoRepo;
            
    @Override
    public void saveDueño(Dueño due) {
        dueñoRepo.save(due);
    }

    @Override
    public void deleteDueño(Long id) {
        dueñoRepo.deleteById(id);
    }

    @Override
    public void editDueño(Dueño due) {
        dueñoRepo.save(due);
    }

    @Override
    public Dueño findDueño(Long id) {
        return dueñoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Dueño> getDueños() {
        return dueñoRepo.findAll();
    }
    
}
