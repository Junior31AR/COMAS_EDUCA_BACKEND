package service;

import java.util.List;
import java.util.Optional;

import model.DiaSemana;
import model.Matricula;
import model.Nivel;
import model.Turno;

public interface MatriculaService {

	public Matricula save(Matricula matricula);

	public Optional<Matricula> getMatriculaById(Long id);

	public List<Matricula> findAll();

	public boolean delete(Long id);

	public List<Nivel> getNiveles();

	public List<Turno> getTurnos();

	public List<DiaSemana> getDias();

	public List<Matricula> getMatriculasPorEstudiante(Long id);

}
