package co.edu.unbosque.model;

/**
 * Clase que representa un tipo específico de pan: Pan Dulce. Extiende la clase
 * abstracta Pan e incluye atributos específicos como si tiene arequipe y el
 * sabor dulce del pan.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class PanDulce extends Pan {

	private boolean tieneArequipe;
	private String saborDulce;

	/**
	 * Constructor por defecto de la clase PanDulce.
	 */
	public PanDulce() {
		// Constructor vacío
	}

	/**
	 * Constructor de la clase PanDulce que inicializa los atributos específicos.
	 *
	 * @param tieneArequipe Indica si el pan dulce tiene arequipe.
	 * @param saborDulce    El sabor del pan dulce.
	 */
	public PanDulce(boolean tieneArequipe, String saborDulce) {
		super();
		this.tieneArequipe = tieneArequipe;
		this.saborDulce = saborDulce;
	}

	/**
	 * Constructor de la clase PanDulce que inicializa todos los atributos,
	 * incluidos los heredados de la clase Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 * @param tieneArequipe Indica si el pan dulce tiene arequipe.
	 * @param saborDulce    El sabor del pan dulce.
	 */
	public PanDulce(int cantidad, String nombre, double peso, double precio, boolean tieneGluten, boolean tieneLevadura,
			boolean tieneArequipe, String saborDulce) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tieneArequipe = tieneArequipe;
		this.saborDulce = saborDulce;
	}

	/**
	 * Constructor de la clase PanDulce que inicializa los atributos de la clase
	 * Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 */
	public PanDulce(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// Constructor vacío
	}

	/**
	 * Indica si el pan dulce tiene arequipe.
	 *
	 * @return true si el pan tiene arequipe, false en caso contrario.
	 */
	public boolean isTieneArequipe() {
		return tieneArequipe;
	}

	/**
	 * Establece si el pan dulce tiene arequipe.
	 *
	 * @param tieneArequipe true si el pan debe tener arequipe, false en caso
	 *                      contrario.
	 */
	public void setTieneArequipe(boolean tieneArequipe) {
		this.tieneArequipe = tieneArequipe;
	}

	/**
	 * Obtiene el sabor del pan dulce.
	 *
	 * @return El sabor del pan dulce.
	 */
	public String getSaborDulce() {
		return saborDulce;
	}

	/**
	 * Establece el sabor del pan dulce.
	 *
	 * @param saborDulce El nuevo sabor del pan dulce.
	 */
	public void setSaborDulce(String saborDulce) {
		this.saborDulce = saborDulce;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos de la clase
	 * PanDulce.
	 *
	 * @return Una cadena que representa el pan dulce.
	 */
	@Override
	public String toString() {
		return super.toString() + "\n tieneArequipe: " + tieneArequipe + "\n  saborDulce: " + saborDulce + "\n";
	}

	/**
	 * Implementa el método abstracto de la clase Pan para definir cómo se prepara
	 * el pan dulce.
	 */
	@Override
	public void preparar() {
		System.out.println("Preparando " + getNombre() + " con ingredientes dulces.");
	}
}
