package service;

import java.util.List;
import java.util.Optional;

import model.Especialidad;

public interface EspecialidadService {

	public Especialidad save(Especialidad especialidad);

	public Optional<Especialidad> findById(Long id);

	public List<Especialidad> findAll();

	public Boolean deleteById(Long id);

}
