package co.konecto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud")
public class solicitudEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_solicitud")
	private int solicitudId;
	@Column(name = "codigo")
	private String code;
	@Column(name = "descripcion")
	private String description;
	@Column(name = "resumen")
	private String resum;
	
	@ManyToOne
	@JoinColumn(name = "ID_empleado")
	private empleadoEntity emplId;

	public solicitudEntity() {

	}

	public solicitudEntity(int solicitudId, String code, String description, String resum, empleadoEntity emplId) {
		super();
		this.solicitudId = solicitudId;
		this.code = code;
		this.description = description;
		this.resum = resum;
		this.emplId = emplId;
	}

	public int getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(int solicitudId) {
		this.solicitudId = solicitudId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResum() {
		return resum;
	}

	public void setResum(String resum) {
		this.resum = resum;
	}

	public empleadoEntity getEmplId() {
		return emplId;
	}

	public void setEmplId(empleadoEntity emplId) {
		this.emplId = emplId;
	}

	private static final long serialVersionUID = 1L;

}
