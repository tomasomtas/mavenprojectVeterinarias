
package com.mycompany.mavenprojectveterinarias.VeterinarioDAO;




import com.mycompany.mavenprojectveterinarias.Veterinario.Veterinario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class VeterinarioDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarVeterinario(Veterinario veterinario) {
        entityManager.persist(veterinario);
    }

    public Veterinario obtenerVeterinarioPorId(int idVeterinario) {
        return entityManager.find(Veterinario.class, idVeterinario);
    }

    public List<Veterinario> obtenerTodosLosVeterinarios() {
        return entityManager.createQuery("SELECT v FROM Veterinario v", Veterinario.class).getResultList();
    }

    @Transactional
    public void actualizarVeterinario(Veterinario veterinario) {
        entityManager.merge(veterinario);
    }

    @Transactional
    public void eliminarVeterinario(int idVeterinario) {
        Veterinario veterinario = obtenerVeterinarioPorId(idVeterinario);
        if (veterinario != null) {
            entityManager.remove(veterinario);
        }
    }
}
