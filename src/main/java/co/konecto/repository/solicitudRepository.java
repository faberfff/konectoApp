package co.konecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.konecto.model.solicitudEntity;
@Repository
public interface solicitudRepository extends CrudRepository<solicitudEntity, Integer> {
	
	@Query(value ="SELECT s.ID_solicitud, s.codigo, s.descripcion, s.resumen e.nombre"
			    + "FROM solicitud s"
			    + "LEFT JOIN empleado e ON e.ID_empleado = s.ID_empleado"
			    + "where s.ID_solicitud = :idSolicitud ", nativeQuery = true)
	List<String> solicitudNameEmple(@Param("idSolicitud")int idSolicitud);
	

}
