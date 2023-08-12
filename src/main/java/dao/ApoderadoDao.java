package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Apoderado;

public interface ApoderadoDao extends JpaRepository<Apoderado, Long> {

	public Apoderado findByDni(String dni);

}
