package interfaces;

import java.util.List;

import entities.Usuario;

public interface interfaceUsuario {
	public List<Usuario> listarUsuarios();
	public int insertarUsuario(Usuario objUsuario);
	public int actualizarUsuario(Usuario objUsuario);
	public int eliminarUsuario(int codigoUsuario);
	public Usuario buscarUsuario(int codUsuario);
}
