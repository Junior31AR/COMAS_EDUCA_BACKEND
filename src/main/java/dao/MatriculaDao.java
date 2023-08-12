package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.DiaSemana;
import model.Matricula;
import model.Nivel;
import model.Turno;

public interface MatriculaDao extends JpaRepository<Matricula, Long> {

	@Query("FROM Turno")
	public List<Turno> getTurnos();

	@Query("FROM Nivel")
	public List<Nivel> getNiveles();

	@Query("FROM DiaSemana")
	public List<DiaSemana> getDias();

	@Query("FROM Matricula m where m.estudiante.id = ?1")
	public List<Matricula> getMatriculasPorEstudiante(Long id);

}
