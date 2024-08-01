-- Active: 1722018362506@@127.0.0.1@3306
CREATE DATABASE veterinario
    DEFAULT CHARACTER SET = 'utf8mb4';
use veterinario;

CREATE TABLE cliente (
    idCliente INT AUTO_INCREMENT PRIMARY KEY,
    dni INT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono INT NOT NULL,
    direccion VARCHAR(255),
    contactoAlternativo VARCHAR(100),
    activo BOOLEAN NOT NULL
);

CREATE TABLE mascota (
    idMascota INT AUTO_INCREMENT PRIMARY KEY,
    alias VARCHAR(100) NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    especie VARCHAR(50) NOT NULL,
    raza VARCHAR(50) NOT NULL,
    colorPelo VARCHAR(50),
    fechaNac DATE NOT NULL,
    idCliente INT NOT NULL,
    activo BOOLEAN NOT NULL,
    pesoPromedio DOUBLE,
    FOREIGN KEY (idCliente) REFERENCES cliente(idCliente)
);
CREATE TABLE producto (
    idProducto INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio INT NOT NULL,
    stock INT NOT NULL
);
CREATE TABLE tratamiento (
    idTratamiento INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    idProducto INT NOT NULL,
    importe INT NOT NULL,
    tipoTratamiento VARCHAR(100) NOT NULL,
    activo BOOLEAN NOT NULL,
    FOREIGN KEY (idProducto) REFERENCES producto(idProducto)
);
CREATE TABLE usuario (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE visita (
    idVisita INT AUTO_INCREMENT PRIMARY KEY,
    idMascota INT NOT NULL,
    fechaVisita DATE NOT NULL,
    importe INT NOT NULL,
    peso DOUBLE NOT NULL,
    idTratamiento INT NOT NULL,
    FOREIGN KEY (idMascota) REFERENCES mascota(idMascota),
    FOREIGN KEY (idTratamiento) REFERENCES tratamiento(idTratamiento)
);
