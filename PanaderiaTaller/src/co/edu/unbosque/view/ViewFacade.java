package co.edu.unbosque.view;

/**
 * ViewFacade es una clase que actúa como fachada para la interfaz de usuario,
 * encapsulando tanto la consola como la ventana principal de la aplicación.
 * Proporciona un acceso simplificado a las distintas vistas de la aplicación.
 * 
 * <p>
 * Ejemplo de uso:
 * </p>
 * 
 * <pre>
 * ViewFacade viewFacade = new ViewFacade();
 * viewFacade.getPrincipal().mostrarPanelMenuPrincipal();
 * </pre>
 * 
 * @author Nicole
 * @version 1.0
 */
public class ViewFacade {
	private Consola con;
	private VentanaPrincipal principal;

	/**
	 * Crea una instancia de ViewFacade y inicializa las vistas de la aplicación.
	 * Crea un objeto de la consola y una ventana principal.
	 */
	public ViewFacade() {
		con = new Consola();
		principal = new VentanaPrincipal();
	}

	/**
	 * Obtiene la instancia de la consola.
	 * 
	 * @return La consola utilizada por la aplicación.
	 */
	public Consola getCon() {
		return con;
	}

	/**
	 * Establece una nueva instancia de la consola.
	 * 
	 * @param con La nueva consola a establecer.
	 */
	public void setCon(Consola con) {
		this.con = con;
	}

	/**
	 * Obtiene la instancia de la ventana principal.
	 * 
	 * @return La ventana principal de la aplicación.
	 */
	public VentanaPrincipal getPrincipal() {
		return principal;
	}

	/**
	 * Establece una nueva instancia de la ventana principal.
	 * 
	 * @param principal La nueva ventana principal a establecer.
	 */
	public void setPrincipal(VentanaPrincipal principal) {
		this.principal = principal;
	}
}
