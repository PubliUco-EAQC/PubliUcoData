package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoDataException;
import co.edu.uco.publiuco.entities.EstadoEntity;
import co.edu.uco.publiuco.utils.UtilSql;

public abstract class SqlDAO <E>{

	private Connection connection;
	
	protected SqlDAO(final Connection connection) {
		setConnection(connection);
	}
	
	protected final Connection getConnection() {
		return connection;
	}
	
	private final void setConnection(final Connection connection) {
		
		if(!UtilSql.connectionIsOpen(connection)) {
			var userMessage = "Se ha presentado un problema tratando de llevar a cabo la operacion deseada. Por favor intente de nuevo y si el problema persiste, contacte al administrador de la aplicacion";
			var technicalMessage = "No se ha podido crear el SqlDAO, debido a que la conexion no esta abierta...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage);
		}
		
		this.connection = connection;
	}
	
	protected abstract String preparedSelect();
	
	protected abstract String preparedFrom();

	protected abstract String preparedWhere(E entity, List<Object> parameters);
	
	protected abstract String preparedOrderBy();

	protected abstract void setParameters(PreparedStatement preparedStatement, List<Object> parameters);
	
	protected abstract List<E> executeQuery(PreparedStatement preparedStatement);

}
