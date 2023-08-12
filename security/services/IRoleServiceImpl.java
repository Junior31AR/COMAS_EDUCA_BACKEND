package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IRolDao;
import enums.RolNombre;
import jakarta.transaction.Transactional;
import models.Rol;

@Service
@Transactional
public class IRoleServiceImpl implements IRolService {

	@Autowired
	private IRolDao rolDao;

	@Override
	public Optional<Rol> findByRolNombre(RolNombre rolNombre) {
		return rolDao.findByRolNombre(rolNombre);
	}

	@Override
	public void save(Rol rol) {
		rolDao.save(rol);
	}

}
