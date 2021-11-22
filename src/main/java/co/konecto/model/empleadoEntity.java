package co.konecto.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class empleadoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_empleado")
	private int empleadoId;
	@Column(name = "fecha_Ingreso")
	private LocalDate fechaIng;
	@Column(name = "nombre")
	private String name;
	@Column(name = "salario")
	private Double salary;

	public empleadoEntity() {

	}

	public empleadoEntity(int empleadoId, LocalDate fechaIng, String name, Double salary) {
		super();
		this.empleadoId = empleadoId;
		this.fechaIng = fechaIng;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public LocalDate getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(LocalDate fechaIng) {
		this.fechaIng = fechaIng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private static final long serialVersionUID = 1L;

}
