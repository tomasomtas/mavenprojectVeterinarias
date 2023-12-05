
package com.mycompany.mavenprojectveterinarias.RespuestaPregunta;



import com.mycompany.mavenprojectveterinarias.FichaMedica.FichaMedica;
import com.mycompany.mavenprojectveterinarias.Pregunta.Pregunta;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "RespuestasPreguntas")
@Data
public class RespuestaPregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "idFichaMedica")
    private FichaMedica fichaMedica;

    // Constructor por defecto (necesario para JPA)
    public RespuestaPregunta() {
    }

    // Constructor con parámetros
    public RespuestaPregunta(String respuesta, Pregunta pregunta, FichaMedica fichaMedica) {
        this.respuesta = respuesta;
        this.pregunta = pregunta;
        this.fichaMedica = fichaMedica;
    }
}
