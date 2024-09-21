package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * PanelMenuPrincipal es un panel de la interfaz gráfica que representa el menú
 * principal de la aplicación. Contiene botones para acceder a diferentes
 * secciones del sistema.
 * 
 * @author Emmanuel Pinzon y Nicole Cruz
 * @version 1.0
 */
public class PanelMenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnPanDulce, btnPanQueso, btnPanHojaldrado, btnPanIntegral;

	/**
	 * Constructor de PanelMenuPrincipal. Inicializa el panel con una imagen de
	 * fondo y botones para las distintas secciones del sistema.
	 */
	public PanelMenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		imagenPpal = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/MENUPRINCIPAL.png");
		Image redimensionado = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		btnPanDulce = new JButton("panDulce");
		btnPanDulce.setBounds(350, 328, 300, 110);
		btnPanDulce.setOpaque(false);
		btnPanDulce.setActionCommand("PANDULCE");

		btnPanQueso = new JButton("panQueso ");
		btnPanQueso.setBounds(700, 338, 300, 100);
		btnPanQueso.setOpaque(false);
		btnPanQueso.setActionCommand("PANQUESO");

		btnPanIntegral = new JButton("panIntegral");
		btnPanIntegral.setBounds(350, 470, 300, 100);
		btnPanIntegral.setOpaque(false);
		btnPanIntegral.setActionCommand("PANINTEGRAL");

		btnPanHojaldrado = new JButton("panHojaldrado");
		btnPanHojaldrado.setBounds(690, 470, 300, 100);
		btnPanHojaldrado.setOpaque(false);
		btnPanHojaldrado.setActionCommand("PANHOJALDRADO");

		add(imagenPpal);
		add(btnPanDulce);
		add(btnPanQueso);
		add(btnPanIntegral);
		add(btnPanHojaldrado);
	}

	/**
	 * Obtiene la etiqueta de imagen de fondo del panel.
	 * 
	 * @return La etiqueta de imagen de fondo.
	 */
	public JLabel getImagenPpal() {
		return imagenPpal;
	}

	/**
	 * Establece la etiqueta de imagen de fondo del panel.
	 * 
	 * @param imagenPpal La nueva etiqueta de imagen de fondo.
	 */
	public void setImagenPpal(JLabel imagenPpal) {
		this.imagenPpal = imagenPpal;
	}

	/**
	 * Obtiene el botón de "Pan Dulce" del panel.
	 * 
	 * @return El botón de "Pan Dulce".
	 */
	public JButton getbtnPanDulce() {
		return btnPanDulce;
	}

	/**
	 * Establece el botón de "Pan Dulce" del panel.
	 * 
	 * @param btnPanDulce El nuevo botón de "Pan Dulce".
	 */
	public void setbtnPanDulce(JButton btnPanDulce) {
		this.btnPanDulce = btnPanDulce;
	}

	/**
	 * Obtiene el botón de "Pan Queso" del panel.
	 * 
	 * @return El botón de "Pan Queso".
	 */
	public JButton getbtnPanQueso() {
		return btnPanQueso;
	}

	/**
	 * Establece el botón de "Pan Queso" del panel.
	 * 
	 * @param btnPanQueso El nuevo botón de "Pan Queso".
	 */
	public void setbtnPanQueso(JButton btnPanQueso) {
		this.btnPanQueso = btnPanQueso;
	}

	/**
	 * Obtiene el botón de "Pan Hojaldrado" del panel.
	 * 
	 * @return El botón de "Pan Hojaldrado".
	 */
	public JButton getbtnPanHojaldrado() {
		return btnPanHojaldrado;
	}

	/**
	 * Establece el botón de "Pan Hojaldrado" del panel.
	 * 
	 * @param btnPanHojaldrado El nuevo botón de "Pan Hojaldrado".
	 */
	public void setbtnPanHojaldrado(JButton btnPanHojaldrado) {
		this.btnPanHojaldrado = btnPanHojaldrado;
	}

	/**
	 * Obtiene el botón de "Pan Integral" del panel.
	 * 
	 * @return El botón de "Pan Integral".
	 */
	public JButton getbtnPanIntegral() {
		return btnPanIntegral;
	}

	/**
	 * Establece el botón de "Pan Integral" del panel.
	 * 
	 * @param btnPanIntegral El nuevo botón de "Pan Integral".
	 */
	public void setbtnPanIntegral(JButton btnPanIntegral) {
		this.btnPanIntegral = btnPanIntegral;
	}
}
