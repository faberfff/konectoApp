package co.konecto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.konecto.model.empleadoEntity;
import co.konecto.repository.empleadoRepository;

@Service
public class empleadoServiceImpl implements empleadoServiceIface {

	@Autowired
	private empleadoRepository empleadoRepo;

	@Override
	public List<empleadoEntity> getAll() {
		List<empleadoEntity> empleados = new ArrayList<>();
		empleados = (List<empleadoEntity>) empleadoRepo.findAll();
		return empleados;

	}

	@Override
	@Transactional
	public Optional<empleadoEntity> getById(int id) {
		return empleadoRepo.findById(id);
	}

	@Override
	public empleadoEntity insertEmpleado(empleadoEntity empleado) throws Exception {
		boolean exist = empleadoRepo.existsById(empleado.getEmpleadoId());
		if (!exist) {
			empleadoRepo.save(empleado);
		}
		return empleado;
	}

}
