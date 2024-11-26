package Parcialp.Parcialp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaParqueadero {
    private List<RegistroParqueo> registros;

    public SistemaParqueadero() {
        this.registros = new ArrayList<>();
    }

    // Método para registrar entrada
    public void registrarEntrada(Vehiculo vehiculo) {
        RegistroParqueo nuevoRegistro = new RegistroParqueo(vehiculo, LocalDateTime.now());
        registros.add(nuevoRegistro);
        System.out.println("Entrada registrada para el vehículo: " + vehiculo);
    }

    // Método para registrar salida
    public void registrarSalida(String placa) {
        for (RegistroParqueo registro : registros) {
            if (registro.getVehiculo().getPlaca().equals(placa) && registro.getHoraSalida() == null) {
                registro.setHoraSalida(LocalDateTime.now());
                System.out.println("Salida registrada para el vehículo con placa: " + placa);
                return;
            }
        }
        System.out.println("No se encontró un registro de entrada activo para la placa: " + placa);
    }

    // Método para listar registros
    public void mostrarRegistros() {
        System.out.println("Registros del parqueadero:");
        for (RegistroParqueo registro : registros) {
            System.out.println(registro);
        }
    }

    public List<RegistroParqueo> getRegistros() {
        return registros;
    }
}


