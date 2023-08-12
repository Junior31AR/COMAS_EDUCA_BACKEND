package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import enums.RolNombre;
import models.Rol;

public interface IRolDao extends JpaRepository<Rol, Long> {

	Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
