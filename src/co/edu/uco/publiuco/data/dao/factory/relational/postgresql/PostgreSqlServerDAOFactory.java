package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;


import co.edu.uco.publiuco.crosscutting.utils.UtilSql;
import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CalificacionDAO;
import co.edu.uco.publiuco.data.dao.CategoriaAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CategoriaDAO;
import co.edu.uco.publiuco.data.dao.ComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.EscritorDAO;
import co.edu.uco.publiuco.data.dao.EscritorPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.AdministradorCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CalificacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CategoriaAdministradorCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.ComentarioRevisorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EscritorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EscritorPublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EstadoPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoRelacionInstitucionPostgreSqlDAO;

public final class PostgreSqlServerDAOFactory extends DAOFactory{

	private Connection connection;
		
	public PostgreSqlServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected final void abrirConexion() {
		// It's my homework
		connection = null;
		
	}

	@Override
	public final void cerrarConexion() {
		UtilSql.closeConnection(connection);
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
	public final TipoRelacionInstitucionDAO getTipoRelacionInstitucion() {
		return new TipoRelacionInstitucionPostgreSqlDAO(connection);
	}

	@Override
	public final AdministradorCategoriaDAO getAdministradorCategoria() {
		return new AdministradorCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public CalificacionDAO getCalificacion() {
		return new CalificacionPostgreSqlDAO(connection);
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoria() {
		return new CategoriaAdministradorCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public CategoriaDAO getCategoria() {
		return new CategoriaPostgreSqlDAO(connection);
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisor() {
		return new ComentarioRevisorPostgreSqlDAO(connection);
	}

	@Override
	public EscritorDAO getEscritor() {
		return new EscritorPostgreSqlDAO(connection);
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacion() {
		return new EscritorPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public final EstadoDAO getEstado() {
		return new EstadoPostgreSqlDAO(connection);
	}
	
}
