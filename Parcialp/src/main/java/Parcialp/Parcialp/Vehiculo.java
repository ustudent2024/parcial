package Parcialp.Parcialp;

	public class Vehiculo {
	    private String placa;
	    private String tipo;
	    private String color;
	    private String ubicacion;

	    public Vehiculo(String placa, String tipo, String color, String ubicacion) {
	        this.placa = placa;
	        this.tipo = tipo;
	        this.color = color;
	        this.ubicacion = ubicacion;
	    }

	    // Getters y Setters
	    public String getPlaca() {
	        return placa;
	    }

	    public void setPlaca(String placa) {
	        this.placa = placa;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getUbicacion() {
	        return ubicacion;
	    }

	    public void setUbicacion(String ubicacion) {
	        this.ubicacion = ubicacion;
	    }

	    @Override
	    public String toString() {
	        return "Vehiculo{" +
	                "placa='" + placa + '\'' +
	                ", tipo='" + tipo + '\'' +
	                ", color='" + color + '\'' +
	                ", ubicacion='" + ubicacion + '\'' +
	                '}';
	    }
	}

