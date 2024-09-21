package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.ParseException;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.PanDulce;
import co.edu.unbosque.model.PanDulceDTO;
import co.edu.unbosque.model.PanHojaldrado;
import co.edu.unbosque.model.PanQuesoDTO;
import co.edu.unbosque.model.persistence.DataMapper;
import co.edu.unbosque.model.PanIntegralDTO;
import co.edu.unbosque.model.PanQueso;
import co.edu.unbosque.model.PanHojaldradoDTO;
import co.edu.unbosque.model.PanIntegral;
import co.edu.unbosque.view.ViewFacade;
import co.edu.unbosque.util.exception.*;

public class Controller implements ActionListener {
	private ViewFacade vf;
	private ModelFacade mf;

	private PanDulceDTO anteriorPanDulce;
	private PanQuesoDTO anteriorPanQueso;
	private PanIntegralDTO anteriorPanIntegral;
	private PanHojaldradoDTO anteriorPanHojaldrado;
	private boolean panDulce = false;
	private boolean panQueso = false;
	private boolean panIntegral = false;
	private boolean panHojaldrado = false;
	private boolean newPanDulce = false;
	private boolean newPanQueso = false;
	private boolean newPanIntegral = false;
	private boolean newPanHojaldrado = false;

	public Controller() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		vf.getPrincipal().mostrarPanelMenuPrincipal();
		vf.getCon().mostrarMensajeEmergente("Bienvenido a la panaderia San Martin!");
		asignarLectores();
	}

	public void asignarLectores() {
		// Asigna listeners a los botones del menú principal
		vf.getPrincipal().getMenuPpal().getbtnPanDulce().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnPanDulce().setActionCommand("PANDULCE");

		vf.getPrincipal().getMenuPpal().getbtnPanQueso().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnPanQueso().setActionCommand("PANQUESO");

		vf.getPrincipal().getMenuPpal().getbtnPanIntegral().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnPanIntegral().setActionCommand("PANINTEGRAL");

		vf.getPrincipal().getMenuPpal().getbtnPanHojaldrado().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getbtnPanHojaldrado().setActionCommand("PANHOJALDRADO");

		// Asigna listeners a los botones del menú de gestión
		vf.getPrincipal().getMenuGestion().getBtnAgregar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnAgregar().setActionCommand("AGREGAR");

		vf.getPrincipal().getMenuGestion().getBtnMostrar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnMostrar().setActionCommand("MOSTRAR");

		vf.getPrincipal().getMenuGestion().getBtnActualizar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnActualizar().setActionCommand("ACTUALIZAR");

		vf.getPrincipal().getMenuGestion().getBtnEliminar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnEliminar().setActionCommand("ELIMINAR");

		vf.getPrincipal().getMenuGestion().getBtnVolver().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnVolver().setActionCommand("VOLVER");

		// Asigna listeners a los botones del panel de agregar
		vf.getPrincipal().getPanelEntrada().getBtnAgregar().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnAgregar().setActionCommand("AGREGARPRODUCTO");

		vf.getPrincipal().getPanelEntrada().getBtnVolver().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnVolver().setActionCommand("VOLVERDEADD");

		vf.getPrincipal().getPanelEntrada().getBtnActualizar().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnActualizar().setActionCommand("UPDATE");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		// Maneja la selección de "Pan Coco" desde el menú principal
		case "PANDULCE":
			// Cambia el título de la ventana para indicar que se está administrando "Pan
			// Coco"
			vf.getPrincipal().setTitle("MENU PAN DULCE");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Carne Fría"

			vf.getPrincipal().getMenuGestion().getImagenPanDulce().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPanQueso().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanIntegral().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanHojaldrado().setVisible(false);

			// Configura los campos de atributos propios visibles y no visibles para "Carne
			// Fría"

			vf.getPrincipal().getPanelEntrada().getSaborDulce().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getTieneArequipe().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getTipoQueso().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsGratinado().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsCroissant().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneCarne().setVisible(false);

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Pan de Coco"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Pan
			// Coco"
			panDulce = true;
			panQueso = false;
			panIntegral = false;
			panHojaldrado = false;
			break;
		case "PANQUESO":
			// Cambia el título de la ventana para indicar que se está administrando "Pan
			// Coco"
			vf.getPrincipal().setTitle("MENU PAN QUESO");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Carne Fría"
			vf.getPrincipal().getMenuGestion().getImagenPanDulce().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanQueso().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPanIntegral().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanHojaldrado().setVisible(false);

			// Configura los campos de atributos propios visibles y no visibles para "Carne
			// Fría"
			vf.getPrincipal().getPanelEntrada().getSaborDulce().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneArequipe().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTipoQueso().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getEsGratinado().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsCroissant().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneCarne().setVisible(false);
			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Pan de Coco"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Pan
			// Coco"
			panDulce = false;
			panQueso = true;
			panIntegral = false;
			panHojaldrado = false;
			break;

		case "PANINTEGRAL":
			// Cambia el título de la ventana para indicar que se está administrando "Pan
			// Coco"
			vf.getPrincipal().setTitle("MENU PAN INTEGRAL");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Carne Fría"
			vf.getPrincipal().getMenuGestion().getImagenPanDulce().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanQueso().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanIntegral().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPanHojaldrado().setVisible(false);

			// Configura los campos de atributos propios visibles y no visibles para "Carne
			// Fría"
			vf.getPrincipal().getPanelEntrada().getSaborDulce().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneArequipe().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTipoQueso().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsGratinado().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getEsCroissant().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneCarne().setVisible(false);

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Pan de Coco"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Pan
			// Coco"
			panDulce = false;
			panQueso = false;
			panIntegral = true;
			panHojaldrado = false;
			break;

		case "PANHOJALDRADO":
			// Cambia el título de la ventana para indicar que se está administrando "Pan
			// Coco"
			vf.getPrincipal().setTitle("MENU PAN HOJALDRADO");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(true);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Carne Fría"
			vf.getPrincipal().getMenuGestion().getImagenPanDulce().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanQueso().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanIntegral().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPanHojaldrado().setVisible(true);

			// Configura los campos de atributos propios visibles y no visibles para "Carne
			// Fría"
			vf.getPrincipal().getPanelEntrada().getSaborDulce().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneArequipe().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTipoQueso().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsGratinado().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getEsCroissant().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getTieneCarne().setVisible(true);

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Pan de Coco"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Pan
			// Coco"
			panDulce = false;
			panQueso = false;
			panIntegral = false;
			panHojaldrado = true;
			break;

		case "AGREGAR":
			// Oculta el botón de "Actualizar" ya que estamos en modo de agregación
			vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(false);

			// Determina qué tipo de producto se va a agregar basado en la sección
			// seleccionada
			if (panDulce) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Carnes Frías"
				vf.getPrincipal().setTitle("AGREGANDO PAN DULCE");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (panQueso) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Carnes Frías"
				vf.getPrincipal().setTitle("AGREGANDO PAN QUESO");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (panIntegral) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Carnes Frías"
				vf.getPrincipal().setTitle("AGREGANDO PAN INTEGRAL");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (panHojaldrado) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Carnes Frías"
				vf.getPrincipal().setTitle("AGREGANDO PAN HOJALDRADO");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			break;
		case "MOSTRAR":
			// Verifica la sección seleccionada y muestra el listado correspondiente
			if (panDulce) {
				// Muestra la lista de "Carnes Frías" en la interfaz
				vf.getCon().mostrarListado(mf.getPanDulceDAO().ShowAll());
			}
			if (panQueso) {
				// Muestra la lista de "Frutas y Verduras" en la interfaz
				vf.getCon().mostrarListado(mf.getPanQuesoDAO().ShowAll());
			}
			if (panIntegral) {
				// Muestra la lista de "Juguetes" en la interfaz
				vf.getCon().mostrarListado(mf.getPanIntegralDAO().ShowAll());
			}
			if (panHojaldrado) {
				// Muestra la lista de productos en "Panadería" en la interfaz
				vf.getCon().mostrarListado(mf.getPanHojaldradoDAO().ShowAll());
			}

			break;
		case "ACTUALIZAR":
			if (panDulce) {

				vf.getPrincipal().setTitle("ACTUALIZANDO PAN DULCE");

				// Muestra los nombres de los productos disponibles
				String listaProductos = mf.getPanDulceDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos); // Muestra la lista

				// Solicita al usuario que ingrese el nombre del producto que desea actualizar
				String nombreProducto = vf.getCon()
						.leerEntradaEmergente("Ingrese el nombre del producto a actualizar: ");
				// Crea un PanDulce temporal para buscar
				PanDulce tempPanDulce = new PanDulce();
				tempPanDulce.setNombre(nombreProducto);
				// Busca el producto usando el método find
				PanDulce panDulceEncontrado = mf.getPanDulceDAO().find(tempPanDulce);
				


				// Verifica si se encontró el producto
				if (panDulceEncontrado != null) { // Si el producto no es null, se encontró
					// Oculta el botón de "Agregar" y muestra el botón de "Actualizar"
					vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
					vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
					// Muestra el panel de actualización con los datos del producto seleccionado
					vf.getPrincipal().mostrarPanelEntrada();
					// Ajusta las variables booleanas
					newPanDulce = true;
					newPanQueso = false;
					newPanIntegral = false;
					newPanHojaldrado = false;
					
		            anteriorPanDulce = new PanDulceDTO();
		            anteriorPanDulce.setNombre(panDulceEncontrado.getNombre());
		            anteriorPanDulce.setCantidad(panDulceEncontrado.getCantidad());
		            anteriorPanDulce.setPeso(panDulceEncontrado.getPeso());
		            anteriorPanDulce.setPrecio(panDulceEncontrado.getPrecio());
		            anteriorPanDulce.setTieneGluten(panDulceEncontrado.isTieneGluten());
		            anteriorPanDulce.setTieneLevadura(panDulceEncontrado.isTieneLevadura());
		            anteriorPanDulce.setTieneArequipe(panDulceEncontrado.isTieneArequipe());
		            anteriorPanDulce.setSaborDulce(panDulceEncontrado.getSaborDulce());
					
				} else {
					vf.getCon().mostrarAlerta("Ingrese un nombre valido y que exista en la lista");
				}

			}
			if (panQueso) {
				vf.getPrincipal().setTitle("ACTUALIZANDO PAN QUESO");

				// Muestra los nombres de los productos disponibles
				String listaProductos = mf.getPanQuesoDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos); // Muestra la lista

				// Solicita al usuario que ingrese el nombre del producto que desea actualizar
				String nombreProducto = vf.getCon()
						.leerEntradaEmergente("Ingrese el nombre del producto a actualizar: ");
				// Crea un PanDulce temporal para buscar
				PanQueso tempPanQueso = new PanQueso();
				tempPanQueso.setNombre(nombreProducto);
				// Busca el producto usando el método find
				PanQueso panQuesoEncontrado = mf.getPanQuesoDAO().find(tempPanQueso);

				// Verifica si se encontró el producto
				if (panQuesoEncontrado != null) { // Si el producto no es null, se encontró
					// Oculta el botón de "Agregar" y muestra el botón de "Actualizar"
					vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
					vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
					// Muestra el panel de actualización con los datos del producto seleccionado
					vf.getPrincipal().mostrarPanelEntrada();
					// Ajusta las variables booleanas
					newPanDulce = false;
					newPanQueso = true;
					newPanIntegral = false;
					newPanHojaldrado = false;
					
		            anteriorPanQueso = new PanQuesoDTO();
		            anteriorPanQueso.setNombre(panQuesoEncontrado.getNombre());
		            anteriorPanQueso.setCantidad(panQuesoEncontrado.getCantidad());
		            anteriorPanQueso.setPeso(panQuesoEncontrado.getPeso());
		            anteriorPanQueso.setPrecio(panQuesoEncontrado.getPrecio());
		            anteriorPanQueso.setTieneGluten(panQuesoEncontrado.isTieneGluten());
		            anteriorPanQueso.setTieneLevadura(panQuesoEncontrado.isTieneLevadura());
		            anteriorPanQueso.setTipoQueso(panQuesoEncontrado.getTipoQueso());
		            anteriorPanQueso.setEsGratinado(panQuesoEncontrado.isEsGratinado());
				} else {
					vf.getCon().mostrarAlerta("Ingrese un nombre valido y que exista en la lista");
				}
			}
			if (panIntegral) {
				vf.getPrincipal().setTitle("ACTUALIZANDO PAN INTEGRAL");

				// Muestra los nombres de los productos disponibles
				String listaProductos = mf.getPanIntegralDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos); // Muestra la lista

				// Solicita al usuario que ingrese el nombre del producto que desea actualizar
				String nombreProducto = vf.getCon()
						.leerEntradaEmergente("Ingrese el nombre del producto a actualizar: ");
				// Crea un PanDulce temporal para buscar
				PanIntegral tempPanIntegral = new PanIntegral();
				tempPanIntegral.setNombre(nombreProducto);
				// Busca el producto usando el método find
				PanIntegral panIntegralEncontrado = mf.getPanIntegralDAO().find(tempPanIntegral);

				// Verifica si se encontró el producto
				if (panIntegralEncontrado != null) { // Si el producto no es null, se encontró
					// Oculta el botón de "Agregar" y muestra el botón de "Actualizar"
					vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
					vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
					// Muestra el panel de actualización con los datos del producto seleccionado
					vf.getPrincipal().mostrarPanelEntrada();
					// Ajusta las variables booleanas
					newPanDulce = false;
					newPanQueso = false;
					newPanIntegral = true;
					newPanHojaldrado = false;
					
		            anteriorPanIntegral = new PanIntegralDTO();
		            anteriorPanIntegral.setNombre(panIntegralEncontrado.getNombre());
		            anteriorPanIntegral.setCantidad(panIntegralEncontrado.getCantidad());
		            anteriorPanIntegral.setPeso(panIntegralEncontrado.getPeso());
		            anteriorPanIntegral.setPrecio(panIntegralEncontrado.getPrecio());
		            anteriorPanIntegral.setTieneGluten(panIntegralEncontrado.isTieneGluten());
		            anteriorPanIntegral.setTieneLevadura(panIntegralEncontrado.isTieneLevadura());
		            anteriorPanIntegral.setTieneSieteGranos(panIntegralEncontrado.isTieneSieteGranos());
		            anteriorPanIntegral.setTieneFrutosSecos(panIntegralEncontrado.isTieneFrutosSecos());
				} else {
					vf.getCon().mostrarAlerta("Ingrese un nombre valido y que exista en la lista");
				}
			}
			if (panHojaldrado) {
				vf.getPrincipal().setTitle("ACTUALIZANDO PAN INTEGRAL");

				// Muestra los nombres de los productos disponibles
				String listaProductos = mf.getPanHojaldradoDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos); // Muestra la lista

				// Solicita al usuario que ingrese el nombre del producto que desea actualizar
				String nombreProducto = vf.getCon()
						.leerEntradaEmergente("Ingrese el nombre del producto a actualizar: ");
				// Crea un PanDulce temporal para buscar
				PanHojaldrado tempPanHojaldrado = new PanHojaldrado();
				tempPanHojaldrado.setNombre(nombreProducto);
				// Busca el producto usando el método find
				PanHojaldrado panHojaldradoEncontrado = mf.getPanHojaldradoDAO().find(tempPanHojaldrado);

				// Verifica si se encontró el producto
				if (panHojaldradoEncontrado != null) { // Si el producto no es null, se encontró
					// Oculta el botón de "Agregar" y muestra el botón de "Actualizar"
					vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
					vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
					// Muestra el panel de actualización con los datos del producto seleccionado
					vf.getPrincipal().mostrarPanelEntrada();
					// Ajusta las variables booleanas
					newPanDulce = false;
					newPanQueso = false;
					newPanIntegral = false;
					newPanHojaldrado = true;
					
		            anteriorPanHojaldrado = new PanHojaldradoDTO();
		            anteriorPanHojaldrado.setNombre(panHojaldradoEncontrado.getNombre());
		            anteriorPanHojaldrado.setCantidad(panHojaldradoEncontrado.getCantidad());
		            anteriorPanHojaldrado.setPeso(panHojaldradoEncontrado.getPeso());
		            anteriorPanHojaldrado.setPrecio(panHojaldradoEncontrado.getPrecio());
		            anteriorPanHojaldrado.setTieneGluten(panHojaldradoEncontrado.isTieneGluten());
		            anteriorPanHojaldrado.setTieneLevadura(panHojaldradoEncontrado.isTieneLevadura());
		            anteriorPanHojaldrado.setEsCroissant(panHojaldradoEncontrado.isEsCroissant());
		            anteriorPanHojaldrado.setTieneCarne(panHojaldradoEncontrado.isTieneCarne());
					
				} else {
					vf.getCon().mostrarAlerta("Ingrese un nombre valido y que exista en la lista");
				}
			}
			break;
		case "ELIMINAR":
			if (panDulce) {
				String listaProductos = mf.getPanDulceDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos);
				String nombre = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				PanDulceDTO dto = new PanDulceDTO(); // Asumiendo que tienes un constructor sin parámetros
				dto.setNombre(nombre);
				boolean resultado = mf.getPanDulceDAO().deleteByName(dto);
				vf.getCon().mostrarAlerta(resultado ? "Producto eliminado correctamente" : "Producto no encontrado");
			}
			if (panQueso) {
				String listaProductos = mf.getPanQuesoDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos);
				String nombre = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				PanQuesoDTO dto = new PanQuesoDTO(); // Asumiendo que tienes un constructor sin parámetros
				dto.setNombre(nombre);
				boolean resultado = mf.getPanQuesoDAO().deleteByName(dto);
				vf.getCon().mostrarAlerta(resultado ? "Producto eliminado correctamente" : "Producto no encontrado");
			}
			if (panIntegral) {
				String listaProductos = mf.getPanIntegralDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos);
				String nombre = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				PanIntegralDTO dto = new PanIntegralDTO(); // Asumiendo que tienes un constructor sin parámetros
				dto.setNombre(nombre);
				boolean resultado = mf.getPanIntegralDAO().deleteByName(dto);
				vf.getCon().mostrarAlerta(resultado ? "Producto eliminado correctamente" : "Producto no encontrado");
			}
			if (panHojaldrado) {
				String listaProductos = mf.getPanHojaldradoDAO().ShowAll(); // Obtén la lista de productos
				vf.getCon().mostrarListado("Nombres disponibles:\n" + listaProductos);
				String nombre = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				PanHojaldradoDTO dto = new PanHojaldradoDTO(); // Asumiendo que tienes un constructor sin parámetros
				dto.setNombre(nombre);
				boolean resultado = mf.getPanHojaldradoDAO().deleteByName(dto);
				vf.getCon().mostrarAlerta(resultado ? "Producto eliminado correctamente" : "Producto no encontrado");
			}
			break;
		case "VOLVER":
			// Código para manejar la acción de volver al menú principal...
			vf.getPrincipal().setTitle("MENU PRINCIPAL");
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setIcon(null);
			vf.getPrincipal().mostrarPanelMenuPrincipal();
			break;

		case "VOLVERDEADD":
			// Código para manejar la acción de volver desde el panel de agregación...
			vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setIcon(null);

			/**
			 * Cambia el título de la ventana según la categoría seleccionada y muestra el
			 * panel de menú de gestión correspondiente.
			 * 
			 * Si la categoría es "Carne Fría", establece el título como "ADMINISTRANDO
			 * CARNES FRIAS".
			 * 
			 */
			if (panDulce == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PAN DULCE");
				vf.getPrincipal().mostrarPanelMenuGestion();
			}
			/**
			 * * Si la categoría es "Fruta y Verdura", establece el título como
			 * "ADMINISTRANDO FRUTAS Y VERDURAS".
			 */

			if (panQueso == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PAN QUESO");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/**
			 * * Si la categoría es "Juguete", establece el título como "ADMINISTRANDO
			 * JUGUETES".
			 */

			if (panIntegral == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PAN INTEGRAL");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/*
			 * Si la categoría es "Panadería", establece el título como
			 * "ADMINISTRANDO PANADERIA".
			 */
			if (panHojaldrado == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PAN HOJALDRADO");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/**
			 * Limpia los campos de entrada en el panel de entrada de datos para preparar el
			 * formulario para la introducción de un nuevo producto. Se vacían los
			 * siguientes campos: - Número de ID - Nombre del producto - Empresa productora
			 * - Precio - Cantidad - Atributos propios (dependiendo de la categoría)
			 */
			vf.getPrincipal().getPanelEntrada().getCantidadPan().setText("");
			vf.getPrincipal().getPanelEntrada().getNombre().setText("");
			vf.getPrincipal().getPanelEntrada().getPeso().setText("");
			vf.getPrincipal().getPanelEntrada().getPrecio().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneGluten().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneLevadura().setText("");
			vf.getPrincipal().getPanelEntrada().getSaborDulce().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneArequipe().setText("");
			vf.getPrincipal().getPanelEntrada().getTipoQueso().setText("");
			vf.getPrincipal().getPanelEntrada().getEsGratinado().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().setText("");
			vf.getPrincipal().getPanelEntrada().getEsCroissant().setText("");
			vf.getPrincipal().getPanelEntrada().getTieneCarne().setText("");
			break;
		case "AGREGARPRODUCTO":
			if (panDulce == true) {

				int cantidadPan = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura = vf.getCon().readBoolean(levadura);

				

				String arequipe = (vf.getPrincipal().getPanelEntrada().getTieneArequipe().getText());
				boolean tieneArequipe = vf.getCon().readBoolean(arequipe);
				
				String saborDulce = vf.getPrincipal().getPanelEntrada().getSaborDulce().getText();

				mf.getPanDulceDAO().add(new PanDulceDTO(cantidadPan, nombre, peso, precio, tieneGluten, tieneLevadura,
						tieneArequipe, saborDulce));
				vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

			}
			if (panQueso == true) {

				int cantidadPan1 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre1 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso1 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio1 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten1 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura1 = vf.getCon().readBoolean(levadura);

				String tipoQueso = vf.getPrincipal().getPanelEntrada().getTipoQueso().getText();

				String gratinado = (vf.getPrincipal().getPanelEntrada().getEsGratinado().getText());
				boolean esGratinado = vf.getCon().readBoolean(gratinado);

				mf.getPanQuesoDAO().add(new PanQuesoDTO(cantidadPan1, nombre1, peso1, precio1, tieneGluten1, tieneLevadura1, tipoQueso, esGratinado));
				vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

			}
			if (panIntegral == true) {

				int cantidadPan2 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre2 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso2 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio2 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten2 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura2 = vf.getCon().readBoolean(levadura);
              
				String sieteGranos = (vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().getText());
                boolean tieneSieteGranos=vf.getCon().readBoolean(sieteGranos);
                
				String frutosSecos = (vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().getText());
				boolean tieneFrutosSecos = vf.getCon().readBoolean(frutosSecos);

				mf.getPanIntegralDAO().add(new PanIntegralDTO(cantidadPan2, nombre2, peso2, precio2, tieneGluten2, tieneLevadura2, tieneSieteGranos, tieneFrutosSecos));
				vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

			}
			if (panHojaldrado == true) {

				int cantidadPan3 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre3 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso3 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio3 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten3 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura3 = vf.getCon().readBoolean(levadura);

				String croissant = (vf.getPrincipal().getPanelEntrada().getEsCroissant().getText());
                boolean esCroissant=vf.getCon().readBoolean(croissant);
                
				String carne = (vf.getPrincipal().getPanelEntrada().getTieneCarne().getText());
				boolean tieneCarne = vf.getCon().readBoolean(carne);
				mf.getPanHojaldradoDAO().add(new PanHojaldradoDTO(cantidadPan3, nombre3, peso3, precio3, tieneGluten3, tieneLevadura3, esCroissant, tieneCarne));
				vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");


			}
			break;
		case "UPDATE":
			if (panDulce == true && newPanDulce == true) {

				int cantidadPan = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura = vf.getCon().readBoolean(levadura);

				String saborDulce = vf.getPrincipal().getPanelEntrada().getSaborDulce().getText();

				String arequipe = (vf.getPrincipal().getPanelEntrada().getTieneArequipe().getText());
				boolean tieneArequipe = vf.getCon().readBoolean(arequipe);
				 // Crea un objeto PanDulceDTO con los nuevos datos
		        PanDulceDTO nuevoPanDulce = new PanDulceDTO(cantidadPan, nombre, peso, precio, tieneGluten, tieneLevadura,  tieneArequipe, saborDulce);

		        if (anteriorPanDulce != null) {
		            // Llama al método update del DAO con los objetos anterior y nuevo
		            boolean actualizado = mf.getPanDulceDAO().update(anteriorPanDulce, nuevoPanDulce);

		            // Muestra mensajes dependiendo del resultado
		            if (actualizado) {
		                vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
		            } else {
		                vf.getCon().mostrarAlerta("Error al actualizar el producto. Verifique que los datos sean correctos.");
		            }
		        } else {
		            vf.getCon().mostrarAlerta("No se encontró el producto anterior para actualizar.");
		        }
		    }
			if (panQueso == true && newPanQueso == true) {
				int cantidadPan1 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre1 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso1 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio1 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten1 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura1 = vf.getCon().readBoolean(levadura);

				String tipoQueso = vf.getPrincipal().getPanelEntrada().getTipoQueso().getText();

				String gratinado = (vf.getPrincipal().getPanelEntrada().getEsGratinado().getText());
				boolean esGratinado = vf.getCon().readBoolean(gratinado);
				
				PanQuesoDTO nuevoPanQueso = new PanQuesoDTO(cantidadPan1, nombre1, peso1, precio1, tieneGluten1, tieneLevadura1, tipoQueso, esGratinado);
				
		        if (anteriorPanQueso != null) {
		            // Llama al método update del DAO con los objetos anterior y nuevo
		            boolean actualizado = mf.getPanQuesoDAO().update(anteriorPanQueso, nuevoPanQueso);

		            // Muestra mensajes dependiendo del resultado
		            if (actualizado) {
		                vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
		            } else {
		                vf.getCon().mostrarAlerta("Error al actualizar el producto. Verifique que los datos sean correctos.");
		            }
		        } else {
		            vf.getCon().mostrarAlerta("No se encontró el producto anterior para actualizar.");
		        }
			}
			
			if (panIntegral == true && newPanIntegral == true) {
				int cantidadPan2 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre2 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso2 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio2 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten2 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura2 = vf.getCon().readBoolean(levadura);
              
				String sieteGranos = (vf.getPrincipal().getPanelEntrada().getTieneSieteGranos().getText());
                boolean tieneSieteGranos=vf.getCon().readBoolean(sieteGranos);
                
				String frutosSecos = (vf.getPrincipal().getPanelEntrada().getTieneFrutosSecos().getText());
				boolean tieneFrutosSecos = vf.getCon().readBoolean(frutosSecos);
				
				PanIntegralDTO nuevoPanIntegral= new PanIntegralDTO(cantidadPan2, nombre2, peso2, precio2, tieneGluten2, tieneLevadura2, tieneSieteGranos, tieneFrutosSecos);
				

		        if (anteriorPanIntegral != null) {
		            // Llama al método update del DAO con los objetos anterior y nuevo
		            boolean actualizado = mf.getPanIntegralDAO().update(anteriorPanIntegral, nuevoPanIntegral);

		            // Muestra mensajes dependiendo del resultado
		            if (actualizado) {
		                vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
		            } else {
		                vf.getCon().mostrarAlerta("Error al actualizar el producto. Verifique que los datos sean correctos.");
		            }
		        } else {
		            vf.getCon().mostrarAlerta("No se encontró el producto anterior para actualizar.");
		        }
			}
			if (panHojaldrado == true && newPanHojaldrado == true) {
				int cantidadPan3 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidadPan().getText());

				String nombre3 = vf.getPrincipal().getPanelEntrada().getNombre().getText();
				double peso3 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPeso().getText());
				double precio3 = Double.parseDouble(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

				String gluten = (vf.getPrincipal().getPanelEntrada().getTieneGluten().getText());
				boolean tieneGluten3 = vf.getCon().readBoolean(gluten);

				String levadura = (vf.getPrincipal().getPanelEntrada().getTieneLevadura().getText());
				boolean tieneLevadura3 = vf.getCon().readBoolean(levadura);

				String croissant = (vf.getPrincipal().getPanelEntrada().getEsCroissant().getText());
                boolean esCroissant=vf.getCon().readBoolean(croissant);
                
				String carne = (vf.getPrincipal().getPanelEntrada().getTieneCarne().getText());
				boolean tieneCarne = vf.getCon().readBoolean(carne);
				
				PanHojaldradoDTO nuevoPanHojaldrado= new PanHojaldradoDTO(cantidadPan3, nombre3, peso3, precio3, tieneGluten3, tieneLevadura3, esCroissant, tieneCarne);
				
				if (anteriorPanHojaldrado != null) {
		            // Llama al método update del DAO con los objetos anterior y nuevo
		            boolean actualizado = mf.getPanHojaldradoDAO().update(anteriorPanHojaldrado, nuevoPanHojaldrado);

		            // Muestra mensajes dependiendo del resultado
		            if (actualizado) {
		                vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
		            } else {
		                vf.getCon().mostrarAlerta("Error al actualizar el producto. Verifique que los datos sean correctos.");
		            }
		        } else {
		            vf.getCon().mostrarAlerta("No se encontró el producto anterior para actualizar.");
		        }
			}
			
			
			
			
			}
		}

}


