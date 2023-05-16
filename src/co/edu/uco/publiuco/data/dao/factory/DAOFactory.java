package co.edu.uco.publiuco.data.dao.factory;

import co.edu.uco.publiuco.data.dao.*;

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
	
	protected abstract void openConection();
	
	public abstract void closeConection();
	
	public abstract void initTransaction();
	
	public abstract void commitTransaction();
	
	public abstract void rollbackTransaction();
		
	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();

	public abstract AdministradorCategoriaDAO getAdministradorCategoriaDAO();
	
	public abstract CalificacionDAO getCalificacionDAO();

	public abstract CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO();

	public abstract CategoriaDAO getCategoriaDAO();
	
	public abstract ComentarioLectorDAO getComentarioLectorDAO();
	
	public abstract ComentarioRevisorDAO getComentarioRevisorDAO();

	public abstract EscritorDAO getEscritorDAO();
	
	public abstract EscritorPublicacionDAO getEscritorPublicacionDAO();
	
	public abstract EstadoDAO getEstadoDAO();
	
	public abstract HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO();
	
	public abstract LectorDAO getLectorDAO();

	public abstract ObservacionRevisionDAO getObservacionRevisionDAO();
	
	public abstract PaisDAO getPaisDAO();
	
	public abstract PalabraClavePublicacionDAO getPalabraClavePublicacionDAO();
	
	public abstract PerfilDAO getPerfilDAO();

	public abstract PersonaDAO getPersonaDAO();
	
	public abstract PlanCategoriaDAO getPlanCategoriaDAO();
	
	public abstract PlanPublicacionDAO getPlanPublicacionDAO();
	
	public abstract PreferenciaEscritorDAO getPreferenciaEscritorDAO();
	public abstract PreferenciaCategoriaDAO getPreferenciaCategoriaDAO();
	
	public abstract PublicacionDAO getPublicacionDAO();
	
	public abstract ReporteDAO getReporteDAO();
	
	public abstract RespuestaDAO getRespuestaDAO();

	public abstract RevisionDAO getRevisionDAO();

	public abstract RevisorDAO getRevisorDAO();

	public abstract RevisorRevisionDAO getRevisorRevisionDAO();

	public abstract SuscripcionCategoriaDAO getuSuscripcionCategoriaDAO();

	public abstract SuscripcionPublicacionDAO getSuscripcionPublicacionDAO();

	public abstract TipoAccesoDAO getTipoAccesoDAO();

	public abstract TipoComentarioRevisorDAO getTipoComentarioDAO();

	public abstract TipoEscritorDAO getTipoEscritorDAO();

	public abstract TipoEstadoDAO getTipoEstadoDAO();

	public abstract TipoIdentificacionDAO getTipoIdentificacionDAO();

	public abstract TipoReporteDAO getTipoReporteDAO();

	public abstract TipoRevisionDAO getTipoRevisionDAO();

	public abstract VersionDAO getVersionDAO();


}
