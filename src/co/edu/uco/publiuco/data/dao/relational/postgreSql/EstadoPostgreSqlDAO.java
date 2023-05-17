package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoDataException;
import co.edu.uco.publiuco.data.dao.EstadoDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.sqlserver.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoEntity;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilSql;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public final class EstadoPostgreSqlDAO extends SqlDAO<EstadoEntity> implements EstadoDAO{
	
	public EstadoPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override

	public final void create(final EstadoEntity entity) {
		var sqlStatement = "INSERT INTO Estado(identificador, nombre) VALUES (?, ?)";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setString(2, entity.getNombre());
			
			preparedStatement.executeUpdate();
		
		} catch(final SQLException exception) {
			var userMessage="Se ha presentado un problema tratando de registrar la informacion del nuevo Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo create de la clase Estado. Por favor verifique la traza completa del error..";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage="Se ha presentado un problema inesperado de registrar la informacion del nuevo Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo create de la clase Estado. Por favor verifique la traza completa del error..";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	public final List<EstadoEntity> read(final EstadoEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement.toString())){
			
		}catch(SQLException exception){
			
		}catch(Exception exception){
			
		}
		
		return null;
	}

	@Override
	public final void update(final EstadoEntity entity) {
		var sqlStatement = "UPDATE Estado SET nombre=?, WHERE identificador=?";

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
			preparedStatement.setString(1, entity.getNombre());
			preparedStatement.executeUpdate();

		} catch(final SQLException exception) {
			var userMessage="Se ha presentado un problema tratando de modificar la informacion del Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo update de la clase Estado. Por favor verifique la traza completa del error..";

			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage="Se ha presentado un problema inesperado de modificar la informacion del nuevo Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo update de la clase Estado. Por favor verifique la traza completa del error..";

			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	public final void delete(UUID entity) {
		var sqlStatement = "DELETE FROM \"TipoEstado\" WHERE identificador = ?";

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
			preparedStatement.setObject(1, entity);
			preparedStatement.executeUpdate();

		} catch(final SQLException exception) {
			var userMessage="Se ha presentado un problema tratando de eliminar el Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo delete de la clase Estado. Por favor verifique la traza completa del error..";

			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage="Se ha presentado un problema inesperado de delete la informacion del nuevo Estado";
			var technicalMessage="Se ha presentado un problema de tipo SQLException dentro del metodo delete de la clase Estado. Por favor verifique la traza completa del error..";

			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
		}		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre ";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Estado ";
	}

	@Override
	protected final String prepareWhere(final EstadoEntity entity, List<Object> parameters) {
		final var where = new StringBuilder("");
		
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		
		var setWhere = true;
		
		if(UtilObject.isNull(entity)) {
			
			if(!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if(UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND ").append("nombre=?");
				setWhere = false;
			}
			
		}
		
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

}
