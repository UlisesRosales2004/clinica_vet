
package com.rosales.ejVeterinaria.repository;

import com.rosales.ejVeterinaria.model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDueñoRepository extends JpaRepository<Dueño,Long> {
    
}
