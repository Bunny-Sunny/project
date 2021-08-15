package com.app.dao;

import java.util.List;
import com.app.model.Player;

public interface PlayerDAO {

	// DAO : Data Access Object _It is a design pattern used to specify the storage logic
	public List<Player> getAllPlayers();
	
}
