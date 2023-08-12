package service;

import java.util.Optional;

import model.Asignacion;

public interface AsignacionService {

	public Asignacion save(Asignacion asignacion, Long idClase);

	public Asignacion update(Asignacion asignacion);

	public Optional<Asignacion> getAsignacionoById(Long id);

	public boolean deleteById(Long id);

}
