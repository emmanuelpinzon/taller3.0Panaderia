package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * VentanaPrincipal es la clase que representa la ventana principal de la
 * aplicación. Esta clase extiende JFrame y contiene los paneles necesarios para
 * la navegación dentro de la aplicación, incluyendo el menú principal, el menú
 * de gestión y un panel de entrada.
 * 
 * <p>
 * Ejemplo de uso:
 * </p>
 * 
 * <pre>
 * VentanaPrincipal ventana = new VentanaPrincipal();
 * ventana.mostrarPanelMenuPrincipal();
 * </pre>
 * 
 * @author Nicole
 * @version 1.0
 */
public class VentanaPrincipal extends JFrame {
	private PanelMenuPrincipal menuPpal;
	private PanelMenuGestion menuGestion;
	private PanelEntrada panelEntrada;

	/**
	 * Crea una instancia de VentanaPrincipal y configura sus propiedades iniciales.
	 * Configura el tamaño, posición, comportamiento de cierre, y otros ajustes
	 * básicos de la ventana. También inicializa los paneles utilizados en la
	 * ventana.
	 */
	public VentanaPrincipal() {
		setLocation(70, 70);
		setSize(1280, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setVisible(true);

		setTitle("MENU PRINCIPAL");

		ImageIcon logo = new ImageIcon("src/media/logoPanaderia.png");
		setIconImage(logo.getImage());

		menuPpal = new PanelMenuPrincipal();
		menuGestion = new PanelMenuGestion();
		panelEntrada = new PanelEntrada();
	}

	/**
	 * Muestra el panel de menú principal en la ventana.
	 */
	public void mostrarPanelMenuPrincipal() {
		setContentPane(menuPpal);
		revalidate();
		repaint();
	}

	/**
	 * Muestra el panel de menú de gestión en la ventana.
	 */
	public void mostrarPanelMenuGestion() {
		setContentPane(menuGestion);
		revalidate();
		repaint();
	}

	/**
	 * Muestra el panel de entrada en la ventana.
	 */
	public void mostrarPanelEntrada() {
		setContentPane(panelEntrada);
		revalidate();
		repaint();
	}

	/**
	 * Obtiene el panel de menú principal.
	 * 
	 * @return El panel de menú principal.
	 */
	public PanelMenuPrincipal getMenuPpal() {
		return menuPpal;
	}

	/**
	 * Obtiene el panel de menú de gestión.
	 * 
	 * @return El panel de menú de gestión.
	 */
	public PanelMenuGestion getMenuGestion() {
		return menuGestion;
	}

	/**
	 * Obtiene el panel de entrada.
	 * 
	 * @return El panel de entrada.
	 */
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
}
