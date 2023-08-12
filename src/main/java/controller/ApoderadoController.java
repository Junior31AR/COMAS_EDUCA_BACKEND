package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Apoderado;

import java.util.HashMap;
import java.util.Map;

import service.ApoderadoService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/apoderados")
public class ApoderadoController {

	@Autowired
	private ApoderadoService apoderadoService;

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/findByDni")
	public ResponseEntity<?> getApoderado(@RequestParam("dni") String dni) {

		Apoderado apoderado = null;
		Map<String, Object> response = new HashMap<>();

		try {
			apoderado = apoderadoService.findByDni(dni);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al consultar al apoderado en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));

			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (apoderado == null) {
			response.put("mensaje", "El apoderado con el DNI: ".concat(dni.concat(" no existe en la base de datos")));
		}

		response.put("apoderado", apoderado);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
