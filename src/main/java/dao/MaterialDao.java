package dao;

import org.springframework.data.repository.CrudRepository;

import model.Material;

public interface MaterialDao extends CrudRepository<Material, Long> {

}
