package project_stake;

public class TableDTO {
	@Override
	public String toString() {
		return "TableDTO [CountGame=" + CountGame + ", winner=" + winner + ", TableMoney=" + TableMoney + ", bat1="
				+ bat1 + ", bat2=" + bat2 + ", bat3=" + bat3 + ", bat4=" + bat4 + ", bat5=" + bat5 + "]";
	}
	/**
	 * @param countGame
	 * @param winner
	 * @param tableMoney
	 * @param bat1
	 * @param bat2
	 * @param bat3
	 * @param bat4
	 * @param bat5
	 */
	public TableDTO(int countGame, String winner, double tableMoney, double bat1, double bat2, double bat3, double bat4,
			double bat5) {
		super();
		CountGame = countGame;
		this.winner = winner;
		TableMoney = tableMoney;
		this.bat1 = bat1;
		this.bat2 = bat2;
		this.bat3 = bat3;
		this.bat4 = bat4;
		this.bat5 = bat5;
	}
	/**
	 * @return the countGame
	 */
	public int getCountGame() {
		return CountGame;
	}
	/**
	 * @param countGame the countGame to set
	 */
	public void setCountGame(int countGame) {
		CountGame = countGame;
	}
	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}
	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	/**
	 * @return the tableMoney
	 */
	public double getTableMoney() {
		return TableMoney;
	}
	/**
	 * @param tableMoney the tableMoney to set
	 */
	public void setTableMoney(double tableMoney) {
		TableMoney = tableMoney;
	}
	/**
	 * @return the bat1
	 */
	public double getBat1() {
		return bat1;
	}
	/**
	 * @param bat1 the bat1 to set
	 */
	public void setBat1(double bat1) {
		this.bat1 = bat1;
	}
	/**
	 * @return the bat2
	 */
	public double getBat2() {
		return bat2;
	}
	/**
	 * @param bat2 the bat2 to set
	 */
	public void setBat2(double bat2) {
		this.bat2 = bat2;
	}
	/**
	 * @return the bat3
	 */
	public double getBat3() {
		return bat3;
	}
	/**
	 * @param bat3 the bat3 to set
	 */
	public void setBat3(double bat3) {
		this.bat3 = bat3;
	}
	/**
	 * @return the bat4
	 */
	public double getBat4() {
		return bat4;
	}
	/**
	 * @param bat4 the bat4 to set
	 */
	public void setBat4(double bat4) {
		this.bat4 = bat4;
	}
	/**
	 * @return the bat5
	 */
	public double getBat5() {
		return bat5;
	}
	/**
	 * @param bat5 the bat5 to set
	 */
	public void setBat5(double bat5) {
		this.bat5 = bat5;
	}
	int CountGame;
	String winner;
	double TableMoney;
	double bat1;
	double bat2;
	double bat3;
	double bat4;
	double bat5;
	
	
	

}
