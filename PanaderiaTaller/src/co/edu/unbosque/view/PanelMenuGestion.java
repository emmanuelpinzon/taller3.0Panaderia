package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * PanelMenuGestion es un panel de la interfaz gráfica que representa el menú de
 * gestión para el sistema. Contiene botones para agregar, mostrar, actualizar,
 * eliminar productos, y volver al menú principal. Además, incluye imágenes de
 * fondo específicas para cada tipo de producto.
 * 
 * Este panel permite a los usuarios gestionar productos de manera intuitiva y
 * eficiente.
 * 
 * <p>
 * Ejemplo de uso:
 * </p>
 * 
 * <pre>
 * PanelMenuGestion panel = new PanelMenuGestion();
 * panel.getBtnAgregar().addActionListener(e -> {
 * 	// Lógica para agregar un nuevo producto
 * });
 * </pre>
 * 
 * @author Tu Nombre
 * @version 1.0
 */
public class PanelMenuGestion extends JPanel {

	private JLabel imagenPanDulce, imagenPanQueso, imagenPanIntegral, imagenPanHojaldrado;
	private JButton btnAgregar, btnMostrar, btnActualizar, btnEliminar, btnVolver;

	/**
	 * Constructor de PanelMenuGestion. Inicializa el panel con botones para las
	 * acciones de gestión y con imágenes de fondo específicas para cada tipo de
	 * producto.
	 */
	public PanelMenuGestion() {
		setLayout(null);
		setVisible(true);
		setSize(1280, 720);

		// Inicialización de botones
		btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(380, 299, 160, 80);
		btnAgregar.setOpaque(false);
		btnAgregar.setActionCommand("AGREGAR");

		btnMostrar = new JButton("mostrar");
		btnMostrar.setBounds(850, 440, 160, 80);
		btnMostrar.setOpaque(false);
		btnMostrar.setActionCommand("MOSTRAR");

		btnActualizar = new JButton("actualizar");
		btnActualizar.setBounds(380, 440, 160, 80);
		btnActualizar.setOpaque(false);
		btnActualizar.setActionCommand("ACTUALIZAR");

		btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(850, 299, 160, 80);
		btnEliminar.setOpaque(false);
		btnEliminar.setActionCommand("ELIMINAR");

		btnVolver = new JButton("volver");
		btnVolver.setBounds(590, 530, 160, 80);
		btnVolver.setOpaque(false);
		btnVolver.setActionCommand("VOLVER");

		// Inicialización de etiquetas de imagen
		imagenPanDulce = crearImagenLabel("src/media/MENUPANDULCE.png");
		imagenPanQueso = crearImagenLabel("src/media/MENUPANQUESO.png");
		imagenPanIntegral = crearImagenLabel("src/media/MENUPANINTEGRALL.png");
		imagenPanHojaldrado = crearImagenLabel("src/media/MENUPANHOJALDRADO.png");

		// Agregando componentes al panel
		add(imagenPanDulce);
		add(imagenPanQueso);
		add(imagenPanIntegral);
		add(imagenPanHojaldrado);
		add(btnAgregar);
		add(btnMostrar);
		add(btnActualizar);
		add(btnEliminar);
		add(btnVolver);
	}

	/**
	 * Crea y devuelve un JLabel con una imagen redimensionada.
	 *
	 * @param ruta La ruta de la imagen a cargar.
	 * @return JLabel con la imagen redimensionada.
	 */
	private JLabel crearImagenLabel(String ruta) {
		JLabel label = new JLabel();
		ImageIcon imagen = new ImageIcon(ruta);
		Image redimensionada = imagen.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(redimensionada));
		label.setVisible(false);
		label.setBounds(0, 0, 1280, 720);
		return label;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan dulce".
	 * 
	 * @return La etiqueta de imagen para "pan dulce".
	 */
	public JLabel getImagenPanDulce() {
		return imagenPanDulce;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan dulce".
	 * 
	 * @param imagenPanDulce La nueva etiqueta de imagen para "pan dulce".
	 */
	public void setImagenPanDulce(JLabel imagenPanDulce) {
		this.imagenPanDulce = imagenPanDulce;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan de queso".
	 * 
	 * @return La etiqueta de imagen para "pan de queso".
	 */
	public JLabel getImagenPanQueso() {
		return imagenPanQueso;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan de queso".
	 * 
	 * @param imagenPanQueso La nueva etiqueta de imagen para "pan de queso".
	 */
	public void setImagenPanQueso(JLabel imagenPanQueso) {
		this.imagenPanQueso = imagenPanQueso;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan integral".
	 * 
	 * @return La etiqueta de imagen para "pan integral".
	 */
	public JLabel getImagenPanIntegral() {
		return imagenPanIntegral;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan integral".
	 * 
	 * @param imagenPanIntegral La nueva etiqueta de imagen para "pan integral".
	 */
	public void setImagenPanIntegral(JLabel imagenPanIntegral) {
		this.imagenPanIntegral = imagenPanIntegral;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan hojaldrado".
	 * 
	 * @return La etiqueta de imagen para "pan hojaldrado".
	 */
	public JLabel getImagenPanHojaldrado() {
		return imagenPanHojaldrado;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan hojaldrado".
	 * 
	 * @param imagenPanHojaldrado La nueva etiqueta de imagen para "pan hojaldrado".
	 */
	public void setImagenPanHojaldrado(JLabel imagenPanHojaldrado) {
		this.imagenPanHojaldrado = imagenPanHojaldrado;
	}

	/**
	 * Obtiene el botón de "agregar" del panel.
	 * 
	 * @return El botón de "agregar".
	 */
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	/**
	 * Establece el botón de "agregar" del panel.
	 * 
	 * @param btnAgregar El nuevo botón de "agregar".
	 */
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	/**
	 * Obtiene el botón de "mostrar" del panel.
	 * 
	 * @return El botón de "mostrar".
	 */
	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	/**
	 * Establece el botón de "mostrar" del panel.
	 * 
	 * @param btnMostrar El nuevo botón de "mostrar".
	 */
	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	/**
	 * Obtiene el botón de "actualizar" del panel.
	 * 
	 * @return El botón de "actualizar".
	 */
	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	/**
	 * Establece el botón de "actualizar" del panel.
	 * 
	 * @param btnActualizar El nuevo botón de "actualizar".
	 */
	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	/**
	 * Obtiene el botón de "eliminar" del panel.
	 * 
	 * @return El botón de "eliminar".
	 */
	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	/**
	 * Establece el botón de "eliminar" del panel.
	 * 
	 * @param btnEliminar El nuevo botón de "eliminar".
	 */
	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	/**
	 * Obtiene el botón de "volver" del panel.
	 * 
	 * @return El botón de "volver".
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

	/**
	 * Establece el botón de "volver" del panel.
	 * 
	 * @param btnVolver El nuevo botón de "volver".
	 */
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
}
