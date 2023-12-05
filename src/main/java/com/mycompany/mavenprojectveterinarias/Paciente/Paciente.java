
package com.mycompany.mavenprojectveterinarias.Paciente;

import com.mycompany.mavenprojectveterinarias.FichaMedica.FichaMedica;
import com.mycompany.mavenprojectveterinarias.Sintoma.Sintoma;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pacientes")
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Animalito")
    private int idAnimalito;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Especie", nullable = false)
    private String especie;

    @Column(name = "Primera_vez_si_o_no", nullable = false)
    private String primeraVezSiONo;

    @Column(name = "Año_Nacimiento", nullable = false)
    private int añoNacimiento;

    @ManyToOne
    @JoinColumn(name = "Id_Sintoma", nullable = false)
    private Sintoma sintoma;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<FichaMedica> fichasMedicas;

    @Column(name = "Fecha_Creacion")
    private Date fechaCreacion;

    // Constructor por defecto (necesario para JPA)
    public Paciente() {
    }

    // Constructor con parámetros
    public Paciente(String nombre, String especie, String primeraVezSiONo, int añoNacimiento, Sintoma sintoma, Date fechaCreacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.primeraVezSiONo = primeraVezSiONo;
        this.añoNacimiento = añoNacimiento;
        this.sintoma = sintoma;
        this.fechaCreacion = fechaCreacion;
    }

    // Getters y setters
    public int getIdAnimalito() {
        return idAnimalito;
    }

    public void setIdAnimalito(int idAnimalito) {
        this.idAnimalito = idAnimalito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPrimeraVezSiONo() {
        return primeraVezSiONo;
    }

    public void setPrimeraVezSiONo(String primeraVezSiONo) {
        this.primeraVezSiONo = primeraVezSiONo;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }

    public List<FichaMedica> getFichasMedicas() {
        return fichasMedicas;
    }

    public void setFichasMedicas(List<FichaMedica> fichasMedicas) {
        this.fichasMedicas = fichasMedicas;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
}