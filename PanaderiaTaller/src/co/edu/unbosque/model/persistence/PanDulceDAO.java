package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.PanDulce;
import co.edu.unbosque.model.PanDulceDTO;

public class PanDulceDAO implements CRUDOperation<PanDulceDTO, PanDulce> {
	private ArrayList<PanDulce> listaPanDulces;
	private final String FILE_NAME = "panDulce.csv";
	private final String SERIAL_NAME= "panDulce.dat";

	public PanDulceDAO() {
		listaPanDulces = new ArrayList<>();
		FileHandler.checkFolder();
	}

	@Override
	public String ShowAll() {
		String rta = "";
		if (listaPanDulces.isEmpty()) {
			return "no hay panes dulces en la lista";

		} else {
			for (PanDulce panDulce : listaPanDulces) {
				rta += panDulce;
			}
			return rta;
		}
	}
	@Override
	public String ShowAllNames() {
	    if (listaPanDulces.isEmpty()) {
	        return "No hay panes dulces en la lista.";
	    }

	    String rta = "";
	    for (PanDulce panDulce : listaPanDulces) {
	        rta += panDulce.getNombre() + "\n"; // Solo agrega el nombre
	    }
	    return rta;
	}

	@Override
	public ArrayList<PanDulceDTO> getAll() {
		return DataMapper.listaPanDulceToListaPanDulceDTO(listaPanDulces);
	}

	@Override
	public boolean add(PanDulceDTO newData) {
		if (find(DataMapper.PanDulceDTOToPanDulce(newData)) == null) {
			listaPanDulces.add(DataMapper.PanDulceDTOToPanDulce(newData));
			writeFile();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(PanDulceDTO toDelete) {

		PanDulce found = find(DataMapper.PanDulceDTOToPanDulce(toDelete));
		if (found != null) {

			listaPanDulces.remove(found);

			writeFile();
			return true;
		} else {
			return false;
		}
	}
	@Override
    public boolean deleteByName(PanDulceDTO delete) {
        // Lógica que ya has implementado
		 String nombre = delete.getNombre();
		    
		    // Crea un objeto temporal para buscar por nombre
		    PanDulce deletePanDulce = new PanDulce();
		    deletePanDulce.setNombre(nombre);

		    // Busca el pan por nombre utilizando el método find()
		    PanDulce panDulce = find(deletePanDulce);

		    if (panDulce != null) {
		        // Si se encontró el pan, lo elimina de la lista
		        listaPanDulces.remove(panDulce);
		        // Guarda los cambios en el archivo
		        writeFile();
		        return true; // Eliminación exitosa
		    } else {
		        return false; // No se encontró el pan
		    }
    }


	@Override
	public PanDulce find(PanDulce toFind) {

		PanDulce found = null;
		if (!listaPanDulces.isEmpty()) {
			for (PanDulce panDulce : listaPanDulces) {
				if (panDulce.getNombre().equals(toFind.getNombre())) {
					found = panDulce;
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
	public boolean update(PanDulceDTO previous, PanDulceDTO newData) {
		PanDulce found = find(DataMapper.PanDulceDTOToPanDulce(previous));
		if (found != null) {
			listaPanDulces.remove(found);
			listaPanDulces.add(DataMapper.PanDulceDTOToPanDulce(newData));
			writeFile();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		String content = "";
		for (PanDulce panDulce : listaPanDulces) {
			content += panDulce.getCantidad() + ";";
			content += panDulce.getNombre() + "; ";
			content += panDulce.getPeso() + "; ";
			content += panDulce.getPrecio() + "; ";
			content += panDulce.isTieneGluten() + "; ";
			content += panDulce.isTieneLevadura() + "; ";
			content += panDulce.isTieneArequipe() + "; ";
			content += panDulce.getSaborDulce() + "; ";

			content += "\n";
		}
		FileHandler.writeFile(FILE_NAME, content);
	}
	
	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaPanDulces);
	}
	
	
	public void readSerialized() {
		Object content= FileHandler.readSerialized(SERIAL_NAME);
		if(content== null) {
			listaPanDulces= new ArrayList<>();
		}else {
			listaPanDulces=(ArrayList<PanDulce>)content;
		}
	}

}
