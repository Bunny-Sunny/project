package com.app.dao.impl;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.model.Player;
import com.app.dao.PlayerDAO;

public class PlayerDAOImpl  implements PlayerDAO{
	
	public List<Player> getAllPlayers() {
		try(Connection connection=MySqlConnection.getConnection()){
			
		}catch(ClassNotFoundException | SQLException e) { 
	}
		return null;

}
}