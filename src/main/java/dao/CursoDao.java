package dao;

import org.springframework.data.repository.CrudRepository;

import model.Curso;

public interface CursoDao extends CrudRepository<Curso, Long> {

}
