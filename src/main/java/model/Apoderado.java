package model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "apoderados")
public class Apoderado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "no puede estar vacio.")
	@Size(min = 2, max = 40, message = "tiene que ser entre 2 y 50 caracteres.")
	private String nombres;
	
	@Column(name = "apellido_paterno")
	@NotEmpty(message = "no puede estar vacío.")
	@Size(min = 2, max = 20, message = "Tiene que ser entre 2 y 15 caracteres.")
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno")
	@NotEmpty(message = "No puede estar vacío.")
	@Size(min = 2, max = 20, message = "Tiene que ser entre 2 y 20 caracteres.")
	private String apellidoMaterno;

	@NotEmpty(message = "no puede estar vacío.")
	private String dni;
	
	@NotEmpty(message = "no puede estar vacío.")
	private String celular;
	
	public Apoderado() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	private static final long serialVersionUID = 1L;
	
}
