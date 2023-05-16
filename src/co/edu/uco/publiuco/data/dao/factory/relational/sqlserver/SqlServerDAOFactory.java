package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.*;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoSqlServerDAO;

public final class SqlServerDAOFactory extends DAOFactory{

	private Connection connection;
		
	public SqlServerDAOFactory() {
		openConection();
	}
	
	@Override
	protected final void openConection() {
		// It's my homework
		connection = null;
		
	}

	@Override
	public final void closeConection() {
		// It's my homework
		
	}

	@Override
	public final void initTransaction() {
		// It's my homework (serAutoCommit -> false)
		
	}

	@Override
	public final void commitTransaction() {
		// It's my homework (Commit)
		
	}

	@Override
	public final void rollbackTransaction() {
		// It's my homework (rollBack)
		
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return null;
	}

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
		return null;
	}

	@Override
	public CalificacionDAO getCalificacionDAO() {
		return null;
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO() {
		return null;
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		return null;
	}

	@Override
	public ComentarioLectorDAO getComentarioLectorDAO() {
		return null;
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisorDAO() {
		return null;
	}

	@Override
	public EscritorDAO getEscritorDAO() {
		return null;
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacionDAO() {
		return null;
	}

	@Override
	public final EstadoDAO getEstadoDAO() {
		return new EstadoSqlServerDAO(connection);
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO() {
		return null;
	}

	@Override
	public LectorDAO getLectorDAO() {
		return null;
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevisionDAO() {
		return null;
	}

	@Override
	public PaisDAO getPaisDAO() {
		return null;
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacionDAO() {
		return null;
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		return null;
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		return null;
	}

	@Override
	public PlanCategoriaDAO getPlanCategoriaDAO() {
		return null;
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacionDAO() {
		return null;
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		return null;
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		return null;
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		return null;
	}

	@Override
	public ReporteDAO getReporteDAO() {
		return null;
	}

	@Override
	public RespuestaDAO getRespuestaDAO() {
		return null;
	}

	@Override
	public RevisionDAO getRevisionDAO() {
		return null;
	}

	@Override
	public RevisorDAO getRevisorDAO() {
		return null;
	}

	@Override
	public RevisorRevisionDAO getRevisorRevisionDAO() {
		return null;
	}

	@Override
	public SuscripcionCategoriaDAO getuSuscripcionCategoriaDAO() {
		return null;
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacionDAO() {
		return null;
	}

	@Override
	public TipoAccesoDAO getTipoAccesoDAO() {
		return null;
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentarioDAO() {
		return null;
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		return null;
	}

	@Override
	public TipoEstadoDAO getTipoEstadoDAO() {
		return null;
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return null;
	}

	@Override
	public TipoReporteDAO getTipoReporteDAO() {
		return null;
	}

	@Override
	public TipoRevisionDAO getTipoRevisionDAO() {
		return null;
	}

	@Override
	public VersionDAO getVersionDAO() {
		return null;
	}


}
