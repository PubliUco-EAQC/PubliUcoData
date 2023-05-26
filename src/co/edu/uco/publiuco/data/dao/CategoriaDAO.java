package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.CategoriaEntity;

public interface CategoriaDAO {

	List<CategoriaEntity> read(CategoriaEntity entity);

}