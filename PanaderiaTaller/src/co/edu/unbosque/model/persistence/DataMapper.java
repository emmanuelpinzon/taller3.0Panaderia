package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.*;

/**
 * La clase DataMapper se encarga de convertir objetos de transferencia de datos (DTO)
 * a entidades y viceversa. Proporciona métodos para realizar estas conversiones
 * para diferentes tipos de panes.
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class DataMapper {

    /**
     * Convierte un objeto PanDulceDTO a un objeto PanDulce.
     * 
     * @param dto el objeto DTO a convertir
     * @return el objeto PanDulce correspondiente
     */
    public static PanDulce PanDulceDTOToPanDulce(PanDulceDTO dto) {
        PanDulce entity = new PanDulce(dto.getCantidad(), dto.getNombre(), dto.getPeso(), 
                dto.getPrecio(), dto.isTieneGluten(), dto.isTieneLevadura(), 
                dto.isTieneArequipe(), dto.getSaborDulce());
        return entity;
    }

    /**
     * Convierte un objeto PanDulce a un objeto PanDulceDTO.
     * 
     * @param entity el objeto entidad a convertir
     * @return el objeto PanDulceDTO correspondiente
     */
    public static PanDulceDTO PanDulceToPanDulceDTO(PanDulce entity) {
        PanDulceDTO dto = new PanDulceDTO(entity.getCantidad(), entity.getNombre(), 
                entity.getPeso(), entity.getPrecio(), entity.isTieneGluten(), 
                entity.isTieneLevadura(), entity.isTieneArequipe(), entity.getSaborDulce());
        return dto;
    }

    /**
     * Convierte una lista de objetos PanDulce a una lista de objetos PanDulceDTO.
     * 
     * @param listaEntity la lista de objetos entidad a convertir
     * @return una lista de objetos PanDulceDTO correspondientes
     */
    public static ArrayList<PanDulceDTO> listaPanDulceToListaPanDulceDTO(ArrayList<PanDulce> listaEntity) {
        ArrayList<PanDulceDTO> dtoList = new ArrayList<>();
        for (PanDulce p : listaEntity) {
            dtoList.add(PanDulceToPanDulceDTO(p));
        }
        return dtoList;
    }

    /**
     * Convierte una lista de objetos PanDulceDTO a una lista de objetos PanDulce.
     * 
     * @param dtoList la lista de objetos DTO a convertir
     * @return una lista de objetos PanDulce correspondientes
     */
    public static ArrayList<PanDulce> listaPanDulceDTOToListaPanDulce(ArrayList<PanDulceDTO> dtoList) {
        ArrayList<PanDulce> entityList = new ArrayList<>();
        for (PanDulceDTO pd : dtoList) {
            entityList.add(PanDulceDTOToPanDulce(pd));
        }
        return entityList;
    }

    // Métodos similares para PanQueso, PanIntegral y PanHojaldrado...

    /**
     * Convierte un objeto PanQuesoDTO a un objeto PanQueso.
     * 
     * @param dto el objeto DTO a convertir
     * @return el objeto PanQueso correspondiente
     */
    public static PanQueso PanQuesoDTOToPanQueso(PanQuesoDTO dto) {
        return new PanQueso(dto.getCantidad(), dto.getNombre(), dto.getPeso(), 
                dto.getPrecio(), dto.isTieneGluten(), dto.isTieneLevadura(), 
                dto.getTipoQueso(), dto.isEsGratinado());
    }

    /**
     * Convierte un objeto PanQueso a un objeto PanQuesoDTO.
     * 
     * @param entity el objeto entidad a convertir
     * @return el objeto PanQuesoDTO correspondiente
     */
    public static PanQuesoDTO PanQuesoToPanQuesoDTO(PanQueso entity) {
        return new PanQuesoDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), 
                entity.getPrecio(), entity.isTieneGluten(), entity.isTieneLevadura(), 
                entity.getTipoQueso(), entity.isEsGratinado());
    }

    /**
     * Convierte una lista de objetos PanQueso a una lista de objetos PanQuesoDTO.
     * 
     * @param listaEntity la lista de objetos entidad a convertir
     * @return una lista de objetos PanQuesoDTO correspondientes
     */
    public static ArrayList<PanQuesoDTO> listaPanQuesoToListaPanQuesoDTO(ArrayList<PanQueso> listaEntity) {
        ArrayList<PanQuesoDTO> dtoList = new ArrayList<>();
        for (PanQueso p : listaEntity) {
            dtoList.add(PanQuesoToPanQuesoDTO(p));
        }
        return dtoList;
    }

    /**
     * Convierte una lista de objetos PanQuesoDTO a una lista de objetos PanQueso.
     * 
     * @param dtoList la lista de objetos DTO a convertir
     * @return una lista de objetos PanQueso correspondientes
     */
    public static ArrayList<PanQueso> listaPanQuesoDTOToListaPanQueso(ArrayList<PanQuesoDTO> dtoList) {
        ArrayList<PanQueso> entityList = new ArrayList<>();
        for (PanQuesoDTO pd : dtoList) {
            entityList.add(PanQuesoDTOToPanQueso(pd));
        }
        return entityList;
    }

    // Métodos similares para PanIntegral y PanHojaldrado...

    /**
     * Convierte un objeto PanIntegralDTO a un objeto PanIntegral.
     * 
     * @param dto el objeto DTO a convertir
     * @return el objeto PanIntegral correspondiente
     */
    public static PanIntegral PanIntegralDTOToPanIntegral(PanIntegralDTO dto) {
        return new PanIntegral(dto.getCantidad(), dto.getNombre(), dto.getPeso(), 
                dto.getPrecio(), dto.isTieneGluten(), dto.isTieneLevadura(), 
                dto.isTieneSieteGranos(), dto.isTieneFrutosSecos());
    }

    /**
     * Convierte un objeto PanIntegral a un objeto PanIntegralDTO.
     * 
     * @param entity el objeto entidad a convertir
     * @return el objeto PanIntegralDTO correspondiente
     */
    public static PanIntegralDTO PanIntegralToPanIntegralDTO(PanIntegral entity) {
        return new PanIntegralDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), 
                entity.getPrecio(), entity.isTieneGluten(), entity.isTieneLevadura(), 
                entity.isTieneSieteGranos(), entity.isTieneFrutosSecos());
    }

    /**
     * Convierte una lista de objetos PanIntegral a una lista de objetos PanIntegralDTO.
     * 
     * @param listaEntity la lista de objetos entidad a convertir
     * @return una lista de objetos PanIntegralDTO correspondientes
     */
    public static ArrayList<PanIntegralDTO> listaPanIntegralToListaPanIntegralDTO(ArrayList<PanIntegral> listaEntity) {
        ArrayList<PanIntegralDTO> dtoList = new ArrayList<>();
        for (PanIntegral p : listaEntity) {
            dtoList.add(PanIntegralToPanIntegralDTO(p));
        }
        return dtoList;
    }

    /**
     * Convierte una lista de objetos PanIntegralDTO a una lista de objetos PanIntegral.
     * 
     * @param dtoList la lista de objetos DTO a convertir
     * @return una lista de objetos PanIntegral correspondientes
     */
    public static ArrayList<PanIntegral> listaPanIntegralDTOToListaPanIntegral(ArrayList<PanIntegralDTO> dtoList) {
        ArrayList<PanIntegral> entityList = new ArrayList<>();
        for (PanIntegralDTO pd : dtoList) {
            entityList.add(PanIntegralDTOToPanIntegral(pd));
        }
        return entityList;
    }

    /**
     * Convierte un objeto PanHojaldradoDTO a un objeto PanHojaldrado.
     * 
     * @param dto el objeto DTO a convertir
     * @return el objeto PanHojaldrado correspondiente
     */
    public static PanHojaldrado PanHojaldradoDTOToPanHojaldrado(PanHojaldradoDTO dto) {
        return new PanHojaldrado(dto.getCantidad(), dto.getNombre(), dto.getPeso(), 
                dto.getPrecio(), dto.isTieneGluten(), dto.isTieneLevadura(), 
                dto.isEsCroissant(), dto.isTieneCarne());
    }

    /**
     * Convierte un objeto PanHojaldrado a un objeto PanHojaldradoDTO.
     * 
     * @param entity el objeto entidad a convertir
     * @return el objeto PanHojaldradoDTO correspondiente
     */
    public static PanHojaldradoDTO PanHojaldradoToPanHojaldradoDTO(PanHojaldrado entity) {
        return new PanHojaldradoDTO(entity.getCantidad(), entity.getNombre(), entity.getPeso(), 
                entity.getPrecio(), entity.isTieneGluten(), entity.isTieneLevadura(), 
                entity.isEsCroissant(), entity.isTieneCarne());
    }

    /**
     * Convierte una lista de objetos PanHojaldrado a una lista de objetos PanHojaldradoDTO.
     * 
     * @param listaEntity la lista de objetos entidad a convertir
     * @return una lista de objetos PanHojaldradoDTO correspondientes
     */
    public static ArrayList<PanHojaldradoDTO> listaPanHojaldradoToListaPanHojaldradoDTO(ArrayList<PanHojaldrado> listaEntity) {
        ArrayList<PanHojaldradoDTO> dtoList = new ArrayList<>();
        for (PanHojaldrado p : listaEntity) {
            dtoList.add(PanHojaldradoToPanHojaldradoDTO(p));
        }
        return dtoList;
    }

    /**
     * Convierte una lista de objetos PanHojaldradoDTO a una lista de objetos PanHojaldrado.
     * 
     * @param dtoList la lista de objetos DTO a convertir
     * @return una lista de objetos PanHojaldrado correspondientes
     */
    public static ArrayList<PanHojaldrado> listaPanHojaldradoDTOToListaPanHojaldrado(ArrayList<PanHojaldradoDTO> dtoList) {
        ArrayList<PanHojaldrado> entityList = new ArrayList<>();
        for (PanHojaldradoDTO pd : dtoList) {
            entityList.add(PanHojaldradoDTOToPanHojaldrado(pd));
        }
        return entityList;
    }
}
