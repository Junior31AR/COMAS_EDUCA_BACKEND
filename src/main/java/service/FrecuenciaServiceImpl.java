package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FrencuenciaDao;
import model.Frecuencia;

import java.util.List;

@Service
public class FrecuenciaServiceImpl implements FrecuenciaService {

	@Autowired
	private FrencuenciaDao frencuenciaDao;

	@Override
	public void deleFrecuenciasNulas() {
		List<Frecuencia> frecuenciasOrfans = frencuenciaDao.findAllFrecuenciaNulos();
		frecuenciasOrfans.forEach(f -> delete(f.getId()));
	}

	@Override
	public void delete(Long id) {
		frencuenciaDao.deleteById(id);
	}

}
