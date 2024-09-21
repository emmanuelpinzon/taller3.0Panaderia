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

/**
 * La clase {@code PanelEntrada} representa un panel gráfico que permite al
 * usuario ingresar información sobre diferentes tipos de pan, incluyendo
 * características como cantidad, nombre, peso, precio y atributos específicos
 * (por ejemplo, si tiene gluten o es croissant).
 * 
 * Este panel es parte de la interfaz de usuario y facilita la interacción del
 * usuario al proporcionar campos de entrada y botones para agregar o actualizar
 * productos.
 * 
 * <p>
 * Ejemplo de uso:
 * </p>
 * 
 * <pre>
 * PanelEntrada panel = new PanelEntrada();
 * panel.getBtnAgregar().addActionListener(e -> {
 * 	// Lógica para agregar un nuevo producto
 * });
 * </pre>
 * 
 * @author Nicole
 * @version 1.0
 */
public class PanelEntrada extends JPanel {
	private JLabel imagenBackground, imagenProducto, imagenAgregarC, imagenAgregarV, imagenAgregarJ, imagenAgregarP;
	private JTextField cantidadPan, nombre, peso, precio, tieneGluten, tieneLevadura, saborDulce, tieneArequipe,
			tipoQueso, esGratinado, tieneSieteGranos, tieneFrutosSecos, esCroissant, tieneCarne;
	private JButton btnVolver, btnAgregar, btnActualizar;

	/**
	 * Constructor de la clase {@code PanelEntrada}. Inicializa y configura todos
	 * los componentes gráficos del panel, incluyendo campos de texto, botones y
	 * etiquetas de imagen, así como las propiedades del panel.
	 * 
	 * Se establece el tamaño del panel, su layout, y se agregan todos los
	 * componentes necesarios para la funcionalidad de ingreso de datos.
	 */
	public PanelEntrada() {
		// Creación y configuración del borde para los componentes
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		// Configuración básica del panel
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);


		// **Inicialización y configuración de campos de texto (JTextField)**
		cantidadPan= new JTextField();
		cantidadPan.setBounds(226, 182, 360, 45);
		cantidadPan.setOpaque(true);

		
		nombre= new JTextField();
		nombre.setBounds(798, 180, 320, 48);
		nombre.setOpaque(true);

		peso = new JTextField();
		peso.setBounds(230, 295, 360, 55);
		peso.setOpaque(true);

		precio = new JTextField();
		precio.setBounds(790, 289, 330, 64);
		precio.setOpaque(true);

		tieneGluten = new JTextField();
		tieneGluten.setBounds(231, 406, 343, 56);
		tieneGluten.setOpaque(true);

		tieneLevadura = new JTextField();
		tieneLevadura.setBounds(235, 513, 343, 65);
		tieneLevadura.setOpaque(true);

		saborDulce = new JTextField();
		saborDulce.setBounds(812, 516, 275, 65);
		saborDulce.setOpaque(true);

		
		tieneArequipe = new JTextField();
		tieneArequipe.setBounds(813, 409, 273, 57);
		tieneArequipe.setOpaque(true);

		tipoQueso = new JTextField();
		tipoQueso.setBounds(810, 410, 280, 60);
		tipoQueso.setOpaque(true);

		
		esGratinado = new JTextField();
		esGratinado.setBounds(811, 519, 275, 63);
		esGratinado.setOpaque(true);

		
		tieneSieteGranos = new JTextField();
		tieneSieteGranos.setBounds(810, 414, 276, 57);
		tieneSieteGranos.setOpaque(true);
		

		tieneFrutosSecos = new JTextField();
		tieneFrutosSecos.setBounds(810, 525, 276, 57);
		tieneFrutosSecos.setOpaque(true);

		
		esCroissant = new JTextField();
		esCroissant.setBounds(810, 411, 272, 57);
		esCroissant.setOpaque(true);

		
		tieneCarne = new JTextField();
		tieneCarne.setBounds(810, 516, 276, 63);
		tieneCarne.setOpaque(true);

		
		// Inicialización y configuración de botones (JButton)
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
		btnActualizar.setOpaque(false);
		btnActualizar.setBounds(810, 620, 140, 50);
		btnActualizar.setActionCommand("UPDATE");
		btnActualizar.setBackground(new Color(255, 217, 47));
		btnActualizar.setBorder(border);

		// Inicialización y configuración de etiquetas de imagen (JLabel)
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

		// Agregando todos los componentes al panel
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
		setComponentZOrder(btnVolver, 18);
		setComponentZOrder(btnAgregar, 19);
		setComponentZOrder(btnActualizar, 20);
	
	}

	/**
	 * Obtiene el campo de texto para la cantidad de pan.
	 * 
	 * @return el campo de texto que contiene la cantidad de pan.
	 */
	public JTextField getCantidadPan() {
		return cantidadPan;
	}

	/**
	 * Obtiene el campo de texto para el nombre del producto.
	 * 
	 * @return el campo de texto que contiene el nombre del producto.
	 */
	public JTextField getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el campo de texto para el peso del producto.
	 * 
	 * @return el campo de texto que contiene el peso del producto.
	 */
	public JTextField getPeso() {
		return peso;
	}

	/**
	 * Obtiene el campo de texto para el precio del producto.
	 * 
	 * @return el campo de texto que contiene el precio del producto.
	 */
	public JTextField getPrecio() {
		return precio;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto contiene gluten.
	 * 
	 * @return el campo de texto que indica si el producto tiene gluten.
	 */
	public JTextField getTieneGluten() {
		return tieneGluten;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto contiene levadura.
	 * 
	 * @return el campo de texto que indica si el producto tiene levadura.
	 */
	public JTextField getTieneLevadura() {
		return tieneLevadura;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto tiene sabor dulce.
	 * 
	 * @return el campo de texto que indica si el producto tiene sabor dulce.
	 */
	public JTextField getSaborDulce() {
		return saborDulce;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto tiene arequipe.
	 * 
	 * @return el campo de texto que indica si el producto tiene arequipe.
	 */
	public JTextField getTieneArequipe() {
		return tieneArequipe;
	}

	/**
	 * Obtiene el campo de texto que indica el tipo de queso del producto.
	 * 
	 * @return el campo de texto que contiene el tipo de queso.
	 */
	public JTextField getTipoQueso() {
		return tipoQueso;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto es gratinado.
	 * 
	 * @return el campo de texto que indica si el producto es gratinado.
	 */
	public JTextField getEsGratinado() {
		return esGratinado;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto contiene siete granos.
	 * 
	 * @return el campo de texto que indica si el producto tiene siete granos.
	 */
	public JTextField getTieneSieteGranos() {
		return tieneSieteGranos;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto contiene frutos secos.
	 * 
	 * @return el campo de texto que indica si el producto tiene frutos secos.
	 */
	public JTextField getTieneFrutosSecos() {
		return tieneFrutosSecos;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto es un croissant.
	 * 
	 * @return el campo de texto que indica si el producto es un croissant.
	 */
	public JTextField getEsCroissant() {
		return esCroissant;
	}

	/**
	 * Obtiene el campo de texto que indica si el producto contiene carne.
	 * 
	 * @return el campo de texto que indica si el producto tiene carne.
	 */
	public JTextField getTieneCarne() {
		return tieneCarne;
	}

	/**
	 * Obtiene el botón "Volver".
	 * 
	 * @return el botón que permite regresar a la pantalla anterior.
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

	/**
	 * Obtiene el botón "Agregar".
	 * 
	 * @return el botón que permite agregar un nuevo producto.
	 */
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	/**
	 * Obtiene el botón "Actualizar".
	 * 
	 * @return el botón que permite actualizar la información de un producto
	 *         existente.
	 */
	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	/**
	 * Obtiene la etiqueta de imagen del producto.
	 * 
	 * @return la etiqueta que muestra la imagen del producto.
	 */
	public JLabel getImagenProducto() {
		return imagenProducto;
	}

	/**
	 * Obtiene la etiqueta de imagen para agregar un pan dulce.
	 * 
	 * @return la etiqueta que muestra la imagen para agregar un pan dulce.
	 */
	public JLabel getImagenAgregarC() {
		return imagenAgregarC;
	}

	/**
	 * Obtiene la etiqueta de imagen para agregar un pan de queso.
	 * 
	 * @return la etiqueta que muestra la imagen para agregar un pan de queso.
	 */
	public JLabel getImagenAgregarV() {
		return imagenAgregarV;
	}

	/**
	 * Obtiene la etiqueta de imagen para agregar un pan integral.
	 * 
	 * @return la etiqueta que muestra la imagen para agregar un pan integral.
	 */
	public JLabel getImagenAgregarJ() {
		return imagenAgregarJ;
	}

	/**
	 * Obtiene la etiqueta de imagen para agregar un pan hojaldre.
	 * 
	 * @return la etiqueta que muestra la imagen para agregar un pan hojaldre.
	 */
	public JLabel getImagenAgregarP() {
		return imagenAgregarP;
	}
}
