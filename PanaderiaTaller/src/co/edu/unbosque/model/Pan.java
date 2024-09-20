package co.edu.unbosque.model;

public abstract class Pan {
	private int cantidad;
	private String nombre;
	private double peso;
	private double precio;
	private boolean tieneGluten;
	private boolean tieneLevadura;

	public Pan() {
		// TODO Auto-generated constructor stub
	}

	public Pan(int cantidad, String nombre, double peso, double precio, boolean tieneGluten, boolean tieneLevadura) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
		this.tieneGluten = tieneGluten;
		this.tieneLevadura = tieneLevadura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isTieneGluten() {
		return tieneGluten;
	}

	public void setTieneGluten(boolean tieneGluten) {
		this.tieneGluten = tieneGluten;
	}

	public boolean isTieneLevadura() {
		return tieneLevadura;
	}

	public void setTieneLevadura(boolean tieneLevadura) {
		this.tieneLevadura = tieneLevadura;
	}

	@Override
	public String toString() {
		return "\n cantidad: " + cantidad + "\n nombre: " + nombre + " \n peso: " + peso + ", \n precio: " + precio
				+ "\n  tieneGluten: " + tieneGluten + "\n tieneLevadura: " + tieneLevadura + "\n";
	}

}
