
package com.mycompany.mavenprojectveterinarias.FichaMedica;

import com.mycompany.mavenprojectveterinarias.Paciente.Paciente;
import com.mycompany.mavenprojectveterinarias.Veterinario.Veterinario;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "FichasMedicas")
@Data
public class FichaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_FichaMedica")
    private int idFichaMedica;

    @ManyToOne
    @JoinColumn(name = "Id_Animalito", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "Id_Veterinario", nullable = false)
    private Veterinario veterinario;

    @Column(name = "Fecha_Atencion", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAtencion;

    // Otras propiedades y métodos según sea necesario

    // Constructor por defecto (necesario para JPA)
    public FichaMedica() {
    }

    // Constructor con parámetros
    public FichaMedica(Paciente paciente, Veterinario veterinario, Date fechaAtencion) {
        this.paciente = paciente;
        this.veterinario = veterinario;
        this.fechaAtencion = fechaAtencion;
    }

    // Getters y setters
    public int getIdFichaMedica() {
        return idFichaMedica;
    }

    public void setIdFichaMedica(int idFichaMedica) {
        this.idFichaMedica = idFichaMedica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }


}