package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id desc";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			
			
			
			ResultSet resultSet=preparedstatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setCity(resultSet.getString("city"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setSportName(resultSet.getString("SportsName"));
				playerList.add(player);
				
			}
		}catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);//this will be repeated by logger
            throw new BusinessException("Internal error occured,please contact for support");
                                                                              
	}
	
		return playerList;
}
}