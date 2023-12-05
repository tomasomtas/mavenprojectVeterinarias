
package com.mycompany.mavenprojectveterinarias.RespuestaPreguntaDAO;




import com.mycompany.mavenprojectveterinarias.RespuestaPregunta.RespuestaPregunta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class RespuestaPreguntaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarRespuestaPregunta(RespuestaPregunta respuestaPregunta) {
        entityManager.persist(respuestaPregunta);
    }

    public RespuestaPregunta obtenerRespuestaPreguntaPorId(int idRespuestaPregunta) {
        return entityManager.find(RespuestaPregunta.class, idRespuestaPregunta);
    }

    public List<RespuestaPregunta> obtenerTodasLasRespuestasPreguntas() {
        return entityManager.createQuery("SELECT r FROM RespuestaPregunta r", RespuestaPregunta.class).getResultList();
    }

    @Transactional
    public void actualizarRespuestaPregunta(RespuestaPregunta respuestaPregunta) {
        entityManager.merge(respuestaPregunta);
    }

    @Transactional
    public void eliminarRespuestaPregunta(int idRespuestaPregunta) {
        RespuestaPregunta respuestaPregunta = obtenerRespuestaPreguntaPorId(idRespuestaPregunta);
        if (respuestaPregunta != null) {
            entityManager.remove(respuestaPregunta);
        }
    }
}
