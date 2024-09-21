package co.edu.unbosque.model;

public class PanDulceDTO extends PanDTO {

	private boolean tieneArequipe;
	private String saborDulce;

	public PanDulceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PanDulceDTO(boolean tieneArequipe, String saborDulce) {
		super();
		this.tieneArequipe = tieneArequipe;
		this.saborDulce = saborDulce;
	}

	public PanDulceDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, boolean tieneArequipe, String saborDulce) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tieneArequipe = tieneArequipe;
		this.saborDulce = saborDulce;
	}

	public PanDulceDTO(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// TODO Auto-generated constructor stub
	}

	public boolean isTieneArequipe() {
		return tieneArequipe;
	}

	public void setTieneArequipe(boolean tieneArequipe) {
		this.tieneArequipe = tieneArequipe;
	}

	public String getSaborDulce() {
		return saborDulce;
	}

	public void setSaborDulce(String saborDulce) {
		this.saborDulce = saborDulce;
	}

	@Override
	public String toString() {
		return  super.toString()+"\n tieneArequipe: " + tieneArequipe + "\n  saborDulce: " + saborDulce + "\n";
	}

}
