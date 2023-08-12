package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Asistencia;

public interface AsistenciaDao extends JpaRepository<Asistencia, Long> {

    public List<Asistencia> findByFecha(String fecha);
	
    @Query("FROM Asistencia a WHERE a.fecha = ?1 and a.estudiante.aulaEstudiante.id = ?2")
    public List<Asistencia> findAsistenciaByFechaAula(String fecha, Long idAula);
	
}
