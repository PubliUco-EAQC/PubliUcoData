package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;

public final class SqlServerDAOFactory extends DAOFactory{

	private Connection connection;
		
	public SqlServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected final void abrirConexion() {
		// It's my homework
		connection = null;
		
	}

	@Override
	public final void cerrarConexion() {
		// It's my homework
		
	}

	@Override
	public final void iniciarTransaccion() {
		// It's my homework (serAutoCommit -> false)
		
	}

	@Override
	public final void confirmaTransaccion() {
		// It's my homework (Commit)
		
	}

	@Override
	public final void cancelarTransaccion() {
		// It's my homework (rollBack)
		
	}

	@Override
	public final EstadoDAO getEstado() {
		return new EstadoSqlServerDAO(connection);
	}

	@Override
	public final TipoRelacionInstitucionDAO getTipoRelacionInstitucion() {
		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}

}