
package com.mycompany.mavenprojectveterinarias.PreguntaDAO;



import com.mycompany.mavenprojectveterinarias.Pregunta.Pregunta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class PreguntaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarPregunta(Pregunta pregunta) {
        entityManager.persist(pregunta);
    }

    public Pregunta obtenerPreguntaPorId(int idPregunta) {
        return entityManager.find(Pregunta.class, idPregunta);
    }

    public List<Pregunta> obtenerTodasLasPreguntas() {
        return entityManager.createQuery("SELECT p FROM Pregunta p", Pregunta.class).getResultList();
    }

    @Transactional
    public void actualizarPregunta(Pregunta pregunta) {
        entityManager.merge(pregunta);
    }

    @Transactional
    public void eliminarPregunta(int idPregunta) {
        Pregunta pregunta = obtenerPreguntaPorId(idPregunta);
        if (pregunta != null) {
            entityManager.remove(pregunta);
        }
    }
}

