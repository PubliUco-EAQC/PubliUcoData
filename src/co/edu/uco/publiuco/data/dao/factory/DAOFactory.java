package co.edu.uco.publiuco.data.dao.factory;

import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CalificacionDAO;
import co.edu.uco.publiuco.data.dao.CategoriaAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CategoriaDAO;
import co.edu.uco.publiuco.data.dao.ComentarioLectorDAO;
import co.edu.uco.publiuco.data.dao.ComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.EscritorDAO;
import co.edu.uco.publiuco.data.dao.EscritorPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.postgresql.PostgreSqlServerDAOFactory;
import co.edu.uco.publiuco.data.dao.factory.relational.sqlserver.SqlServerDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getFactory(final Factory factory) {
		
		DAOFactory daoFactory;
		
		switch (factory) {
		case SQLSERVER: {
			daoFactory = new SqlServerDAOFactory();
			break;
		}
		case POSTGRESQL: {
			daoFactory = new PostgreSqlServerDAOFactory();
			break;
		}
		default:
			throw new IllegalArgumentException("Not implementd yet!");
		}
		return daoFactory;
	}
	
	protected abstract void abrirConexion();
	
	public abstract void cerrarConexion();
	
	public abstract void iniciarTransaccion();
	
	public abstract void confirmaTransaccion();
	
	public abstract void cancelarTransaccion();
		
	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucion();

	public abstract AdministradorCategoriaDAO getAdministradorCategoria();
	
	public abstract CalificacionDAO getCalificacion();

	public abstract CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoria();

	public abstract CategoriaDAO getCategoria();
	
	public abstract ComentarioRevisorDAO getComentarioRevisor();

	public abstract EscritorDAO getEscritor();
	
	public abstract EscritorPublicacionDAO getEscritorPublicacion();
	
	public abstract EstadoDAO getEstado();

	
}
