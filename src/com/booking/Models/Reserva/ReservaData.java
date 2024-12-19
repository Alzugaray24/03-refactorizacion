package com.booking.Models.Reserva;

public class ReservaData<T> {

    private Cliente usuario;
    private T alojamiento;

    public ReservaData() {
    }

    public ReservaData(Cliente usuario, T alojamiento) {
        this.usuario = usuario;
        this.alojamiento = alojamiento;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public T getAlojamiento() {
        return alojamiento;
    }

    public void mostrarInformacionReserva() {
        System.out.println("Información de la Reserva:");
        System.out.println("Cliente: " + usuario.getNombreCompleto());
        System.out.println("Detalles del Alojamiento: " + alojamiento.toString());
    }

    public Cliente getUsuario() {
        return usuario;
    }
}