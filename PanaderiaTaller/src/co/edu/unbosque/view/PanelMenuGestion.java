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

		imagenPanDulce = new JLabel();
		ImageIcon imagenCarnea = new ImageIcon("src/media/MENUPANDULCE.png");
		Image redimensionado = imagenCarnea.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPanDulce.setIcon(new ImageIcon(redimensionado));
		imagenPanDulce.setVisible(false);
		imagenPanDulce.setBounds(0, 0, 1280, 720);

		imagenPanQueso = new JLabel();
		ImageIcon imagenFVa = new ImageIcon("src/media/MENUPANQUESO.png");
		Image redimensionado2 = imagenFVa.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPanQueso.setIcon(new ImageIcon(redimensionado2));
		imagenPanQueso.setVisible(false);
		imagenPanQueso.setBounds(0, 0, 1280, 720);

		
		imagenPanIntegral = new JLabel();
		ImageIcon imagenJuguetea = new ImageIcon("src/media/MENUPANINTEGRALL.png");
		Image redimensionado3 = imagenJuguetea.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPanIntegral.setIcon(new ImageIcon(redimensionado3));
		imagenPanIntegral.setVisible(false);
		imagenPanIntegral.setBounds(0, 0, 1280, 720);
		
		imagenPanHojaldrado = new JLabel();
		ImageIcon imagenPana = new ImageIcon("src/media/MENUPANHOJALDRADO.png");
		Image redimensionado4 = imagenPana.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPanHojaldrado.setIcon(new ImageIcon(redimensionado4));
		imagenPanHojaldrado.setVisible(false);
		imagenPanHojaldrado.setBounds(0, 0, 1280, 720);



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
	 * Obtiene la etiqueta de imagen para el tipo de producto "carne".
	 * 
	 * @return La etiqueta de imagen para "carne".
	 */
	public JLabel getImagenPanDulce() {
		return imagenPanDulce;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "carne".
	 * 
	 * @param imagenCarne La nueva etiqueta de imagen para "carne".
	 */
	public void setImagenPanDulce(JLabel imagenPanDulce) {
		this.imagenPanDulce = imagenPanDulce;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "fruta y verdura".
	 * 
	 * @return La etiqueta de imagen para "fruta y verdura".
	 */
	public JLabel getImagenPanQueso() {
		return imagenPanQueso;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "fruta y verdura".
	 * 
	 * @param imagenFV La nueva etiqueta de imagen para "fruta y verdura".
	 */
	public void setImagenPanQueso(JLabel imagenPanQueso) {
		this.imagenPanQueso = imagenPanQueso;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "juguete".
	 * 
	 * @return La etiqueta de imagen para "juguete".
	 */
	public JLabel getImagenPanIntegral() {
		return imagenPanIntegral;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "juguete".
	 * 
	 * @param imagenJuguete La nueva etiqueta de imagen para "juguete".
	 */
	public void setImagenJuguete(JLabel imagenPanIntegral) {
		this.imagenPanIntegral = imagenPanIntegral;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan".
	 * 
	 * @return La etiqueta de imagen para "pan".
	 */
	public JLabel getImagenPanHojaldrado() {
		return imagenPanHojaldrado;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan".
	 * 
	 * @param imagenPan La nueva etiqueta de imagen para "pan".
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
