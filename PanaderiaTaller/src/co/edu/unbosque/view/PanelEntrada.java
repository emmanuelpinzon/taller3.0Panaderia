package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelEntrada extends JPanel {
	private JLabel imagenBackground, imagenProducto, imagenAgregarC, imagenAgregarV, imagenAgregarJ, imagenAgregarP;
	private JTextField cantidadPan, nombre, peso , precio, tieneGluten, tieneLevadura, saborDulce, tieneArequipe, tipoQueso, esGratinado, tieneSieteGranos,
	tieneFrutosSecos, esCroissant, tieneCarne;
	private JButton btnVolver, btnAgregar, btnActualizar;

	/**
	 * Constructor de la clase PanelEntrada. Inicializa y configura todos los
	 * componentes gráficos del panel, incluyendo campos de texto, botones y
	 * etiquetas de imagen, así como las propiedades del panel...
	 */
	public PanelEntrada() {

		// **Creación y configuración del borde para los componentes**
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		// **Configuración básica del panel**
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		// **Inicialización y configuración de campos de texto (JTextField)**
		cantidadPan= new JTextField();
		cantidadPan.setBounds(230, 180, 340, 45);
		cantidadPan.setOpaque(true);
		
		nombre= new JTextField();
		nombre.setBounds(800, 180, 250, 48);
		nombre.setOpaque(true);
		
		peso = new JTextField();
		peso.setBounds(230, 295, 330, 55);
		peso.setOpaque(true);

		precio = new JTextField();
		precio.setBounds(790, 290, 300, 62);
		precio.setOpaque(true);

		tieneGluten = new JTextField();
		tieneGluten.setBounds(270, 400, 330, 55);
		tieneGluten.setOpaque(true);

		tieneLevadura = new JTextField();
		tieneLevadura.setBounds(230, 510, 330, 55);
		tieneLevadura.setOpaque(true);

		saborDulce = new JTextField();
		saborDulce.setBounds(810, 520, 245, 55);
		saborDulce.setOpaque(true);
		
		tieneArequipe = new JTextField("arequipe");
		tieneArequipe.setBounds(806, 406, 272, 57);
		tieneArequipe.setOpaque(true);

		tipoQueso = new JTextField("queso");
		tipoQueso.setBounds(810, 410, 280, 60);
		tipoQueso.setOpaque(true);
		
		esGratinado = new JTextField("gratinado");
		esGratinado.setBounds(810, 513, 275, 63);
		esGratinado.setOpaque(true);
		
		tieneSieteGranos = new JTextField("granos");
		tieneSieteGranos.setBounds(810, 414, 272, 57);
		tieneSieteGranos.setOpaque(true);
		
		tieneFrutosSecos = new JTextField("frutos secos");
		tieneFrutosSecos.setBounds(810, 414, 272, 57);
		tieneFrutosSecos.setOpaque(true);
		
		esCroissant = new JTextField("croissant");
		esCroissant.setBounds(810, 414, 272, 57);
		esCroissant.setOpaque(true);
		
		tieneCarne = new JTextField("carne");
		tieneCarne.setBounds(810, 414, 272, 57);
		tieneCarne.setOpaque(true);
		
		
	

		// **Inicialización y configuración de botones (JButton)**
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(630, 615, 130, 55);
		btnVolver.setOpaque(false);
		btnVolver.setActionCommand("VOLVERDEADD");
		btnVolver.setBackground(new Color(255, 217, 47));
		btnVolver.setBorder(border);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(430, 615, 130, 55);
		btnAgregar.setOpaque(false);
		btnAgregar.setActionCommand("AGREGARPRODUCTO");
		btnAgregar.setBackground(new Color(255, 217, 47));
		btnAgregar.setBorder(border);



		btnActualizar = new JButton("Actualizar");
		btnActualizar.setOpaque(true);
		btnActualizar.setBounds(810, 620, 140, 50);
		btnActualizar.setActionCommand("UPDATE");
		btnActualizar.setBackground(Color.DARK_GRAY);
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setBorder(border);

		// **Inicialización y configuración de etiquetas de imagen (JLabel)**
		imagenProducto = new JLabel();
		imagenProducto.setVisible(false);
		imagenProducto.setBounds(790, 205, 380, 260);
		imagenProducto.setBorder(border);

		imagenAgregarC = new JLabel();
		ImageIcon imagenAgregarCa = new ImageIcon("src/media/CREARPANDULCE1.png");
		Image redimensionado = imagenAgregarCa.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarC.setIcon(new ImageIcon(redimensionado));
		imagenAgregarC.setVisible(false);
		imagenAgregarC.setBounds(0, 0, 1280, 705);

		imagenAgregarV = new JLabel();
		ImageIcon imagenAgregarVe = new ImageIcon("src/media/CREARPANQUESO1.png");
		Image redimensionadoV = imagenAgregarVe.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarV.setIcon(new ImageIcon(redimensionadoV));
		imagenAgregarV.setVisible(false);
		imagenAgregarV.setBounds(0, 0, 1280, 705);

		imagenAgregarJ = new JLabel();
		ImageIcon imagenAgregarJu = new ImageIcon("src/media/CREARPANINTEGRAL1.png");
		Image redimensionadoJ = imagenAgregarJu.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarJ.setIcon(new ImageIcon(redimensionadoJ));
		imagenAgregarJ.setVisible(false);
		imagenAgregarJ.setBounds(0, 4, 1280, 705);

		imagenAgregarP = new JLabel();
		ImageIcon imagenAgregarPa = new ImageIcon("src/media/CREARPANHOJALDRADO1.png");
		Image redimensionadoP = imagenAgregarPa.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarP.setIcon(new ImageIcon(redimensionadoP));
		imagenAgregarP.setVisible(false);
		imagenAgregarP.setBounds(-4, -2, 1280, 705);

		// **Agregando todos los componentes al panel**
		add(cantidadPan);
		add(nombre);
		add(peso);
		add(precio);
		add(tieneGluten);
		add(tieneLevadura);
		add(saborDulce);
		add(tieneArequipe);
		add(tipoQueso);
		add(esGratinado);
		add(tieneSieteGranos);
		add(tieneFrutosSecos);
		add(esCroissant);
		add(tieneCarne);
		add(btnVolver);
		add(btnAgregar);
		add(btnActualizar);
		add(imagenProducto);

		add(imagenAgregarC);
		add(imagenAgregarV);
		add(imagenAgregarJ);
		add(imagenAgregarP);


		
		setComponentZOrder(imagenProducto, 0); // Imagen de fondo
		setComponentZOrder(imagenAgregarC, 1);
		setComponentZOrder(imagenAgregarV, 2);
		setComponentZOrder(imagenAgregarJ, 3);
		setComponentZOrder(imagenAgregarP, 4);
		setComponentZOrder(nombre, 5);
		setComponentZOrder(peso, 6);
		setComponentZOrder(precio, 7);
		setComponentZOrder(tieneGluten, 8);
		setComponentZOrder(tieneLevadura, 9);
		setComponentZOrder(saborDulce, 10);
		setComponentZOrder(tieneArequipe, 11);
		setComponentZOrder(tipoQueso, 12);
		setComponentZOrder(esGratinado, 13);
		setComponentZOrder(tieneSieteGranos, 14);
		setComponentZOrder(tieneFrutosSecos, 15);
		setComponentZOrder(esCroissant, 16);
		setComponentZOrder(tieneCarne, 17);
		setComponentZOrder(btnVolver, 17);
		setComponentZOrder(btnAgregar, 18);
		setComponentZOrder(btnActualizar, 19);
	}

	
	public JTextField getCantidadPan() {
		return cantidadPan;
	}


	public void setCantidadPan(JTextField cantidadPan) {
		this.cantidadPan = cantidadPan;
	}


	public void setSaborDulce(JTextField saborDulce) {
		this.saborDulce = saborDulce;
	}




	public JLabel getImagenProducto() {
		return imagenProducto;
	}


	public void setImagenProducto(JLabel imagenProducto) {
		this.imagenProducto = imagenProducto;
	}


	/**
	 * Obtiene el botón de actualización.
	 *
	 * @return el botón btnActualizar.
	 */

	
	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	/**
	 * Establece el botón de actualización.
	 *
	 * @param btnActualizar el botón btnActualizar a establecer.
	 */
	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}
	
	

	/**
	 * Obtiene la etiqueta de la imagen de fondo.
	 *
	 * @return la etiqueta imagenBackground.
	 */
	public JLabel getImagenBackground() {
		return imagenBackground;
	}

	/**
	 * Establece la etiqueta de la imagen de fondo. ...
	 *
	 * @param imagenBackground la etiqueta imagenBackground a establecer.
	 */
	public void setImagenBackground(JLabel imagenBackground) {
		this.imagenBackground = imagenBackground;
	}


	 
	public JLabel getImagenAgregarC() {
		return imagenAgregarC;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo C. ...
	 *
	 * @param imagenAgregarC la etiqueta imagenAgregarC a establecer.
	 */
	public void setImagenAgregarC(JLabel imagenAgregarC) {
		this.imagenAgregarC = imagenAgregarC;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo V.
	 *
	 * @return la etiqueta imagenAgregarV.
	 */
	public JLabel getImagenAgregarV() {
		return imagenAgregarV;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo V.
	 *
	 * @param imagenAgregarV la etiqueta imagenAgregarV a establecer.
	 */
	public void setImagenAgregarV(JLabel imagenAgregarV) {
		this.imagenAgregarV = imagenAgregarV;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo J.
	 *
	 * @return la etiqueta imagenAgregarJ.
	 */
	public JLabel getImagenAgregarJ() {
		return imagenAgregarJ;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo J.
	 *
	 * @param imagenAgregarJ la etiqueta imagenAgregarJ a establecer.
	 */
	public void setImagenAgregarJ(JLabel imagenAgregarJ) {
		this.imagenAgregarJ = imagenAgregarJ;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo P.
	 *
	 * @return la etiqueta imagenAgregarP.
	 */
	public JLabel getImagenAgregarP() {
		return imagenAgregarP;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo P.
	 *
	 * @param imagenAgregarP la etiqueta imagenAgregarP a establecer.
	 */
	public void setImagenAgregarP(JLabel imagenAgregarP) {
		this.imagenAgregarP = imagenAgregarP;
	}

	/**
	 * Obtiene el campo de texto para el peso.
	 *
	 * @return el campo de texto peso.
	 */
	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}
	
	public JTextField getPeso() {
		return peso;
	}



	/**
	 * Establece el campo de texto para el peso.
	 *
	 * @param peso el campo de texto para el peso a establecer.
	 */
	public void setPeso(JTextField peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene el campo para el precio del pan.
	 *
	 * @return el campo de precio.
	 */
	public JTextField getPrecio() {
		return precio;
	}

	/**
	 * Establece el campo de texto para el precio.
	 *
	 * @param el campo de precio a establecer.
	 */
	public void setPrecio(JTextField precio) {
		this.precio= precio;
	}

	/**
	 * Obtiene el campo de texto para el gluten.
	 *
	 * @return el campo para preguntar si tiene gluten el pan seleccionado.
	 */
	public JTextField getTieneGluten() {
		return tieneGluten;
	}

	/**
	 * Establece el campo de texto si el pan tiene gluten.
	 *
	 * @param el campo para preguntar si tiene gluten el pan seleccionado.
	 */
	public void setTieneGluten(JTextField tieneGluten) {
		this.tieneGluten = tieneGluten;
	}

	/**
	 * Obtiene el campo de texto si el pan tiene levadura.
	 *
	 * @return el campo de texto tiene levadura.
	 */
	public JTextField getTieneLevadura() {
		return tieneLevadura;
	}

	/**
	 * Establece el campo de texto si el pan tiene levadura.
	 *
	 * @param el campo para preguntar si tiene levadura el pan seleccionado.
	 */
	public void setTieneLevadura(JTextField tieneLevadura) {
		this.tieneLevadura = tieneLevadura;
	}

	/**
	 * Obtiene el campo de texto para preguntar si es dulce.
	 *
	 * @return el campo de texto para preguntar si tiene dulce.
	 */
	public JTextField getSaborDulce() {
		return saborDulce;
	}

	/**
	 * Establece el campo de texto si el pan es dulce.
	 *
	 * @param  el campo de texto si el pan es dulce a establecer.
	 */
	public void setEsDulce(JTextField saborDulce) {
		this.saborDulce = saborDulce;
	}

	/**
	 * Obtiene el campo de texto si el pan tiene coco.
	 *
	 * @return el campo de texto tiene coco.
	 */
	public JTextField getTieneArequipe() {
		return tieneArequipe;
	}

	/**
	 * Establece el campo de texto si el pan tiene coco.
	 *
	 * @param tiene coco el campo de texto tiene coco a establecer.
	 */
	public void setTieneArequipe(JTextField tieneArequipe) {
		this.tieneArequipe = tieneArequipe;
	}

	/**
	 * Obtiene el campo de texto si el pan el salado.
	 *
	 * @return el campo de texto para es salado.
	 */
	public JTextField getTipoQueso() {
		return tipoQueso;
	}

	/**
	 * Establece el campo de texto si el pan es salado.
	 *
	 * @param atributoPropio3 el campo de texto es salado a establecer.
	 */
	public void setTipoQueso(JTextField tipoQueso) {
		this.tipoQueso = tipoQueso;
	}

	/**
	 * Obtiene el campo de texto si el pan tiene queso.
	 *
	 * @return el campo de texto tiene queso.
	 */
	public JTextField getEsGratinado() {
		return esGratinado;
	}

	/**
	 * Establece el campo de texto si el pan tiene queso.
	 *
	 * @param atributoPropio3 el campo de texto tiene queso a establecer.
	 */
	public void setEsGratinado(JTextField esGratinado) {
		this.esGratinado = esGratinado;
	}
	/**
	 * Obtiene el campo de texto si el pan tiene siete granos.
	 *
	 * @return el campo de texto tiene siete granos.
	 */

	public JTextField getTieneSieteGranos() {
		return tieneSieteGranos;
	}

	/**
	 * Establece el campo de texto si el pan tiene siete granos ,,,.
	 *
	 * @param tiene siete granos el campo de texto tiene siete granos a establecer.
	 */
	public void setTieneSieteGranos(JTextField tieneSieteGranos) {
		this.tieneSieteGranos = tieneSieteGranos;
	}
	
	/**
	 * Obtiene el campo de texto si el pan tiene bocadillo.
	 *
	 * @return el campo de texto tiene bocadillo.
	 */
	public JTextField getTieneFrutosSecos() {
		return tieneFrutosSecos;
	}

	/**
	 * Establece el campo de texto si el pan tiene bocadillo.
	 *
	 * @param tiene bocadillo el campo de texto tiene bocadillo a establecer.
	 */
	public void setTieneFrutosSecos(JTextField tieneFrutosSecos) {
		this.tieneFrutosSecos = tieneFrutosSecos;
	}
	/**
	 * Obtiene el campo de texto si el pan tiene bocadillo.
	 *
	 * @return el campo de texto tiene bocadillo.
	 */
	public JTextField getEsCroissant() {
		return esCroissant;
	}

	/**
	 * Establece el campo de texto si el pan tiene bocadillo.
	 *
	 * @param tiene bocadillo el campo de texto tiene bocadillo a establecer.
	 */
	public void setCroissant(JTextField esCroissant) {
		this.esCroissant = esCroissant;
	}
	
	/**
	 * Obtiene el campo de texto si el pan tiene bocadillo.
	 *
	 * @return el campo de texto tiene bocadillo.
	 */
	public JTextField getTieneCarne() {
		return tieneCarne;
	}

	/**
	 * Establece el campo de texto si el pan tiene bocadillo.
	 *
	 * @param tiene bocadillo el campo de texto tiene bocadillo a establecer.
	 */
	public void setTieneCarne(JTextField tieneCarne) {
		this.tieneCarne = tieneCarne;
	}

	
	
	/**
	 * Obtiene el botón de volver.
	 *
	 * @return el botón btnVolver.
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

	/**
	 * Establece el botón de volver.
	 *
	 * @param btnVolver el botón btnVolver a establecer.
	 */
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	/**
	 * Obtiene el botón de agregar.
	 *
	 * @return el botón btnAgregar.
	 */
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	/**
	 * Establece el botón de agregar.
	 *
	 * @param btnAgregar el botón btnAgregar a establecer.
	 */
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	/**
	 * Obtiene el botón para abrir el JFileChooser.
	 *
	 * @return el botón btnJFileChooser.
	 */


}