package Parcialp.Parcialp;

import java.util.List;
import java.time.LocalDateTime;

public class RegistroParqueo {
    private Vehiculo vehiculo; // Relación con la clase Vehiculo
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public RegistroParqueo(Vehiculo vehiculo, LocalDateTime horaEntrada) {
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = null; // Inicialmente no hay hora de salida
    }

    // Getters y Setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "RegistroParqueo{" +
                "vehiculo=" + vehiculo +
                ", horaEntrada=" + horaEntrada +
                ", horaSalida=" + horaSalida +
                '}';
    }
}


