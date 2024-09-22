package co.edu.unbosque.model;

import java.io.Serializable;

/**
 * Clase que representa un tipo específico de pan: Pan Integral. Extiende la
 * clase abstracta Pan e incluye atributos específicos como si tiene siete
 * granos y si contiene frutos secos.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class PanIntegral extends Pan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean tieneSieteGranos;
	private boolean tieneFrutosSecos;

	/**
	 * Constructor por defecto de la clase PanIntegral.
	 */
	public PanIntegral() {
		// Constructor vacío
	}

	/**
	 * Constructor de la clase PanIntegral que inicializa los atributos específicos.
	 *
	 * @param tieneSieteGranos Indica si el pan integral contiene siete granos.
	 * @param tieneFrutosSecos Indica si el pan integral contiene frutos secos.
	 */
	public PanIntegral(boolean tieneSieteGranos, boolean tieneFrutosSecos) {
		super();
		this.tieneSieteGranos = tieneSieteGranos;
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	/**
	 * Constructor de la clase PanIntegral que inicializa todos los atributos,
	 * incluidos los heredados de la clase Pan.
	 *
	 * @param cantidad         La cantidad de pan.
	 * @param nombre           El nombre del pan.
	 * @param peso             El peso del pan.
	 * @param precio           El precio del pan.
	 * @param tieneGluten      Indica si el pan contiene gluten.
	 * @param tieneLevadura    Indica si el pan contiene levadura.
	 * @param tieneSieteGranos Indica si el pan integral contiene siete granos.
	 * @param tieneFrutosSecos Indica si el pan integral contiene frutos secos.
	 */
	public PanIntegral(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura, boolean tieneSieteGranos, boolean tieneFrutosSecos) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tieneSieteGranos = tieneSieteGranos;
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	/**
	 * Constructor de la clase PanIntegral que inicializa los atributos de la clase
	 * Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 */
	public PanIntegral(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// Constructor vacío
	}

	/**
	 * Indica si el pan integral contiene siete granos.
	 *
	 * @return true si el pan contiene siete granos, false en caso contrario.
	 */
	public boolean isTieneSieteGranos() {
		return tieneSieteGranos;
	}

	/**
	 * Establece si el pan integral contiene siete granos.
	 *
	 * @param tieneSieteGranos true si el pan debe contener siete granos, false en
	 *                         caso contrario.
	 */
	public void setTieneSieteGranos(boolean tieneSieteGranos) {
		this.tieneSieteGranos = tieneSieteGranos;
	}

	/**
	 * Indica si el pan integral contiene frutos secos.
	 *
	 * @return true si el pan contiene frutos secos, false en caso contrario.
	 */
	public boolean isTieneFrutosSecos() {
		return tieneFrutosSecos;
	}

	/**
	 * Establece si el pan integral contiene frutos secos.
	 *
	 * @param tieneFrutosSecos true si el pan debe contener frutos secos, false en
	 *                         caso contrario.
	 */
	public void setTieneFrutosSecos(boolean tieneFrutosSecos) {
		this.tieneFrutosSecos = tieneFrutosSecos;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos de la clase
	 * PanIntegral.
	 *
	 * @return Una cadena que representa el pan integral.
	 */
	@Override
	public String toString() {
	    return "\n╔════════════════════════════════════════╗\n" +
		          "         🍞 Pan Integral 🌾             \n" +
		           "╚══════════════════════════════════════╝\n" + super.toString() +  // Llama al toString() de la clase padre
	           "🔹 ¿Tiene Siete Granos?  : " + (tieneSieteGranos ? "Sí" : "No") + "\n" +
	           "🔹 ¿Tiene Frutos Secos?  : " + (tieneFrutosSecos ? "Sí" : "No") + "\n" +
	           "═════════════════════════════════════════\n";
	}


	/**
	 * Implementa el método abstracto de la clase Pan para definir cómo se prepara
	 * el pan integral.
	 */
	@Override
	public void preparar() {
		System.out.println("Preparando " + getNombre() + " con harina integral.");
	}
}
