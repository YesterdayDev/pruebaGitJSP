package dao;

import interfaces.interfaceUsuario;

public class MysqlDAOFactory extends DAOFactory {

	@Override
	public interfaceUsuario getUsuario() {
	
		return new mysqlUsuarioDAO();
		
	}
}
