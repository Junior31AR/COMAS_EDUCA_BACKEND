package model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "aulas")
public class Aula implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 2, max = 20, message = "Tiene que ser entre 2 y 25 caracteres")
	private String nombre;

	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 1, max = 10, message = "tiene que ser entre 2 y 10 caracteres")
	private String seccion;

	@NotNull(message = "no puede estar vacio")
	private Integer capacidad;

	@NotNull(message = "no puede estar vacio")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "aulas", "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "grado_id")
	private Grado gradoAula;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "turno_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Turno turno;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nivel_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Nivel nivel;

	public Aula() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Grado getGradoAula() {
		return gradoAula;
	}

	public void setGradoAula(Grado gradoAula) {
		this.gradoAula = gradoAula;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
