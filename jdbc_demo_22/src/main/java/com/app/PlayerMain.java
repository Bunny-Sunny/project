package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
	
		PlayerDAO playerDAO=new PlayerDAOImpl();
		try {

		     List<Player> palyerList=PlayerDAO.getAllPlayers();
		     for(Player player:palyerList) {
		    	 System.out.println(player);
		     }
		}
             catch(BusinessException e) {
            	 System.out.println(e.getMessage());
             }
	}

}
