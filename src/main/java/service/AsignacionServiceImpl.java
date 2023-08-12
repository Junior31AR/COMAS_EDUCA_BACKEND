package service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AsignacionDao;
import model.Asignacion;
import model.Clase;

@Service
public class AsignacionServiceImpl implements AsignacionService {

	@Autowired
	private AsignacionDao asignacionDao;

	@Autowired
	private ClaseService claseService;

	@Override
	public Asignacion save(Asignacion asignacion, Long idClase) {

		Clase claseEncontrada = claseService.getClaseById(idClase).orElseThrow();
		asignacion.setClase(claseEncontrada);

		return asignacionDao.save(asignacion);
	}

	@Override
	public Asignacion update(Asignacion asignacion) {
		return asignacionDao.save(asignacion);
	}

	@Override
	public Optional<Asignacion> getAsignacionoById(Long id) {
		Asignacion asignacionEncontrada = asignacionDao.findById(id).orElseThrow();
		LocalDateTime fechaAhora = LocalDateTime.now();

		asignacionEncontrada.setActivo(fechaAhora.isBefore(asignacionEncontrada.getFechaFin())
				&& fechaAhora.isAfter(asignacionEncontrada.getFechaInicio()));
		asignacionEncontrada = asignacionDao.save(asignacionEncontrada);

		return Optional.of(asignacionEncontrada);
	}

	@Override
	public boolean deleteById(Long id) {
		return getAsignacionoById(id).map(c -> {
			asignacionDao.deleteById(id);
			return true;
		}).orElse(false);
	}

}
