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
import co.edu.uco.publiuco.data.dao.HistorialAccesoPublicacionDAO;
import co.edu.uco.publiuco.data.dao.LectorDAO;
import co.edu.uco.publiuco.data.dao.ObservacionRevisionDAO;
import co.edu.uco.publiuco.data.dao.PaisDAO;
import co.edu.uco.publiuco.data.dao.PalabraClavePublicacionDAO;
import co.edu.uco.publiuco.data.dao.PerfilDAO;
import co.edu.uco.publiuco.data.dao.PersonaDAO;
import co.edu.uco.publiuco.data.dao.PlanCategoriaDAO;
import co.edu.uco.publiuco.data.dao.PlanPublicacionDAO;
import co.edu.uco.publiuco.data.dao.PreferenciaEscritorDAO;
import co.edu.uco.publiuco.data.dao.PublicacionDAO;
import co.edu.uco.publiuco.data.dao.ReporteDAO;
import co.edu.uco.publiuco.data.dao.RespuestaDAO;
import co.edu.uco.publiuco.data.dao.RevisionDAO;
import co.edu.uco.publiuco.data.dao.RevisorDAO;
import co.edu.uco.publiuco.data.dao.RevisorRevisionDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionCategoriaDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionPublicacionDAO;
import co.edu.uco.publiuco.data.dao.TipoAccesoDAO;
import co.edu.uco.publiuco.data.dao.TipoComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.TipoEscritorDAO;
import co.edu.uco.publiuco.data.dao.TipoEstadoDAO;
import co.edu.uco.publiuco.data.dao.TipoIdentificacionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoReporteDAO;
import co.edu.uco.publiuco.data.dao.TipoRevisionDAO;
import co.edu.uco.publiuco.data.dao.VersionDAO;
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
	
	public abstract ComentarioLectorDAO getComentarioLector();
	
	public abstract ComentarioRevisorDAO getComentarioRevisor();

	public abstract EscritorDAO getEscritor();
	
	public abstract EscritorPublicacionDAO getEscritorPublicacion();
	
	public abstract EstadoDAO getEstado();
	
	public abstract HistorialAccesoPublicacionDAO getHistorialAccesoPublicacion();
	
	public abstract LectorDAO getLector();

	public abstract ObservacionRevisionDAO getObservacionRevision();
	
	public abstract PaisDAO getPais();
	
	public abstract PalabraClavePublicacionDAO getPalabraClavePublicacion();
	
	public abstract PerfilDAO getPerfil();

	public abstract PersonaDAO getPersona();
	
	public abstract PlanCategoriaDAO getPlanCategoria();
	
	public abstract PlanPublicacionDAO getPlanPublicacion();
	
	public abstract PreferenciaEscritorDAO getPreferenciaEscritor();
	
	public abstract PublicacionDAO getPublicacion();
	
	public abstract ReporteDAO getReporte();
	
	public abstract RespuestaDAO getRespuesta();

	public abstract RevisionDAO getRevision();

	public abstract RevisorDAO getRevisor();

	public abstract RevisorRevisionDAO getRevisorRevision();

	public abstract SuscripcionCategoriaDAO getuSuscripcionCategoria();

	public abstract SuscripcionPublicacionDAO getSuscripcionPublicacion();

	public abstract TipoAccesoDAO getTipoAcceso();

	public abstract TipoComentarioRevisorDAO getTipoComentario();

	public abstract TipoEscritorDAO getTipoEscritor();

	public abstract TipoEstadoDAO getTipoEstado();

	public abstract TipoIdentificacionDAO getTipoIdentificacion();

	public abstract TipoReporteDAO getTipoReporte();

	public abstract TipoRevisionDAO getTipoRevision();

	public abstract VersionDAO getVersion();

}
