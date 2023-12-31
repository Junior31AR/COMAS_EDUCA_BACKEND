package service;

import java.util.List;
import java.util.Optional;

import model.Grado;

public interface GradoService {

	public Grado save(Grado grado);

	public Optional<Grado> getGradoById(Long id);

	public List<Grado> findAll();

	public boolean delete(Long id);

}
