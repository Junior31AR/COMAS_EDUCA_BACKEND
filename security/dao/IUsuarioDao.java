package dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByUsername(String username);
	Boolean existsByUsername(String username);
	
}
