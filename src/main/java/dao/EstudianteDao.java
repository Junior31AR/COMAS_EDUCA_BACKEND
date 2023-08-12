package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Estudiante;

public interface EstudianteDao extends JpaRepository<Estudiante, Long> {

	@Query("FROM Estudiante e where e.usuario.username = ?1 and e.usuario.password = ?2 ")
	public Estudiante loginUsuario(String username, String password);

	public Estudiante findByDniAndDni(String username, String password);

	public Estudiante findByDni(String dni);

}
