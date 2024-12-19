package com.booking.Models.Reserva;

import com.booking.Models.Alojamiento.Alojamiento;

import java.util.Date;
import java.util.List;

public interface IReserva {

    public void crearReserva(List<ReservaData> reservaData, Integer cantidadHabitaciones, Date horaDeLlegada);

    public void eliminarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento);

    public void modificarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento);

    public void consultarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento);

    public void buscarAlojamiento(List<Alojamiento> alojamientos);
}