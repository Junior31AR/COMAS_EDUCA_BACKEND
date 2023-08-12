package service;

import java.util.List;
import java.util.Optional;

import model.Apoderado;

public interface ApoderadoService {

	public Apoderado save(Apoderado apoderado);

	public Optional<Apoderado> getApoderadoById(Long id);

	public List<Apoderado> findAll();

	public boolean delete(Long id);

	public Apoderado findByDni(String dni);

}
