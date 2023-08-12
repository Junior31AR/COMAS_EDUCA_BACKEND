package dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.RespuestaAsignacion;

public interface RespuestAsignacionDao extends JpaRepository<RespuestaAsignacion, Long> {

	@Query("FROM RespuestaAsignacion r WHERE r.asignacion.id = ?1")
	public List<RespuestaAsignacion> findAllByAsignacion(Long idAsignacion);

	@Query("FROM RespuestaAsignacion r WHERE r.dniEstudiante = ?1 and r.asignacion.id = ?2")
	public Optional<RespuestaAsignacion> findPorDniEstudianteAndAsignacion(String dniEstudiante, Long idAsignacion);

}
