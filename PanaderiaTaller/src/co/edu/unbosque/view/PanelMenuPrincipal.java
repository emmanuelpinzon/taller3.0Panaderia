package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

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
		ImageIcon imagen1 = new ImageIcon("src/media/IMAGEN MENU PRINCIPAL PANES.png");
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

		btnPanIntegral = new JButton("panIntegral");//Disminuir Y = El botón sube.Aumentar Y = El botón baja.
// disminuir x= izquierda. aumentar x= derecha
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
	 * Obtiene el botón de "carnes" del panel.
	 * 
	 * @return El botón de "carnes".
	 */
	public JButton getbtnPanDulce() {
		return btnPanDulce;
	}

	/**
	 * Establece el botón de "carnes" del panel.
	 * 
	 * @param btnPanIntegralCoco El nuevo botón de "carnes".
	 */
	public void setbtnPanIntegralCoco(JButton btnPanDulce) {
		this.btnPanDulce = btnPanDulce;
	}

	/**
	 * Obtiene el botón de "fruta y verdura" del panel.
	 * 
	 * @return El botón de "fruta y verdura".
	 */
	public JButton getbtnPanQueso() {
		return btnPanQueso;
	}

	/**
	 * Establece el botón de "fruta y verdura" del panel.
	 * 
	 * @param btnPanIntegralCosteño El nuevo botón de "fruta y verdura".
	 */
	public void setbtnPanQueso(JButton btnPanQueso) {
		this.btnPanQueso = btnPanQueso;
	}

	/**
	 * Obtiene el botón de "juguetes" del panel.
	 * 
	 * @return El botón de "juguetes".
	 */
	public JButton getbtnPanHojaldrado() {
		return btnPanHojaldrado;
	}

	/**
	 * Establece el botón de "juguetes" del panel.
	 * 
	 * @param btnPanIntegralRoscon El nuevo botón de "juguetes".
	 */
	public void setbtnPanIntegralRoscon(JButton btnPanHojaldrado) {
		this.btnPanHojaldrado = btnPanHojaldrado;
	}

	/**
	 * Obtiene el botón de "pan" del panel.
	 * 
	 * @return El botón de "pan".
	 */
	public JButton getbtnPanIntegral() {
		return btnPanIntegral;
	}

	/**
	 * Establece el botón de "pan" del panel.
	 * 
	 * @param btnPanIntegral El nuevo botón de "pan".
	 */
	public void setbtnPanIntegral(JButton btnPanIntegral) {
		this.btnPanIntegral = btnPanIntegral;
	}

}
