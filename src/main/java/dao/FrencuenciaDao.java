package dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import model.Frecuencia;

public interface FrencuenciaDao extends CrudRepository<Frecuencia, Long> {

	@Query("FROM Frecuencia f WHERE f.clase = null")
	public List<Frecuencia> findAllFrecuenciaNulos();

}
