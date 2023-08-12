package services;

import java.util.Optional;

import models.Usuario;

public interface IUsuarioService {

	Optional<Usuario> findByUsername(String username);

	Boolean existsByUsername(String username);

	Usuario save(Usuario usuario);

	Usuario findById(Long id);

	void delete(Long id);

}
