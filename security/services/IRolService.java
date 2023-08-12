package services;

import java.util.Optional;

import enums.RolNombre;
import models.Rol;

public interface IRolService {

	Optional<Rol> findByRolNombre(RolNombre rolNombre);

	void save(Rol rol);

}
