package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import model.Clase;
import model.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {

	public Empleado save(Empleado empleado);

	public Optional<Empleado> getEmpleadoById(Long id);

	public List<Empleado> findAll();

	public Page<Empleado> findAll(Pageable pageable);

	public boolean delete(Long id);

	public List<Clase> findClasesProfesor(Long id);

	public Empleado findByDni(String dni);

}
