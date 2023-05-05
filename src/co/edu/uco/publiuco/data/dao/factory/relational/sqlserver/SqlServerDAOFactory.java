package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;

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

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CalificacionDAO getCalificacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaDAO getCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorDAO getEscritor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LectorDAO getLector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaisDAO getPais() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PerfilDAO getPerfil() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaDAO getPersona() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanCategoriaDAO getPlanCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublicacionDAO getPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioLectorDAO getComentarioLector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReporteDAO getReporte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaDAO getRespuesta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisionDAO getRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisorDAO getRevisor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisorRevisionDAO getRevisorRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuscripcionCategoriaDAO getuSuscripcionCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoAccesoDAO getTipoAcceso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEscritorDAO getTipoEscritor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEstadoDAO getTipoEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoReporteDAO getTipoReporte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRevisionDAO getTipoRevision() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VersionDAO getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

}
