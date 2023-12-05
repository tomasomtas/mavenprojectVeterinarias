
package com.mycompany.mavenprojectveterinarias.Veterinario;



import com.mycompany.mavenprojectveterinarias.Sucursal.Sucursal;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Veterinario")
@Data
public class Veterinario {
    @Id
    @Column(name = "Id_Veterinario")
    private int idVeterinario;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Apellido", nullable = false)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "IdSucursal", nullable = false)
    private Sucursal sucursal;

    // Constructor por defecto (necesario para JPA)
    public Veterinario() {
    }

    // Constructor con parámetros
    public Veterinario(int idVeterinario, String nombre, String apellido, Sucursal sucursal) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sucursal = sucursal;
    }

    // Getters y setters
    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    // Otros métodos, si es necesario
}
