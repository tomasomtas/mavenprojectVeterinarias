
package com.mycompany.mavenprojectveterinarias.Mascota;



import com.mycompany.mavenprojectveterinarias.Paciente.Paciente;
import com.mycompany.mavenprojectveterinarias.Sintoma.Sintoma;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pacientes") // Mantenemos el nombre de la tabla como "Pacientes"
@DiscriminatorValue("Mascota") // Valor de discriminador para identificar a las mascotas
@Data
public class Mascota extends Paciente {
    @Column(name = "Raza", nullable = false)
    private String raza;

    // Constructor por defecto (necesario para JPA)
    public Mascota() {
    }

    // Constructor con parámetros
    public Mascota(String nombre, String especie, String primeraVezSiONo, int añoNacimiento, Sintoma sintoma, Date fechaCreacion, String raza) {
        super(nombre, especie, primeraVezSiONo, añoNacimiento, sintoma, fechaCreacion);
        this.raza = raza;
    }

    // Getter y setter específico de Mascota
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Otros métodos, si es necesario
}
