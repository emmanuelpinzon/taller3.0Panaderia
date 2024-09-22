package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.PanIntegral;
import co.edu.unbosque.model.PanIntegralDTO;



public class PanIntegralDAO implements CRUDOperation <PanIntegralDTO, PanIntegral>{
	private ArrayList<PanIntegral> listaPanIntegrales;
	private final String FILE_NAME = "PanIntegral.csv";
	private final String SERIAL_NAME= "panIntegral.dat";
	
	public PanIntegralDAO() {

FileHandler.checkFolder();
readSerialized();
	}
	@Override
	public String ShowAll() {
		String rta = "";
		if (listaPanIntegrales.isEmpty()) {
			return "no hay Panes Integrales en la lista";

		} else {
			for (PanIntegral PanIntegral : listaPanIntegrales) {
				rta += PanIntegral;
			}
			return rta;
		}
	}
	
	@Override
	public String ShowAllNames() {
	    if (listaPanIntegrales.isEmpty()) {
	        return "No hay panes integrales en la lista.";
	    }

	    String rta = "";
	    for (PanIntegral panIntegral : listaPanIntegrales) {
	        rta += panIntegral.getNombre() + "\n"; // Solo agrega el nombre
	    }
	    return rta;
	}

	@Override
	public ArrayList<PanIntegralDTO> getAll() {
		return DataMapper.listaPanIntegralToListaPanIntegralDTO(listaPanIntegrales);
	}

	@Override
	public boolean add(PanIntegralDTO newData) {
		if (find(DataMapper.PanIntegralDTOToPanIntegral(newData)) == null) {
			listaPanIntegrales.add(DataMapper.PanIntegralDTOToPanIntegral(newData));
			writeFile();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(PanIntegralDTO toDelete) {

		PanIntegral found = find(DataMapper.PanIntegralDTOToPanIntegral(toDelete));
		if (found != null) {

			 listaPanIntegrales.remove(found);

			writeFile();
			return true;
		} else {
			return false;
		}
	}
    public boolean deleteByName(PanIntegralDTO delete) {
        // Lógica que ya has implementado
		 String nombre = delete.getNombre();
		    
		    // Crea un objeto temporal para buscar por nombre
		    PanIntegral deletePanIntegral = new PanIntegral();
		    deletePanIntegral.setNombre(nombre);

		    // Busca el pan por nombre utilizando el método find()
		    PanIntegral panIntegral = find(deletePanIntegral);

		    if (panIntegral != null) {
		        // Si se encontró el pan, lo elimina de la lista
		        listaPanIntegrales.remove(panIntegral);
		        // Guarda los cambios en el archivo
		        writeFile();
		        return true; // Eliminación exitosa
		    } else {
		        return false; // No se encontró el pan
		    }
    }

	@Override
	public PanIntegral find(PanIntegral toFind) {

		PanIntegral found = null;
		if (!listaPanIntegrales.isEmpty()) {
			for (PanIntegral PanIntegral : listaPanIntegrales) {
				if (PanIntegral.getNombre().equals(toFind.getNombre())) {
					found = PanIntegral;
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
	public boolean update(PanIntegralDTO previous, PanIntegralDTO newData) {
		PanIntegral found = find(DataMapper.PanIntegralDTOToPanIntegral(previous));
		if (found != null) {
			listaPanIntegrales.remove(found);
			listaPanIntegrales.add(DataMapper.PanIntegralDTOToPanIntegral(newData));
			writeFile();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		String content = "";
		for (PanIntegral PanIntegral : listaPanIntegrales) {
			content += PanIntegral.getNombre() + "; ";
			content += PanIntegral.getPeso()+ "; ";
			content += PanIntegral.getPrecio()+ "; ";
			content += PanIntegral.isTieneGluten()+ "; ";
			content += PanIntegral.isTieneLevadura()+ "; ";
			content += PanIntegral.isTieneSieteGranos()+ "; ";
			
			content += "\n";
		}
		FileHandler.writeFile(FILE_NAME, content);
	}
	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaPanIntegrales);
	}
	
	
	public void readSerialized() {
		Object content= FileHandler.readSerialized(SERIAL_NAME);
		if(content== null) {
			listaPanIntegrales= new ArrayList<>();
		}else {
			listaPanIntegrales=(ArrayList<PanIntegral>)content;
		}
	}
	}




