package service;

import java.util.List;

import model.Asistencia;
import reportDto.AsistenciaReporte;

public interface AsistenciaService {

	byte[] generarReporteAsistencia(String tipo, String fecha);

	public List<Asistencia> findByFecha(String fecha);

	public List<Asistencia> findAsistenciaByFechaAula(String fecha, Long idAula);

	public AsistenciaReporte obtenerDatosAsistenciaPorDia(String fecha);

	public List<Asistencia> updateAsistencias(List<Asistencia> asistencias);

}
