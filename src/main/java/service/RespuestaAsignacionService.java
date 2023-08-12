package service;

import java.util.List;
import java.util.Optional;

import model.RespuestaAsignacion;

public interface RespuestaAsignacionService {

	public RespuestaAsignacion save(RespuestaAsignacion respuestaAsignacion, Long idAsignacion);

	public RespuestaAsignacion update(RespuestaAsignacion respuestaAsignacion);

	public Optional<RespuestaAsignacion> findById(Long id);

	public List<RespuestaAsignacion> findAllByAsignacion(Long idAsignacion);

	public boolean delete(Long id);

	public Optional<RespuestaAsignacion> findPorDniEstudianteAndAsignacion(String dniEstudiante, Long idAsignacion);

}
