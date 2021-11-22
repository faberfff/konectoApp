package co.konecto.service;

import java.util.List;
import java.util.Optional;

import co.konecto.model.solicitudEntity;

public interface solicitudServiceIface {
	
	/**
	 * Listar solicitudes
	 * @return
	 */

	public List<solicitudEntity> getAll();
	
	/**
	 * consultar solicitud por su id
	 * @param solicitud
	 * @param id
	 */
	
	public Optional<solicitudEntity> getById(int id);
	
	  /**
	   * Insertar solicitud
	   * @param solicitud
	   * @throws Exception
	   */
	
	public solicitudEntity insertSolicitud(solicitudEntity solicitud) throws Exception;
	
	   /**
	    * listar solicitud por nombre empleado
	    * @param i
	    * @return
	    */
	
	public List<String> solicitudNameEmple(int idSolicitud);

	
}
