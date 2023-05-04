package co.edu.uco.publiuco.data.dao.relational.postgreSql;

import java.util.List;

import co.edu.uco.publiuco.entities.RespuestaEntity;

public interface RespuestaDAO {
	
	void create(RespuestaEntity entity);

	List<RespuestaEntity> read(RespuestaEntity entity);

}
