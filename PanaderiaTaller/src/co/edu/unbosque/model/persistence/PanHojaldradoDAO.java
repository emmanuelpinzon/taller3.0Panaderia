package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.PanHojaldrado;
import co.edu.unbosque.model.PanHojaldradoDTO;


public class PanHojaldradoDAO implements CRUDOperation<PanHojaldradoDTO, PanHojaldrado> {
	private ArrayList<PanHojaldrado> listaPanHojaldrado;
	private final String FILE_NAME = "PanHojaldrado.csv";

	public PanHojaldradoDAO() {
		listaPanHojaldrado = new ArrayList<>();
		FileHandler.checkFolder();
	}

	@Override
	public String ShowAll() {
		String rta = "";
		if (listaPanHojaldrado.isEmpty()) {
			return "no hay panes hojaldrados en la lista";

		} else {
			for (PanHojaldrado PanHojaldrado : listaPanHojaldrado) {
				rta += PanHojaldrado;
			}
			return rta;
		}
	}
	@Override
	public String ShowAllNames() {
	    if (listaPanHojaldrado.isEmpty()) {
	        return "No hay panes dulces en la lista.";
	    }

	    String rta = "";
	    for (PanHojaldrado panHojaldrado : listaPanHojaldrado) {
	        rta += panHojaldrado.getNombre() + "\n"; // Solo agrega el nombre
	    }
	    return rta;
	}

	@Override
	public ArrayList<PanHojaldradoDTO> getAll() {
		return DataMapper.listaPanHojaldradoToListaPanHojaldradoDTO(listaPanHojaldrado);
	}

	@Override
	public boolean add(PanHojaldradoDTO newData) {
		if (find(DataMapper.PanHojaldradoDTOToPanHojaldrado(newData)) == null) {
			listaPanHojaldrado.add(DataMapper.PanHojaldradoDTOToPanHojaldrado(newData));
			writeFile();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(PanHojaldradoDTO toDelete) {

		PanHojaldrado found = find(DataMapper.PanHojaldradoDTOToPanHojaldrado(toDelete));
		if (found != null) {

			listaPanHojaldrado.remove(found);

			writeFile();
			return true;
		} else {
			return false;
		}
	}
    public boolean deleteByName(PanHojaldradoDTO delete) {
        // Lógica que ya has implementado
		 String nombre = delete.getNombre();
		    
		    // Crea un objeto temporal para buscar por nombre
		    PanHojaldrado deletePanHojaldrado = new PanHojaldrado();
		    deletePanHojaldrado.setNombre(nombre);

		    // Busca el pan por nombre utilizando el método find()
		    PanHojaldrado panHojaldrado = find(deletePanHojaldrado);

		    if (panHojaldrado != null) {
		        // Si se encontró el pan, lo elimina de la lista
		        listaPanHojaldrado.remove(panHojaldrado);
		        // Guarda los cambios en el archivo
		        writeFile();
		        return true; // Eliminación exitosa
		    } else {
		        return false; // No se encontró el pan
		    }
    }
	@Override
	public PanHojaldrado find(PanHojaldrado toFind) {

		PanHojaldrado found = null;
		if (!listaPanHojaldrado.isEmpty()) {
			for (PanHojaldrado PanHojaldrado : listaPanHojaldrado) {
				if (PanHojaldrado.getNombre().equals(toFind.getNombre())) {
					found = PanHojaldrado;
					return found;

				} else {
					continue;// para saltar al siguiente salto del ciclo. las siguientes lineas de codigo de
								// un continue no se ejecutan, salta a la siguiente iteracion
				}
			}
		} else {
			return null;
		}
		return null;
	}

	@Override
	public boolean update(PanHojaldradoDTO previous, PanHojaldradoDTO newData) {
		PanHojaldrado found = find(DataMapper.PanHojaldradoDTOToPanHojaldrado(previous));
		if (found != null) {
			listaPanHojaldrado.remove(found);
			listaPanHojaldrado.add(DataMapper.PanHojaldradoDTOToPanHojaldrado(newData));
			writeFile();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		String content = "";
		for (PanHojaldrado PanHojaldrado : listaPanHojaldrado) {
			content += PanHojaldrado.getNombre() + "; ";
			content += PanHojaldrado.getPeso() + "; ";
			content += PanHojaldrado.getPrecio() + "; ";
			content += PanHojaldrado.isTieneGluten() + "; ";
			content += PanHojaldrado.isTieneLevadura() + "; ";
			content += PanHojaldrado.isEsCroissant() + "; ";
			content += PanHojaldrado.isTieneCarne() + "; ";

			content += "\n";
		}
		FileHandler.writeFile(FILE_NAME, content);
	}

}
