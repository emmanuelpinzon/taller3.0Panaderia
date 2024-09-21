package co.edu.unbosque.model;

public class PanQuesoDTO extends PanDTO {

	private String tipoQueso;
	private boolean esGratinado;
	
	public PanQuesoDTO() {
		// TODO Auto-generated constructor stub
	}

	public PanQuesoDTO(String tipoQueso, boolean esGratinado) {
		super();
		this.tipoQueso = tipoQueso;
		this.esGratinado = esGratinado;
	}

	public PanQuesoDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, String tipoQueso, boolean esGratinado) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tipoQueso = tipoQueso;
		this.esGratinado = esGratinado;
	}

	public PanQuesoDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// TODO Auto-generated constructor stub
	}

	public String getTipoQueso() {
		return tipoQueso;
	}

	public void setTipoQueso(String tipoQueso) {
		this.tipoQueso = tipoQueso;
	}

	public boolean isEsGratinado() {
		return esGratinado;
	}

	public void setEsGratinado(boolean esGratinado) {
		this.esGratinado = esGratinado;
	}

	@Override
	public String toString() {
		return  super.toString()+"\n tipoQueso: " + tipoQueso + " \n esGratinado: " + esGratinado + "\n";
	}


}
