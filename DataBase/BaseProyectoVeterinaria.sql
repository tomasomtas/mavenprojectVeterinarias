CREATE DATABASE VETERINARIAS;

CREATE DATABASE MASCOTAS;

USE MASCOTAS;

CREATE TABLE Sintoma (
    Id_Sintoma int (7) PRIMARY KEY,
    Nombre_Sintoma VARCHAR(100) NOT NULL
);

CREATE TABLE Pacientes
(
Id_Animalito int primary key not null,
Nombre varchar (35) not null,
Especie varchar (30) not null,
Primera_vez_si_o_no varchar (2) not null,
Año_Nacimiento Year not null,
Id_Sintoma int (7) not null,
FOREIGN KEY (Id_Sintoma) REFERENCES Sintoma(Id_Sintoma)
);

CREATE TABLE FichasMedicas (
    Id_FichaMedica INT PRIMARY KEY,
    Id_Animalito int not null,
    FOREIGN KEY (Id_Animalito) REFERENCES Pacientes(Id_Animalito)
);


USE VETERINARIAS;


CREATE TABLE Veterinario (
    Id_Veterinario INT PRIMARY KEY,
    Nombre VARCHAR(25) NOT NULL,
    Apellido VARCHAR(25) NOT NULL,
    IdSucursal int not null,
    FOREIGN KEY (IdSucursal) REFERENCES Sucursales(IdSucursal)
);

CREATE TABLE Sucursales
(
IdSucursal int primary key not null,
Dirección varchar (35) not null,
Barrio varchar (30) not null,
Responsable_Atendiendo varchar (35) not null,
Cantidad_Consultorios int not null
);

