
package com.mycompany.mavenprojectveterinarias.OpcionRespuesta;

import com.mycompany.mavenprojectveterinarias.Pregunta.Pregunta;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "OpcionesRespuesta")
@Data
public class OpcionRespuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpcion;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;
}