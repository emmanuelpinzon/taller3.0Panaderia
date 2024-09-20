package co.edu.unbosque.model;

public class PanIntegral extends Pan {

	private boolean tieneSieteGranos;
	private boolean tieneFrutosSecos;

	public PanIntegral() {
		// TODO Auto-generated constructor stub
	}

	public PanIntegral(boolean tieneSieteGranos, boolean tieneFrutosSecos) {
		super();
		this.tieneSieteGranos = tieneSieteGranos;
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	public PanIntegral(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, boolean tieneSieteGranos, boolean tieneFrutosSecos) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tieneSieteGranos = tieneSieteGranos;
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	public PanIntegral(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// TODO Auto-generated constructor stub
	}

	public boolean isTieneSieteGranos() {
		return tieneSieteGranos;
	}

	public void setTieneSieteGranos(boolean tieneSieteGranos) {
		this.tieneSieteGranos = tieneSieteGranos;
	}

	public boolean isTieneFrutosSecos() {
		return tieneFrutosSecos;
	}

	public void setTieneFrutosSecos(boolean tieneFrutosSecos) {
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	@Override
	public String toString() {
		return super.toString()+"\n tieneSieteGranos: " + tieneSieteGranos + "\n  tieneFrutosSecos: " + tieneFrutosSecos + "\n";
	}

	
}
