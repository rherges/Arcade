import java.util.ArrayList;


public class arcade {
	
	protected ArrayList<String> gameList = new ArrayList<String>();
	private String playerName = "No Name";
	
	public void addGame(String s){
		gameList.add(s);
	}
	
	public void setPlayerName(String name){
		playerName = name;
	}
	
	public String getPlayerName(){
		return playerName;
	}
}
