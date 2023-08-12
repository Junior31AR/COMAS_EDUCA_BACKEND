package service;

import java.util.List;
import java.util.Optional;

import model.Aula;
import model.Clase;
import model.Estudiante;

public interface AulaService {

	public Aula save(Aula aula);

	public Optional<Aula> getAulaById(Long id);

	public List<Aula> findAll();

	public boolean delete(Long id);

	public List<Estudiante> findEstudiantesAula(Long id);

	public List<Clase> findClasesAula(Long id);

}
