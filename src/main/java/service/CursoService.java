package service;

import model.Curso;
import java.util.List;
import java.util.Optional;

public interface CursoService {

	public Curso save(Curso curso);

	public Optional<Curso> getCursoById(Long id);

	public List<Curso> findAll();

	public boolean delete(Long id);

}
