package co.edu.unbosque.model;

/**
 * Clase abstracta que representa un tipo de pan. Contiene atributos comunes a
 * todos los tipos de pan, así como métodos para acceder y modificar esos
 * atributos.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public abstract class Pan {
	private int cantidad;
	private String nombre;
	private double peso;
	private double precio;
	private boolean tieneGluten;
	private boolean tieneLevadura;

	/**
	 * Constructor por defecto de la clase Pan.
	 */
	public Pan() {
		// Constructor vacío
	}

	/**
	 * Constructor de la clase Pan que inicializa todos los atributos.
	 *
	 * @param cantidad      La cantidad de pan.
	 * @param nombre        El nombre del pan.
	 * @param peso          El peso del pan.
	 * @param precio        El precio del pan.
	 * @param tieneGluten   Indica si el pan contiene gluten.
	 * @param tieneLevadura Indica si el pan contiene levadura.
	 */
	public Pan(int cantidad, String nombre, double peso, double precio, boolean tieneGluten, boolean tieneLevadura) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
		this.tieneGluten = tieneGluten;
		this.tieneLevadura = tieneLevadura;
	}

	/**
	 * Obtiene la cantidad de pan.
	 *
	 * @return La cantidad de pan.
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * Establece la cantidad de pan.
	 *
	 * @param cantidad La nueva cantidad de pan.
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Obtiene el nombre del pan.
	 *
	 * @return El nombre del pan.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del pan.
	 *
	 * @param nombre El nuevo nombre del pan.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el peso del pan.
	 *
	 * @return El peso del pan.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Establece el peso del pan.
	 *
	 * @param peso El nuevo peso del pan.
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene el precio del pan.
	 *
	 * @return El precio del pan.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del pan.
	 *
	 * @param precio El nuevo precio del pan.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Indica si el pan contiene gluten.
	 *
	 * @return true si el pan contiene gluten, false en caso contrario.
	 */
	public boolean isTieneGluten() {
		return tieneGluten;
	}

	/**
	 * Establece si el pan contiene gluten.
	 *
	 * @param tieneGluten true si el pan debe contener gluten, false en caso
	 *                    contrario.
	 */
	public void setTieneGluten(boolean tieneGluten) {
		this.tieneGluten = tieneGluten;
	}

	/**
	 * Indica si el pan contiene levadura.
	 *
	 * @return true si el pan contiene levadura, false en caso contrario.
	 */
	public boolean isTieneLevadura() {
		return tieneLevadura;
	}

	/**
	 * Establece si el pan contiene levadura.
	 *
	 * @param tieneLevadura true si el pan debe contener levadura, false en caso
	 *                      contrario.
	 */
	public void setTieneLevadura(boolean tieneLevadura) {
		this.tieneLevadura = tieneLevadura;
	}

	/**
	 * Devuelve una representación en forma de cadena de los atributos de la clase
	 * Pan.
	 *
	 * @return Una cadena que representa el pan.
	 */
	@Override
	public String toString() {
	    return "\n╔════════════════════════════════════════╗\n" +
	           "║            📦 Producto                 ║\n" +
	           "╚════════════════════════════════════════╝\n" +
	           "🔹 Cantidad      : " + cantidad + "\n" +
	           "🔹 Nombre        : " + nombre + "\n" +
	           "🔹 Peso          : " + peso + " g\n" +
	           "🔹 Precio        : $" + precio + "\n" +
	           "🔹 Tiene Gluten  : " + (tieneGluten ? "Sí" : "No") + "\n" +
	           "🔹 Tiene Levadura: " + (tieneLevadura ? "Sí" : "No") + "\n";

	}



	/**
	 * Método abstracto que debe ser implementado por las clases hijas para definir
	 * cómo se prepara el pan.
	 */
	public abstract void preparar();
}
