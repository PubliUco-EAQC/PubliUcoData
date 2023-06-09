package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.PalabraClavePublicacionEntity;

public interface PalabraClavePublicacionDAO {
	
	void create(PalabraClavePublicacionEntity entity);

	List<PalabraClavePublicacionEntity> read(PalabraClavePublicacionEntity entity);

	void update(PalabraClavePublicacionEntity entity);

	void delete(UUID entity);

}