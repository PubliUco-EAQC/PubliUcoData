package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoEntity;

public interface EstadoDAO {
	
	List<EstadoEntity> read(EstadoEntity entity);
	
}
