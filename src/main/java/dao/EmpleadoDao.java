package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Clase;
import model.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Long> {

	@Query("FROM Clase c WHERE c.empleado.id = ?1")
	public List<Clase> findClasesProfesor(Long id);

	public Empleado findByDni(String dni);

}
