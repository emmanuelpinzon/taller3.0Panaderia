package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.PanQueso;
import co.edu.unbosque.model.PanQuesoDTO;
import co.edu.unbosque.model.PanHojaldradoDTO;
import co.edu.unbosque.model.PanIntegral;
import co.edu.unbosque.model.PanIntegralDTO;

public class PanQuesoDAO implements CRUDOperation <PanQuesoDTO,PanQueso>{
	private ArrayList<PanQueso> listaPanQuesos;
	private final String FILE_NAME = "panQueso.csv";
	
	public PanQuesoDAO() {
listaPanQuesos= new ArrayList<>();
FileHandler.checkFolder();
	}
	@Override
	public String ShowAll() {
		String rta = "";
		if (listaPanQuesos.isEmpty()) {
			return "no hay mascotas en la lista";

		} else {
			for (PanQueso PanQueso : listaPanQuesos) {
				rta += PanQueso;
			}
			return rta;
		}
	}

	@Override
	public ArrayList<PanQuesoDTO> getAll() {
		return DataMapper.listaPanQuesoToListaPanQuesoDTO(listaPanQuesos);
	}

	@Override
	public boolean add(PanQuesoDTO newData) {
		if (find(DataMapper.PanQuesoDTOToPanQueso(newData)) == null) {
			listaPanQuesos.add(DataMapper.PanQuesoDTOToPanQueso(newData));
			writeFile();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean delete(PanQuesoDTO toDelete) {

		PanQueso found = find(DataMapper.PanQuesoDTOToPanQueso(toDelete));
		if (found != null) {

			listaPanQuesos.remove(found);

			writeFile();
			return true;
		} else {
			return false;
		}
	}
	
    public boolean deleteByName(PanQuesoDTO delete) {
        // Lógica que ya has implementado
		 String nombre = delete.getNombre();
		    
		    // Crea un objeto temporal para buscar por nombre
		    PanQueso deletePanQueso = new PanQueso();
		    deletePanQueso.setNombre(nombre);

		    // Busca el pan por nombre utilizando el método find()
		    PanQueso panQueso = find(deletePanQueso);

		    if (panQueso != null) {
		        // Si se encontró el pan, lo elimina de la lista
		        listaPanQuesos.remove(panQueso);
		        // Guarda los cambios en el archivo
		        writeFile();
		        return true; // Eliminación exitosa
		    } else {
		        return false; // No se encontró el pan
		    }
    }

	@Override
	public PanQueso find(PanQueso toFind) {

		PanQueso found = null;
		if (!listaPanQuesos.isEmpty()) {
			for (PanQueso PanQueso : listaPanQuesos) {
				if (PanQueso.getNombre().equals(toFind.getNombre())) {
					found = PanQueso;
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
	public boolean update(PanQuesoDTO previous, PanQuesoDTO newData) {
		PanQueso found = find(DataMapper.PanQuesoDTOToPanQueso(previous));
		if (found != null) {
			listaPanQuesos.remove(found);
			listaPanQuesos.add(DataMapper.PanQuesoDTOToPanQueso(newData));
			writeFile();
			return true;
		} else {
			return false;
		}
	}
	public void writeFile() {
		String content = "";
		for (PanQueso panQueso : listaPanQuesos) {
			content +=panQueso.getNombre() + "; ";
			content +=panQueso.getPeso()+ "; ";
			content +=panQueso.getPrecio()+ "; ";
			content +=panQueso.isTieneGluten()+ "; ";
			content +=panQueso.isTieneLevadura()+ "; ";
			content +=panQueso.getTipoQueso()+ "; ";
			content +=panQueso.isEsGratinado()+ "; ";
			
			content += "\n";
		}
		FileHandler.writeFile(FILE_NAME, content);
	}
	
	}




