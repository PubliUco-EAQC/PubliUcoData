package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.data.dao.SuscripcionPublicacionDAO;
import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public class SuscripcionPublicacionPostgreSqlDAO implements SuscripcionPublicacionDAO {

	public SuscripcionPublicacionPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public void create(SuscripcionPublicacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SuscripcionPublicacionEntity> read(SuscripcionPublicacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SuscripcionPublicacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID entity) {
		// TODO Auto-generated method stub
		
	}

}