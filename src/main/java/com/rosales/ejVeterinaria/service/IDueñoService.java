
package com.rosales.ejVeterinaria.service;

import com.rosales.ejVeterinaria.model.Dueño;
import java.util.List;

public interface IDueñoService {
    public void saveDueño(Dueño due);
    public void deleteDueño(Long id);
    public void editDueño(Dueño due);
    public Dueño findDueño(Long id);
    public List<Dueño> getDueños();
}
