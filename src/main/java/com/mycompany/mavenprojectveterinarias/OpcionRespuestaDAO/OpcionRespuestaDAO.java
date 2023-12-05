
package com.mycompany.mavenprojectveterinarias.OpcionRespuestaDAO;


import com.mycompany.mavenprojectveterinarias.OpcionRespuesta.OpcionRespuesta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class OpcionRespuestaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarOpcionRespuesta(OpcionRespuesta opcionRespuesta) {
        entityManager.persist(opcionRespuesta);
    }

    public OpcionRespuesta obtenerOpcionRespuestaPorId(int idOpcionRespuesta) {
        return entityManager.find(OpcionRespuesta.class, idOpcionRespuesta);
    }

    public List<OpcionRespuesta> obtenerTodasLasOpcionesRespuesta() {
        return entityManager.createQuery("SELECT o FROM OpcionRespuesta o", OpcionRespuesta.class).getResultList();
    }

    @Transactional
    public void actualizarOpcionRespuesta(OpcionRespuesta opcionRespuesta) {
        entityManager.merge(opcionRespuesta);
    }

    @Transactional
    public void eliminarOpcionRespuesta(int idOpcionRespuesta) {
        OpcionRespuesta opcionRespuesta = obtenerOpcionRespuestaPorId(idOpcionRespuesta);
        if (opcionRespuesta != null) {
            entityManager.remove(opcionRespuesta);
        }
    }
}