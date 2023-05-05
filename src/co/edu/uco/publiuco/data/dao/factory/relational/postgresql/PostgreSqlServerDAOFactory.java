package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;

import co.edu.uco.publiuco.crosscutting.utils.UtilSql;
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
import co.edu.uco.publiuco.data.dao.relational.postgreSql.AdministradorCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CalificacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CategoriaAdministradorCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.CategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.ComentarioLectorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.ComentarioRevisorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EscritorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EscritorPublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.EstadoPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.HistorialAccesoPublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.LectorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.ObservacionRevisionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PaisPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PalabraClavePublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PerfilPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PersonaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PlanCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PlanPublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PreferenciaEscritorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.PublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.ReportePostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.RespuestaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.RevisionPosgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.RevisorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.RevisorRevisionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.SuscripcionCategoriaPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.SuscripcionPublicacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoAccesoPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoComentarioRevisorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoEscritorPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoEstadoPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoIdentificacionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoRelacionInstitucionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoReportePostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.TipoRevisionPostgreSqlDAO;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.VersionPostgreSqlDAO;

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

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacion() {
		return new HistorialAccesoPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public LectorDAO getLector() {
		return new LectorPostgreSqlDAO(connection);
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevision() {
		return new ObservacionRevisionPostgreSqlDAO(connection);
	}

	@Override
	public PaisDAO getPais() {
		return new PaisPostgreSqlDAO(connection);
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacion() {
		return new PalabraClavePublicacionPostgreSqlDAO(connection);
	}

	@Override
	public PerfilDAO getPerfil() {
		return new PerfilPostgreSqlDAO(connection);
	}

	@Override
	public PersonaDAO getPersona() {
		return new PersonaPostgreSqlDAO(connection);
	}

	@Override
	public PlanCategoriaDAO getPlanCategoria() {
		return new PlanCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacion() {
		return new PlanPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritor() {
		return new PreferenciaEscritorPostgreSqlDAO(connection);
	}

	@Override
	public PublicacionDAO getPublicacion() {
		return new PublicacionPostgreSqlDAO(connection);
	}

	@Override
	public ComentarioLectorDAO getComentarioLector() {
		return new ComentarioLectorPostgreSqlDAO(connection);
	}

	@Override
	public ReporteDAO getReporte() {
		return new ReportePostgreSqlDAO(connection);
	}

	@Override
	public RespuestaDAO getRespuesta() {
		return new RespuestaPostgreSqlDAO(connection);
	}

	@Override
	public RevisionDAO getRevision() {
		return new RevisionPosgreSqlDAO(connection);
	}

	@Override
	public RevisorDAO getRevisor() {
		return new RevisorPostgreSqlDAO(connection);
	}

	@Override
	public RevisorRevisionDAO getRevisorRevision() {
		return new RevisorRevisionPostgreSqlDAO(connection);
	}

	@Override
	public SuscripcionCategoriaDAO getuSuscripcionCategoria() {
		return new SuscripcionCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacion() {
		return new SuscripcionPublicacionPostgreSqlDAO(connection);
	}

	@Override
	public TipoAccesoDAO getTipoAcceso() {
		return new TipoAccesoPostgreSqlDAO(connection);
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentario() {
		return new TipoComentarioRevisorPostgreSqlDAO(connection);
	}

	@Override
	public TipoEscritorDAO getTipoEscritor() {
		return new TipoEscritorPostgreSqlDAO(connection);
	}

	@Override
	public TipoEstadoDAO getTipoEstado() {
		return new TipoEstadoPostgreSqlDAO(connection);
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacion() {
		return new TipoIdentificacionPostgreSqlDAO(connection);
	}

	@Override
	public TipoReporteDAO getTipoReporte() {
		return new TipoReportePostgreSqlDAO(connection);
	}

	@Override
	public TipoRevisionDAO getTipoRevision() {
		return new TipoRevisionPostgreSqlDAO(connection);
	}

	@Override
	public VersionDAO getVersion() {
		return new VersionPostgreSqlDAO(connection);
	}
	
}
