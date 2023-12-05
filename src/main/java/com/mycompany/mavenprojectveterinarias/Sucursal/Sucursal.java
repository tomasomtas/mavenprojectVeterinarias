
package com.mycompany.mavenprojectveterinarias.Sucursal;



import com.mycompany.mavenprojectveterinarias.Veterinario.Veterinario;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Sucursales")
@Data
public class Sucursal {
    @Id
    @Column(name = "IdSucursal")
    private int idSucursal;

    @Column(name = "Dirección", nullable = false)
    private String direccion;

    @Column(name = "Barrio", nullable = false)
    private String barrio;

    @Column(name = "Responsable_Atendiendo", nullable = false)
    private String responsableAtendiendo;

    @Column(name = "Cantidad_Consultorios", nullable = false)
    private int cantidadConsultorios;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Veterinario> veterinarios;

    // Constructor por defecto (necesario para JPA)
    public Sucursal() {
    }

    // Constructor con parámetros
    public Sucursal(int idSucursal, String direccion, String barrio, String responsableAtendiendo, int cantidadConsultorios) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.barrio = barrio;
        this.responsableAtendiendo = responsableAtendiendo;
        this.cantidadConsultorios = cantidadConsultorios;
    }

    // Getters y setters
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getResponsableAtendiendo() {
        return responsableAtendiendo;
    }

    public void setResponsableAtendiendo(String responsableAtendiendo) {
        this.responsableAtendiendo = responsableAtendiendo;
    }

    public int getCantidadConsultorios() {
        return cantidadConsultorios;
    }

    public void setCantidadConsultorios(int cantidadConsultorios) {
        this.cantidadConsultorios = cantidadConsultorios;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    // Otros métodos, si es necesario
}
