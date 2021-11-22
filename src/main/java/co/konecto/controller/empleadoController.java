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
import org.springframework.web.servlet.ModelAndView;

import co.konecto.model.empleadoEntity;
import co.konecto.service.empleadoServiceIface;

@RestController
@RequestMapping(value = "/consulta")
public class empleadoController {

	@Autowired
	private empleadoServiceIface empleadoS;

	@GetMapping("/all")
	public ModelAndView listarEmpleados() {
		ModelAndView log = new ModelAndView();
		List<empleadoEntity> empleados = empleadoS.getAll();
		log.addObject("Lista", empleados);
		log.setViewName("empl");
		return log;
	}

	@GetMapping("/empl/{id}")
	public Optional<empleadoEntity> getById(@PathVariable int id) {
		return empleadoS.getById(id);
	}
    @PostMapping("/insert")
    @ResponseStatus(code = HttpStatus.CREATED)
	public empleadoEntity insertEmpleado(@RequestBody empleadoEntity empleado) throws Exception {
		return empleadoS.insertEmpleado(empleado);
	}

}
