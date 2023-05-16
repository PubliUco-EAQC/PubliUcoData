package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.*;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.*;
import co.edu.uco.publiuco.utils.UtilSql;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;

public final class PostgreSqlServerDAOFactory extends DAOFactory{

	private Connection connection;
		
	public PostgreSqlServerDAOFactory() {
		openConection();
	}
	
	@Override
	protected final void openConection() {
		// It's my homework
		connection = null;
		
	}

	@Override
	public final void closeConection() {
		UtilSql.closeConnection(connection);
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
	public final TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionPostgreSqlDAO(connection);
	}

	@Override
	public final AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
		return new AdministradorCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public CalificacionDAO getCalificacionDAO() {
		return new CalificacionPostgreSqlDAO(connection);
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO() {
		return new CategoriaAdministradorCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		return new CategoriaPostgreSqlDAO(connection);
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisorDAO() {
		return new ComentarioRevisorPostgreSqlDAO(connection);
	}

	@Override
	public EscritorDAO getEscritorDAO() {
		return new EscritorPostgreSqlDAO(connection);
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacionDAO() {
		return new EscritorPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public final EstadoDAO getEstadoDAO() {
		return new EstadoPostgreSqlDAO(connection);
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO() {
		return new HistorialAccesoPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public LectorDAO getLectorDAO() {
		return new LectorPostgreSqlDAO(connection);
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevisionDAO() {
		return new ObservacionRevisionPostgreSqlDAO(connection);
	}

	@Override
	public PaisDAO getPaisDAO() {
		return new PaisPostgreSqlDAO(connection);
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacionDAO() {
		return new PalabraClavePublicacionPostgreSqlDAO(connection);
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		return new PerfilPostgreSqlDAO(connection);
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		return new PersonaPostgreSqlDAO(connection);
	}

	@Override
	public PlanCategoriaDAO getPlanCategoriaDAO() {
		return new PlanCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacionDAO() {
		return new PlanPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		return new PreferenciaCategoriaPostgreSqlDAO(connection);
	}
	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		return new PreferenciaEscritorPostgreSqlDAO(connection);
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		return new PublicacionPostgreSqlDAO(connection);
	}

	@Override
	public ComentarioLectorDAO getComentarioLectorDAO() {
		return new ComentarioLectorPostgreSqlDAO(connection);
	}

	@Override
	public ReporteDAO getReporteDAO() {
		return new ReportePostgreSqlDAO(connection);
	}

	@Override
	public RespuestaDAO getRespuestaDAO() {
		return new RespuestaPostgreSqlDAO(connection);
	}

	@Override
	public RevisionDAO getRevisionDAO() {
		return new RevisionPosgreSqlDAO(connection);
	}

	@Override
	public RevisorDAO getRevisorDAO() {
		return new RevisorPostgreSqlDAO(connection);
	}

	@Override
	public RevisorRevisionDAO getRevisorRevisionDAO() {
		return new RevisorRevisionPostgreSqlDAO(connection);
	}

	@Override
	public SuscripcionCategoriaDAO getuSuscripcionCategoriaDAO() {
		return new SuscripcionCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacionDAO() {
		return new SuscripcionPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public TipoAccesoDAO getTipoAccesoDAO() {
		return new TipoAccesoPostgreSqlDAO(connection);
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentarioDAO() {
		return new TipoComentarioRevisorPostgreSqlDAO(connection);
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		return new TipoEscritorPostgreSqlDAO(connection);
	}

	@Override
	public TipoEstadoDAO getTipoEstadoDAO() {
		return new TipoEstadoPostgreSqlDAO(connection);
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return new TipoIdentificacionPostgreSqlDAO(connection);
	}

	@Override
	public TipoReporteDAO getTipoReporteDAO() {
		return new TipoReportePostgreSqlDAO(connection);
	}

	@Override
	public TipoRevisionDAO getTipoRevisionDAO() {
		return new TipoRevisionPostgreSqlDAO(connection);
	}

	@Override
	public VersionDAO getVersionDAO() {
		return new VersionPostgreSqlDAO(connection);
	}


}
