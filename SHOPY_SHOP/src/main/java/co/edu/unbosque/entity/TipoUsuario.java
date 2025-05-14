package co.edu.unbosque.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipo_usuario database table.
 * 
 */
@Entity
@Table(name="tipo_usuario")

public class TipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	private byte estado;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column( name= "id", nullable=false)
	private Long id;

	public TipoUsuario() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}