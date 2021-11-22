package co.konecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.konecto.model.solicitudEntity;
import co.konecto.service.solicitudServiceIface;

@RestController
@RequestMapping("/solicitud")
public class solicitudController {
	
	@Autowired
	private solicitudServiceIface solicitudS;
	
	@GetMapping("/all")
	public List<solicitudEntity> getAll(){
		return solicitudS.getAll();
		
	}
	@GetMapping("/emple/{id}")
	public Optional<solicitudEntity> getById(@PathVariable int id){
	 return solicitudS.getById(id);
	}
	
	@PostMapping("/insert")
	@ResponseStatus(code = HttpStatus.CREATED)
	public solicitudEntity insertEmpleado(@RequestBody solicitudEntity empleado) throws Exception{
		return solicitudS.insertSolicitud(empleado);
	}
	
	
	
	@GetMapping("/allEmploy")
	public void solicitudEmple() {
		List<String> datos = solicitudS.solicitudNameEmple(4);
	}
	
	
	
	

}
