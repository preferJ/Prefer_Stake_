package project_stake;

import java.util.ArrayList;
import java.util.List;

public class Repository {

	static public List<Integer> cardDeck = new ArrayList<>();
	static public List<TableDTO> gameHistory = new ArrayList<>();
	static public List<PlayerDTO> playerList = new ArrayList<>();

	public void setPlayer(double startMoney) {
		// TODO Auto-generated method stub
		PlayerDTO newPlayer = new PlayerDTO(null, false, 0, 0, 0, startMoney, false, false);
		playerList.add(newPlayer);
	}

	public void setPlayerCom(double startMoney) {
		// TODO Auto-generated method stub
		PlayerDTO newPlayer = new PlayerDTO(null, true, 0, 0, 0, startMoney, false, false);
		playerList.add(newPlayer);

	}

}
