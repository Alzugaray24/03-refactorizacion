package com.booking.Models.Reserva;

import com.booking.Models.Alojamiento.Alojamiento;
import com.booking.Models.Alojamiento.DiaDeSol;

import java.util.Date;
import java.util.List;

public class ReservaImplementacion implements IReserva {
    private Date horaDeLlegada;
    private Integer cantidadHabitaciones;
    private List<ReservaData> reservaData;

    public ReservaImplementacion() {
    }

    public ReservaImplementacion(Date horaDeLlegada, Integer cantidadHabitaciones, List<ReservaData> reservaData) {
        this.horaDeLlegada = horaDeLlegada;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.reservaData = reservaData;
    }


    @Override
    public void crearReserva(List<ReservaData> reservaData, Integer cantidadHabitaciones, Date horaDeLlegada) {
        for (ReservaData reserva : reservaData) {
            Alojamiento alojamiento = (Alojamiento) reserva.getAlojamiento();

            alojamiento.agregarReserva(reserva);
        }
    }

    @Override
    public void eliminarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento) {
        reservaData.removeIf(reserva ->
                reserva.getUsuario().getCorreo().equalsIgnoreCase(correo) &&
                        reserva.getUsuario().getFechaDeNacimiento().equals(fechaNacimiento)
        );
        System.out.println("Reserva eliminada con éxito, si existía.");
    }

    @Override
    public void consultarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento) {
        for (ReservaData reserva : reservaData) {
            if (reserva.getUsuario().getCorreo().equalsIgnoreCase(correo) &&
                    reserva.getUsuario().getFechaDeNacimiento().equals(fechaNacimiento)) {
                System.out.println("Datos de la reserva encontrada:");
                reserva.mostrarInformacionReserva();
                return;
            }
        }
        System.out.println("No se encontró una reserva con los datos proporcionados.");
    }

    @Override
    public void modificarReserva(List<ReservaData> reservaData, String correo, Date fechaNacimiento) {
        for (ReservaData reserva : reservaData) {
            if (reserva.getUsuario().getCorreo().equalsIgnoreCase(correo) &&
                    reserva.getUsuario().getFechaDeNacimiento().equals(fechaNacimiento)) {
                System.out.println("Datos actuales de la reserva:");
                reserva.mostrarInformacionReserva();

                reserva.getUsuario().setNumeroDeTelefono("Nuevo número de teléfono");
                System.out.println("Reserva modificada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró una reserva con los datos proporcionados.");
    }

    @Override
    public void buscarAlojamiento(List<Alojamiento> alojamientos) {
        List<String> tiposPermitidos = List.of("Hotel", "Apartamento", "Finca", "DiaDeSol");

        for (Alojamiento alojamiento : alojamientos) {
            if (!tiposPermitidos.contains(alojamiento.getTipoAlojamiento())) {
                throw new IllegalArgumentException("Tipo de alojamiento no permitido: " + alojamiento.getTipoAlojamiento());
            }

            System.out.println("Información del alojamiento:");
            alojamiento.mostrarInformacion();
            System.out.println("------------------------------------------------------------");
        }
    }

}