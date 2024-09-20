package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

public class DataMapper {// revisar la estructura de un objeto de una clase. convierte DTO a entidad y
							// viceversa


	public static PanDulce PanDulceDTOToPanDulce(PanDulceDTO dto) {
		PanDulce entity;
		entity = new PanDulce(dto.getCantidad(), dto.getNombre(), dto.getPeso(), dto.getPrecio(), dto.isTieneGluten(),
				dto.isTieneLevadura(), dto.isTieneArequipe(), dto.getSaborDulce());
		return entity;
	}

	public static PanDulceDTO PanDulceToPanDulceDTO(PanDulce entity) {
		PanDulceDTO dto;
		dto = new PanDulceDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), entity.getPrecio(),
				entity.isTieneGluten(), entity.isTieneLevadura(), entity.isTieneArequipe(), entity.getSaborDulce());
		return dto;
	}

	public static ArrayList<PanDulceDTO> listaPanDulceToListaPanDulceDTO(ArrayList<PanDulce> listaEntity) {
		ArrayList<PanDulceDTO> dtoList = new ArrayList<>();
		for (PanDulce p : listaEntity) {
			dtoList.add(new PanDulceDTO(p.getCantidad(), p.getNombre(), p.getPeso(), p.getPrecio(), p.isTieneGluten(),
					p.isTieneLevadura(), p.isTieneArequipe(), p.getSaborDulce()));

		}

		return dtoList;
	}

	public static ArrayList<PanDulce> listaPanDulceDTOToListaPanDulce(ArrayList<PanDulceDTO> dtoList) {
		ArrayList<PanDulce> entityList = new ArrayList<>();
		for (PanDulceDTO pd : dtoList) {
			entityList.add(new PanDulce(pd.getCantidad(), pd.getNombre(), pd.getPeso(), pd.getPrecio(),
					pd.isTieneGluten(), pd.isTieneLevadura(), pd.isTieneArequipe(), pd.getSaborDulce()));
		}
		return entityList;
	}

	public static PanQueso PanQuesoDTOToPanQueso(PanQuesoDTO dto) {
		PanQueso entity;
		entity = new PanQueso(dto.getCantidad(), dto.getNombre(), dto.getPeso(), dto.getPrecio(), dto.isTieneGluten(),
				dto.isTieneLevadura(), dto.getTipoQueso(), dto.isEsGratinado());
		return entity;
	}

	public static PanQuesoDTO PanQuesoToPanQuesoDTO(PanQueso entity) {
		PanQuesoDTO dto;
		dto = new PanQuesoDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), entity.getPrecio(),
				entity.isTieneGluten(), entity.isTieneLevadura(), entity.getTipoQueso(), entity.isEsGratinado());
		return dto;
	}

	public static ArrayList<PanQuesoDTO> listaPanQuesoToListaPanQuesoDTO(ArrayList<PanQueso> listaEntity) {
		ArrayList<PanQuesoDTO> dtoList = new ArrayList<>();
		for (PanQueso p : listaEntity) {
			dtoList.add(new PanQuesoDTO(p.getCantidad(), p.getNombre(), p.getPeso(), p.getPrecio(), p.isTieneGluten(),
					p.isTieneLevadura(), p.getTipoQueso(), p.isEsGratinado()));

		}

		return dtoList;
	}

	public static ArrayList<PanQueso> listaPanQuesoDTOToListaPanQueso(ArrayList<PanQuesoDTO> dtoList) {
		ArrayList<PanQueso> entityList = new ArrayList<>();
		for (PanQuesoDTO pd : dtoList) {
			entityList.add(new PanQueso(pd.getCantidad(), pd.getNombre(), pd.getPeso(), pd.getPrecio(),
					pd.isTieneGluten(), pd.isTieneLevadura(), pd.getTipoQueso(), pd.isEsGratinado()));
		}
		return entityList;
	}

	public static PanIntegral PanIntegralDTOToPanIntegral(PanIntegralDTO dto) {
		PanIntegral entity;
		entity = new PanIntegral(dto.getCantidad(), dto.getNombre(), dto.getPeso(), dto.getPrecio(),
				dto.isTieneGluten(), dto.isTieneLevadura(), dto.isTieneSieteGranos(), dto.isTieneFrutosSecos());
		return entity;
	}

	public static PanIntegralDTO PanIntegralToPanIntegralDTO(PanIntegral entity) {
		PanIntegralDTO dto;
		dto = new PanIntegralDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), entity.getPrecio(),
				entity.isTieneGluten(), entity.isTieneLevadura(), entity.isTieneSieteGranos(),
				entity.isTieneFrutosSecos());
		return dto;
	}

	public static ArrayList<PanIntegralDTO> listaPanIntegralToListaPanIntegralDTO(ArrayList<PanIntegral> listaEntity) {
		ArrayList<PanIntegralDTO> dtoList = new ArrayList<>();
		for (PanIntegral p : listaEntity) {
			dtoList.add(new PanIntegralDTO(p.getCantidad(), p.getNombre(), p.getPeso(), p.getPrecio(),
					p.isTieneGluten(), p.isTieneLevadura(), p.isTieneSieteGranos(), p.isTieneFrutosSecos()));

		}

		return dtoList;
	}

	public static ArrayList<PanIntegral> listaPanIntegralDTOToListaPanIntegral(ArrayList<PanIntegralDTO> dtoList) {
		ArrayList<PanIntegral> entityList = new ArrayList<>();
		for (PanIntegralDTO pd : dtoList) {
			entityList.add(new PanIntegral(pd.getCantidad(), pd.getNombre(), pd.getPeso(), pd.getPrecio(),
					pd.isTieneGluten(), pd.isTieneLevadura(), pd.isTieneSieteGranos(), pd.isTieneFrutosSecos()));
		}
		return entityList;
	}

	public static PanHojaldrado PanHojaldradoDTOToPanHojaldrado(PanHojaldradoDTO dto) {
		PanHojaldrado entity;
		entity = new PanHojaldrado(dto.getCantidad(), dto.getNombre(), dto.getPeso(), dto.getPrecio(),
				dto.isTieneGluten(), dto.isTieneLevadura(), dto.isEsCroissant(), dto.isTieneCarne());
		return entity;
	}

	public static PanHojaldradoDTO PanHojaldradoToPanHojaldradoDTO(PanHojaldrado entity) {
		PanHojaldradoDTO dto;
		dto = new PanHojaldradoDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), entity.getPrecio(),
				entity.isTieneGluten(), entity.isTieneLevadura(), entity.isEsCroissant(), entity.isTieneCarne());
		return dto;
	}

	public static ArrayList<PanHojaldradoDTO> listaPanHojaldradoToListaPanHojaldradoDTO(
			ArrayList<PanHojaldrado> listaEntity) {
		ArrayList<PanHojaldradoDTO> dtoList = new ArrayList<>();
		for (PanHojaldrado p : listaEntity) {
			dtoList.add(new PanHojaldradoDTO(p.getCantidad(), p.getNombre(), p.getPeso(), p.getPrecio(),
					p.isTieneGluten(), p.isTieneLevadura(), p.isEsCroissant(), p.isTieneCarne()));

		}

		return dtoList;
	}

	public static ArrayList<PanHojaldrado> listaPanHojaldradoDTOToListaPanHojaldrado(
			ArrayList<PanHojaldradoDTO> dtoList) {
		ArrayList<PanHojaldrado> entityList = new ArrayList<>();
		for (PanHojaldradoDTO pd : dtoList) {
			entityList.add(new PanHojaldrado(pd.getCantidad(), pd.getNombre(), pd.getPeso(), pd.getPrecio(),
					pd.isTieneGluten(), pd.isTieneLevadura(), pd.isEsCroissant(), pd.isTieneCarne()));
		}
		return entityList;
	}
}
