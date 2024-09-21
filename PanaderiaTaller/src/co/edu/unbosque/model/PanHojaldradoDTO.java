package co.edu.unbosque.model;

public class PanHojaldradoDTO extends PanDTO {

	 private boolean  esCroissant;
	 private boolean tieneCarne;
	 

	public PanHojaldradoDTO() {
		// TODO Auto-generated constructor stub
	}


	public PanHojaldradoDTO(boolean esCroissant, boolean tieneCarne) {
		super();
		this.esCroissant = esCroissant;
		this.tieneCarne = tieneCarne;
	}


	public PanHojaldradoDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, boolean esCroissant, boolean tieneCarne) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.esCroissant = esCroissant;
		this.tieneCarne = tieneCarne;
	}


	public PanHojaldradoDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// TODO Auto-generated constructor stub
	}
	public boolean isEsCroissant() {
		return esCroissant;
	}

	public void setEsCroissant(boolean esCroissant) {
		this.esCroissant = esCroissant;
	}

	public boolean isTieneCarne() {
		return tieneCarne;
	}

	public void setTieneCarne(boolean tieneCarne) {
		this.tieneCarne = tieneCarne;
	}

	@Override
	public String toString() {
		return super.toString()+"\n esCroissant: " + esCroissant + "\n  tieneCarne:" + tieneCarne + "\n";
	}
	

}
