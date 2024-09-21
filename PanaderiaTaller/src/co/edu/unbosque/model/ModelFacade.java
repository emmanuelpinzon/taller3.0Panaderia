package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PanDulceDAO;
import co.edu.unbosque.model.persistence.PanQuesoDAO;
import co.edu.unbosque.model.persistence.PanIntegralDAO;
import co.edu.unbosque.model.persistence.PanHojaldradoDAO;

/**
 * La clase ModelFacade actúa como una fachada para acceder a diferentes objetos
 * de acceso a datos relacionados con diferentes tipos de pan.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class ModelFacade {

	private PanDulceDAO panDulceDAO;
	private PanQuesoDAO panQuesoDAO;
	private PanIntegralDAO panIntegralDAO;
	private PanHojaldradoDAO panHojaldradoDAO;

	/**
	 * Constructor de ModelFacade que inicializa los objetos DAO.
	 */
	public ModelFacade() {
		panDulceDAO = new PanDulceDAO();
		panQuesoDAO = new PanQuesoDAO();
		panIntegralDAO = new PanIntegralDAO();
		panHojaldradoDAO = new PanHojaldradoDAO();
	}

	/**
	 * Obtiene el objeto PanDulceDAO.
	 * 
	 * @return el objeto PanDulceDAO
	 */
	public PanDulceDAO getPanDulceDAO() {
		return panDulceDAO;
	}

	/**
	 * Establece el objeto PanDulceDAO.
	 * 
	 * @param panDulceDAO el objeto PanDulceDAO a establecer
	 */
	public void setPanDulceDAO(PanDulceDAO panDulceDAO) {
		this.panDulceDAO = panDulceDAO;
	}

	/**
	 * Obtiene el objeto PanQuesoDAO.
	 * 
	 * @return el objeto PanQuesoDAO
	 */
	public PanQuesoDAO getPanQuesoDAO() {
		return panQuesoDAO;
	}

	/**
	 * Establece el objeto PanQuesoDAO.
	 * 
	 * @param panQuesoDAO el objeto PanQuesoDAO a establecer
	 */
	public void setPanQuesoDAO(PanQuesoDAO panQuesoDAO) {
		this.panQuesoDAO = panQuesoDAO;
	}

	/**
	 * Obtiene el objeto PanIntegralDAO.
	 * 
	 * @return el objeto PanIntegralDAO
	 */
	public PanIntegralDAO getPanIntegralDAO() {
		return panIntegralDAO;
	}

	/**
	 * Establece el objeto PanIntegralDAO.
	 * 
	 * @param panIntegralDAO el objeto PanIntegralDAO a establecer
	 */
	public void setPanIntegralDAO(PanIntegralDAO panIntegralDAO) {
		this.panIntegralDAO = panIntegralDAO;
	}

	/**
	 * Obtiene el objeto PanHojaldradoDAO.
	 * 
	 * @return el objeto PanHojaldradoDAO
	 */
	public PanHojaldradoDAO getPanHojaldradoDAO() {
		return panHojaldradoDAO;
	}

	/**
	 * Establece el objeto PanHojaldradoDAO.
	 * 
	 * @param panHojaldradoDAO el objeto PanHojaldradoDAO a establecer
	 */
	public void setPanHojaldradoDAO(PanHojaldradoDAO panHojaldradoDAO) {
		this.panHojaldradoDAO = panHojaldradoDAO;
	}
}
