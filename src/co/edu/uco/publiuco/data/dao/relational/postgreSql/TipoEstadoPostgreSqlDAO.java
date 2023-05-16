package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoEstadoDAO;
import co.edu.uco.publiuco.entities.TipoEstadoEntity;

public class TipoEstadoPostgreSqlDAO implements TipoEstadoDAO {

	public TipoEstadoPostgreSqlDAO(final Connection connection) {
		
	}
	
	@Override
	public void create(TipoEstadoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TipoEstadoEntity> read(TipoEstadoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}


}