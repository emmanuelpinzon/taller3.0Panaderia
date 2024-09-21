package co.edu.unbosque.model;

/**
 * Clase que representa un tipo específico de pan: Pan Queso. Extiende la clase
 * abstracta Pan e incluye atributos específicos como el tipo de queso y si está
 * gratinado.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class PanQueso extends Pan {

	private String tipoQueso;
	private boolean esGratinado;

	/**
	 * Constructor por defecto de la clase PanQueso.
	 */
	public PanQueso() {
		// Constructor vacío
	}

	/**
	 * Constructor de la clase PanQueso que inicializa los atributos específicos.
	 *
	 * @param tipoQueso   Indica el tipo de queso utilizado en el pan.
	 * @param esGratinado Indica si el pan está gratinado.
	 */
	public PanQueso(String tipoQueso, boolean esGratinado) {
		super();
		this.tipoQueso = tipoQueso;
		this.esGratinado = esGratinado;
	}

	/**
	 * Constructor de la clase PanQueso que inicializa todos los atributos,
	 * incluidos los heredados de la clase Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 * @param tipoQueso     Indica el tipo de queso utilizado en el pan.
	 * @param esGratinado   Indica si el pan está gratinado.
	 */
	public PanQueso(int cantidad, String nombre, double peso, double precio, boolean tieneGluten, boolean tieneLevadura,
			String tipoQueso, boolean esGratinado) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		this.tipoQueso = tipoQueso;
		this.esGratinado = esGratinado;
	}

	/**
	 * Constructor de la clase PanQueso que inicializa los atributos de la clase
	 * Pan.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 */
	public PanQueso(int cantidad, String nombre, double peso, double precio, boolean tieneGluten,
			boolean tieneLevadura) {
		super(cantidad, nombre, peso, precio, tieneGluten, tieneLevadura);
		// Constructor vacío
	}

	/**
	 * Obtiene el tipo de queso utilizado en el pan.
	 *
	 * @return El tipo de queso.
	 */
	public String getTipoQueso() {
		return tipoQueso;
	}

	/**
	 * Establece el tipo de queso utilizado en el pan.
	 *
	 * @param tipoQueso El tipo de queso a establecer.
	 */
	public void setTipoQueso(String tipoQueso) {
		this.tipoQueso = tipoQueso;
	}

	/**
	 * Indica si el pan está gratinado.
	 *
	 * @return true si el pan está gratinado, false en caso contrario.
	 */
	public boolean isEsGratinado() {
		return esGratinado;
	}

	/**
	 * Establece si el pan está gratinado.
	 *
	 * @param esGratinado true si el pan debe estar gratinado, false en caso
	 *                    contrario.
	 */
	public void setEsGratinado(boolean esGratinado) {
		this.esGratinado = esGratinado;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos de la clase
	 * PanQueso.
	 *
	 * @return Una cadena que representa el pan de queso.
	 */
	@Override
	public String toString() {
		return super.toString() + "\n tipoQueso: " + tipoQueso + " \n esGratinado: " + esGratinado + "\n";
	}

	/**
	 * Implementa el método abstracto de la clase Pan para definir cómo se prepara
	 * el pan de queso.
	 */
	@Override
	public void preparar() {
		System.out.println("Preparando " + getNombre() + " con queso.");
	}
}
