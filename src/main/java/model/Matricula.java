package model;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
@Table(name = "matriculas")
public class Matricula implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "no puede estar vacío")
	private String anio;

	@NotEmpty(message = "no puede estar vacío")
	@Size(min = 8, max = 30, message = "tiene que ser entre 8 y 30 caracteres.")
	private String iEProcedencia;

	private String detalle;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@NotNull(message = "no puede estar vacío")
	@JoinColumn(name = "estudiante_id", nullable = false)
	private Estudiante estudiante;

	public Matricula() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getiEProcedencia() {
		return iEProcedencia;
	}

	public void setiEProcedencia(String iEProcedencia) {
		this.iEProcedencia = iEProcedencia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	private static final long serialVersionUID = 1L;

}
