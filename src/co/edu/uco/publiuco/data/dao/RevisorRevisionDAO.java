package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.RevisorRevisionEntity;

public interface RevisorRevisionDAO {

	void create(RevisorRevisionEntity entity);

	List<RevisorRevisionEntity> read(RevisorRevisionEntity entity);

	void update(RevisorRevisionEntity entity);

	void delete(UUID entity);

}