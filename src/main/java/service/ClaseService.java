package service;

import java.util.List;
import java.util.Optional;

import model.Asignacion;
import model.Clase;
import reportDto.CursoReporte;

public interface ClaseService {

	public Clase save(Clase clase);

	public Clase saveNoFrecuenciaUpdate(Clase clase);

	public Clase update(Clase clase);

	public Optional<Clase> getClaseById(Long id);

	public List<Clase> findAll();

	public boolean delete(Long id);

	byte[] generarReporteCurso(String tipo, Long idCurso, Long idGrado);

	public List<CursoReporte> getCursoReporte(Long idCurso, Long idAula);

	public List<Asignacion> asignacionesPorClase(Long idClase);

}
