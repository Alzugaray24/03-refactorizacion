package com.booking.Models.Reserva;

import java.time.LocalDate;

public class Cliente {

    private String nombre;
    private String apellido;
    private String correo;
    private String numeroDeTelefono;
    private String nacionalidad;
    private LocalDate fechaDeNacimiento;
    private ReservaData<?> reservaData;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String numeroDeTelefono,
                   String nacionalidad, LocalDate fechaDeNacimiento, ReservaData<?> reservaData) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroDeTelefono = numeroDeTelefono;
        this.nacionalidad = nacionalidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.reservaData = reservaData;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }


    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getCorreo() {
        return correo;
    }
}