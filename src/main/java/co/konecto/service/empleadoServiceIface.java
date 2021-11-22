package co.konecto.service;

import java.util.List;
import java.util.Optional;

import co.konecto.model.empleadoEntity;

public interface empleadoServiceIface {
	
	/**
	 * listar los empleados
	 * @return
	 */
	public List<empleadoEntity> getAll();
	
	/**
	 * consultar un empleado por id
	 * @param empleado
	 * @param id
	 */
	public Optional<empleadoEntity> getById(int id);
	
	/**
	 * insertar un empleado
	 * @param empleado
	 * @throws Exception
	 */
	public empleadoEntity insertEmpleado(empleadoEntity empleado) throws Exception;

}
