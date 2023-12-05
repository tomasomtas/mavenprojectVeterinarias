
package com.mycompany.mavenprojectveterinarias.Sintoma;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Sintoma")
@Data
public class Sintoma {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Sintoma")
    private int idSintoma;

    @Column(name = "Nombre_Sintoma", nullable = false)
    private String nombreSintoma;

    // Constructor por defecto (necesario para JPA)
    public Sintoma() {
    }

    // Constructor con parámetros
    public Sintoma(String nombreSintoma) {
        this.nombreSintoma = nombreSintoma;
    }

    // Getters y setters
    public int getIdSintoma() {
        return idSintoma;
    }

    public void setIdSintoma(int idSintoma) {
        this.idSintoma = idSintoma;
    }

    public String getNombreSintoma() {
        return nombreSintoma;
    }

    public void setNombreSintoma(String nombreSintoma) {
        this.nombreSintoma = nombreSintoma;
    }

    // Otros métodos, si es necesario 
    
    
    
    
    
}
