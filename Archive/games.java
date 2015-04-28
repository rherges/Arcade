
public abstract class games {
	protected int highScore;
	protected int numPlayers;
	protected String name;
	
	public games(){
		highScore = 0;
		numPlayers = 1;
		name = "";
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
