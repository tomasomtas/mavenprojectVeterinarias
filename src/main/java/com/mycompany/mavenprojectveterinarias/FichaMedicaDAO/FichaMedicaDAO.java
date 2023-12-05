
package com.mycompany.mavenprojectveterinarias.FichaMedicaDAO;



import com.mycompany.mavenprojectveterinarias.FichaMedica.FichaMedica;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class FichaMedicaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarFichaMedica(FichaMedica fichaMedica) {
        entityManager.persist(fichaMedica);
    }

    public FichaMedica obtenerFichaMedicaPorId(int IdFichaMedica) {
        return entityManager.find(FichaMedica.class, IdFichaMedica);
    }

    public List<FichaMedica> obtenerTodasLasFichasMedicas() {
        return entityManager.createQuery("SELECT f FROM FichaMedica f", FichaMedica.class).getResultList();
    }

    @Transactional
    public void actualizarFichaMedica(FichaMedica fichaMedica) {
        entityManager.merge(fichaMedica);
    }

    @Transactional
    public void eliminarFichaMedica(int IdFichaMedica) {
        FichaMedica fichaMedica = obtenerFichaMedicaPorId(IdFichaMedica);
        if (fichaMedica != null) {
            entityManager.remove(fichaMedica);
        }
    }
}
