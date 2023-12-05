
package com.mycompany.mavenprojectveterinarias.PacienteDAO;



import com.mycompany.mavenprojectveterinarias.Paciente.Paciente;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class PacienteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarPaciente(Paciente paciente) {
        entityManager.persist(paciente);
    }

    public Paciente obtenerPacientePorId(int idPaciente) {
        return entityManager.find(Paciente.class, idPaciente);
    }

    public List<Paciente> obtenerTodosLosPacientes() {
        return entityManager.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
    }

    @Transactional
    public void actualizarPaciente(Paciente paciente) {
        entityManager.merge(paciente);
    }

    @Transactional
    public void eliminarPaciente(int idPaciente) {
        Paciente paciente = obtenerPacientePorId(idPaciente);
        if (paciente != null) {
            entityManager.remove(paciente);
        }
    }
}
