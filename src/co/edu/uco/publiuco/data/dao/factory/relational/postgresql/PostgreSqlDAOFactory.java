package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.*;
import co.edu.uco.publiuco.data.dao.relational.postgreSql.*;
import co.edu.uco.publiuco.utils.UtilSql;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;

public final class PostgreSqlDAOFactory extends DAOFactory{

	private static Connection connection;
	private static String JDBCURL = "jdbc:postgresql://mahmud.db.elephantsql.com:5432/nfjaiiyr";
	private static String USERNAME = "nfjaiiyr";
	private static String PASSWORD = "hFdpP8B7-CxwFNh4IuZ3NXdqnJbegOcf";

	public PostgreSqlDAOFactory() {
		openConnection();
	}

	@Override
	protected void openConnection() {
		connection = UtilSql.openConnection(JDBCURL, USERNAME, PASSWORD);
	}

	@Override
	public void closeConnection() {
		UtilSql.closeConnection(connection);
	}

	@Override
	public void initTransaction() {
		UtilSql.initTransaction(connection);
	}

	@Override
	public void commitTransaction() {
		UtilSql.commitTransaction(connection);
	}

	@Override
	public void rollbackTransaction() {
		UtilSql.rollbackTransaction(connection);
	}

	@Override
	public TipoEstadoDAO getTipoEstadoDAO() {
		return new TipoEstadoPostgreSqlDAO(connection);
	}

	@Override
	public EstadoDAO getEstadoDAO() {
		return new EstadoPostgreSqlDAO(connection);
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		return new PreferenciaCategoriaPostgreSqlDAO(connection);
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionPostgreSqlDAO(connection);
	}

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
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
	public ComentarioLectorDAO getComentarioLectorDAO() {
		return new ComentarioLectorPostgreSqlDAO(connection);
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
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		return new PreferenciaEscritorPostgreSqlDAO(connection);
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		return new PublicacionPostgreSqlDAO(connection);
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
	public TipoComentarioRevisorDAO getTipoComentarioRevisorDAO() {
		return new TipoComentarioRevisorPostgreSqlDAO(connection);
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		return new TipoEscritorPostgreSqlDAO(connection);
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

	public static void main(String[] args) {
		// UtilSql.openConnection(JDBCURL, USERNAME, PASSWORD);
		// UtilSql.closeConnection(connection);
		PostgreSqlDAOFactory intentoultimoomesuicido = new PostgreSqlDAOFactory();
		intentoultimoomesuicido.closeConnection();
	}
}
