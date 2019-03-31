package dao;

import java.util.List;

import entities.Usuario;
import interfaces.interfaceUsuario;

public class mysqlUsuarioDAO implements interfaceUsuario {

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertarUsuario(Usuario objUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizarUsuario(Usuario objUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarUsuario(int codigoUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario buscarUsuario(int codUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
