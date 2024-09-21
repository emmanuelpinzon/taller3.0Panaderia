package co.edu.unbosque.model;

/**
 * Clase que representa un tipo específico de pan: Pan Hojaldrado. Extiende la
 * clase abstracta Pan e incluye atributos específicos como si es un croissant y
 * si tiene carne.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class PanHojaldrado extends Pan {

	private boolean esCroissant;
	private boolean tieneCarne;

	/**
	 * Constructor por defecto de la clase PanHojaldrado.
	 */
	public PanHojaldrado() {
		// Constructor vacío
	}

	/**
	 * Constructor de la clase PanHojaldrado que inicializa los atributos
	 * específicos.
	 *
	 * @param esCroissant Indica si el pan hojaldrado es un croissant.
	 * @param tieneCarne  Indica si el pan hojaldrado tiene carne.
	 */
	public PanHojaldrado(boolean esCroissant, boolean tieneCarne) {
		super();
		this.esCroissant = esCroissant;
		this.tieneCarne = tieneCarne;
	}

	/**
	 * Constructor de la clase PanHojaldrado que inicializa todos los atributos,
	 * incluidos los heredados de la clase Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 * @param esCroissant   Indica si el pan hojaldrado es un croissant.
	 * @param tieneCarne    Indica si el pan hojaldrado tiene carne.
	 */
	public PanHojaldrado(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, boolean esCroissant, boolean tieneCarne) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.esCroissant = esCroissant;
		this.tieneCarne = tieneCarne;
	}

	/**
	 * Constructor de la clase PanHojaldrado que inicializa los atributos de la
	 * clase Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 */
	public PanHojaldrado(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// Constructor vacío
	}

	/**
	 * Indica si el pan hojaldrado es un croissant.
	 *
	 * @return true si el pan es un croissant, false en caso contrario.
	 */
	public boolean isEsCroissant() {
		return esCroissant;
	}

	/**
	 * Establece si el pan hojaldrado es un croissant.
	 *
	 * @param esCroissant true si el pan debe ser un croissant, false en caso
	 *                    contrario.
	 */
	public void setEsCroissant(boolean esCroissant) {
		this.esCroissant = esCroissant;
	}

	/**
	 * Indica si el pan hojaldrado tiene carne.
	 *
	 * @return true si el pan tiene carne, false en caso contrario.
	 */
	public boolean isTieneCarne() {
		return tieneCarne;
	}

	/**
	 * Establece si el pan hojaldrado tiene carne.
	 *
	 * @param tieneCarne true si el pan debe tener carne, false en caso contrario.
	 */
	public void setTieneCarne(boolean tieneCarne) {
		this.tieneCarne = tieneCarne;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos de la clase
	 * PanHojaldrado.
	 *
	 * @return Una cadena que representa el pan hojaldrado.
	 */
	@Override
	public String toString() {
	    return "\n🥐 Pan Hojaldrado 🍞" + super.toString() +  // Llama al toString() de la clase padre
	           "🔹 ¿Es Croissant?   : " + (esCroissant ? "Sí" : "No") + "\n" +
	           "🔹 ¿Tiene Carne?    : " + (tieneCarne ? "Sí" : "No") + "\n" +
	           "═════════════════════════════════════════\n";
	}


	/**
	 * Implementa el método abstracto de la clase Pan para definir cómo se prepara
	 * el pan hojaldrado.
	 */
	@Override
	public void preparar() {
		System.out.println("Preparando " + getNombre() + " con varias capas de hojaldre.");
	}
}
