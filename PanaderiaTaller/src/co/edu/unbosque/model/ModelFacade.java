package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PanDulceDAO;
import co.edu.unbosque.model.persistence.PanQuesoDAO;
import co.edu.unbosque.model.persistence.PanIntegralDAO;
import co.edu.unbosque.model.persistence.PanHojaldradoDAO;

public class ModelFacade {

	private PanDulceDAO panDulceDAO;
	private PanQuesoDAO panQuesoDAO;
	private PanIntegralDAO panIntegralDAO;
	private PanHojaldradoDAO panHojaldradoDAO;

	public ModelFacade() {
		panDulceDAO = new PanDulceDAO();
		panQuesoDAO = new PanQuesoDAO();
		panIntegralDAO = new PanIntegralDAO();
		panHojaldradoDAO = new PanHojaldradoDAO();
	}

	public PanDulceDAO getPanDulceDAO() {
		return panDulceDAO;
	}

	public void setPanDulceDAO(PanDulceDAO panDulceDAO) {
		this.panDulceDAO = panDulceDAO;
	}

	public PanQuesoDAO getPanQuesoDAO() {
		return panQuesoDAO;
	}

	public void setPanQuesoDAO(PanQuesoDAO panQuesoDAO) {
		this.panQuesoDAO = panQuesoDAO;
	}

	public PanIntegralDAO getPanIntegralDAO() {
		return panIntegralDAO;
	}

	public void setPanIntegralDAO(PanIntegralDAO panIntegralDAO) {
		this.panIntegralDAO = panIntegralDAO;
	}

	public PanHojaldradoDAO getPanHojaldradoDAO() {
		return panHojaldradoDAO;
	}

	public void setPanHojaldradoDAO(PanHojaldradoDAO panHojaldradoDAO) {
		this.panHojaldradoDAO = panHojaldradoDAO;
	}

}
