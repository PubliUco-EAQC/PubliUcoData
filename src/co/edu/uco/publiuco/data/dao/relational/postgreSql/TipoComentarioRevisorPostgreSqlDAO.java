package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.TipoComentarioRevisorDAO;
import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public class TipoComentarioRevisorPostgreSqlDAO implements TipoComentarioRevisorDAO {
	
	public TipoComentarioRevisorPostgreSqlDAO(final Connection connection) {
		
	}

	@Override
	public void create(TipoComentarioRevisorEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TipoComentarioRevisorEntity> read(TipoComentarioRevisorEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}