package model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "clases")
public class Clase implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull(message = "no puede estar vacío.")
	@JoinColumn(name = "aula_id")	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Aula aula;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "curso_id", nullable = false)
	@JsonIgnoreProperties({"clases", "hibernateLazyInitializer", "handler"})
	private Curso curso;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " empleado_id", nullable = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Empleado empleado;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "clase_id")
	private List<Material> materiales = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "clase")
	private List<Frecuencia> frecuencias = new ArrayList<>();
	
	public Clase() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	public List<Frecuencia> getFrecuencias() {
		return frecuencias;
	}

	public void setFrecuencias(List<Frecuencia> frecuencias) {
		this.frecuencias = frecuencias;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
