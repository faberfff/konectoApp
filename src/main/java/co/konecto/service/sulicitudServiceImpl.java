package co.konecto.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.konecto.model.solicitudEntity;
import co.konecto.repository.solicitudRepository;

@Service
public class sulicitudServiceImpl implements solicitudServiceIface {

	@Autowired
	private solicitudRepository solicitudRepo;
	
	@Override
	@Transactional
	public List<solicitudEntity> getAll() {
	   
		return (List<solicitudEntity>) solicitudRepo.findAll();
	}

	@Override
	public Optional<solicitudEntity> getById(int id) {
		
		return solicitudRepo.findById(id);
	}

	@Override
	public List<String> solicitudNameEmple(int idSolicitud) {
		List<String> datos = solicitudRepo.solicitudNameEmple(idSolicitud);
		for (String i : datos) {
			System.out.println(i);
		}
		
		return datos;
	}

	@Override
	public solicitudEntity insertSolicitud(solicitudEntity solicitud) throws Exception {
		boolean exist = solicitudRepo.existsById(solicitud.getSolicitudId());
		if(! exist) {
			solicitudRepo.save(solicitud);
		}else {
			throw new Exception("El empleado ya existe");
		}
		return solicitud;
	}

}
