package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation<P, N> {// D-> DTO, E->Entidad

	public String ShowAll();// mostrar todo

	public ArrayList<P> getAll();// mostrar todo como DTO

	public boolean add(P newdata);// ahora verfico que no haya duplicados

	public boolean delete(P toDelete);// eliminar

	public  boolean deleteByName(P delete);

	public N find(N toFind);// buscar, verificar si existe o no; null -> no exite

	public boolean update(P previous, P newData);// actualizar
}