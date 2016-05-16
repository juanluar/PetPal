/**
 * 
 */
package es.ucm.petpal.negocio.usuario;

import java.io.Serializable;

import es.ucm.petpal.integracion.Usuario;

public class TransferUsuario implements Serializable {

	static final long serialVersionUID = 1L;

	private Integer id;

	private String nombre;

	private String apellidos;

	private String avatar;

	private String ciudad;

	private Integer telefono;

	private String email;

	private String color;

	public TransferUsuario(){	}

	public TransferUsuario(Usuario usuario){
		this.id = usuario.getId();
		this.nombre = usuario.getNombre();
		this.apellidos = usuario.getApellidos();
		this.avatar = usuario.getAvatar();
		this.telefono = usuario.getTelefono();
		this.ciudad = usuario.getCiudad();
		this.email = usuario.getEmail();
		this.color = usuario.getColor();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}