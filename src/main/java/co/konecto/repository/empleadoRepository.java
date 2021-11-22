package co.konecto.repository;

import org.springframework.data.repository.CrudRepository;

import co.konecto.model.empleadoEntity;

public interface empleadoRepository extends CrudRepository<empleadoEntity, Integer> {

}
