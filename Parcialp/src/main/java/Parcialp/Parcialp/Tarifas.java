package Parcialp.Parcialp;

public class Tarifas {
    private String tipoVehiculo;
    private double tarifaPorHora;

    public Tarifas(String tipoVehiculo, double tarifaPorHora) {
        this.tipoVehiculo = tipoVehiculo;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Getters y Setters
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String toString() {
        return "Tarifas{" +
                "tipoVehiculo='" + tipoVehiculo + '\'' +
                ", tarifaPorHora=" + tarifaPorHora +
                '}';
    }
}

