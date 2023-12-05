
package com.mycompany.mavenprojectveterinarias.Pregunta;

import com.mycompany.mavenprojectveterinarias.OpcionRespuesta.OpcionRespuesta;
import com.mycompany.mavenprojectveterinarias.RespuestaPregunta.RespuestaPregunta;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Preguntas")
@Data
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

    private String enunciado;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<RespuestaPregunta> respuestasPreguntas;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<OpcionRespuesta> opcionesRespuestas;
}
