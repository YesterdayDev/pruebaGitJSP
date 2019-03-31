package dao;

import interfaces.interfaceUsuario;

public abstract class DAOFactory {
	public static final int MYSQL = 1;
	public static final int SQLSERVER = 2;
	
	public abstract interfaceUsuario getUsuario();
	
	public static DAOFactory getDAOFactory(int whichFactory)
	{
		switch(whichFactory)
		{
		case MYSQL:
				return new MysqlDAOFactory();
		case SQLSERVER:
			
		}
		return null;
		
	}
	
}
