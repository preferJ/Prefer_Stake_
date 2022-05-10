package project_stake;

public class PlayerDTO {
	@Override
	public String toString() {
		return "PlayerDTO [name=" + name + ", com=" + com + ", card1=" + card1 + ", card2=" + card2 + ", card3=" + card3
				+ ", money=" + money + ", callCheck=" + callCheck + ", HalfCheck=" + HalfCheck + "]";
	}
	/**
	 * @param name
	 * @param com
	 * @param card1
	 * @param card2
	 * @param card3
	 * @param money
	 * @param callCheck
	 * @param halfCheck
	 */
	public PlayerDTO(String name, boolean com, int card1, int card2, int card3, double money,
			boolean callCheck, boolean halfCheck) {
		super();
		this.name = name;
		this.com = com;
		this.card1 = card1;
		this.card2 = card2;
		this.card3 = card3;
		this.money = money;
		this.callCheck = callCheck;
		HalfCheck = halfCheck;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the com
	 */
	public boolean isCom() {
		return com;
	}
	/**
	 * @param com the com to set
	 */
	public void setCom(boolean com) {
		this.com = com;
	}
	/**
	 * @return the card1
	 */
	public int getCard1() {
		return card1;
	}
	/**
	 * @param card12 the card1 to set
	 */
	public void setCard1(int card12) {
		this.card1 = card12;
	}
	/**
	 * @return the card2
	 */
	public int getCard2() {
		return card2;
	}
	/**
	 * @param card2 the card2 to set
	 */
	public void setCard2(int card2) {
		this.card2 = card2;
	}
	/**
	 * @return the card3
	 */
	public int getCard3() {
		return card3;
	}
	/**
	 * @param card3 the card3 to set
	 */
	public void setCard3(int card3) {
		this.card3 = card3;
	}
	/**
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	/**
	 * @return the callCheck
	 */
	public boolean isCallCheck() {
		return callCheck;
	}
	/**
	 * @param callCheck the callCheck to set
	 */
	public void setCallCheck(boolean callCheck) {
		this.callCheck = callCheck;
	}
	/**
	 * @return the halfCheck
	 */
	public boolean isHalfCheck() {
		return HalfCheck;
	}
	/**
	 * @param halfCheck the halfCheck to set
	 */
	public void setHalfCheck(boolean halfCheck) {
		HalfCheck = halfCheck;
	}
	String name;
	boolean com;
	int card1;
	int card2;
	int card3;
	double money;
	boolean callCheck;
	boolean HalfCheck;
	/**
	 * @return the winrate
	 */
	public double getWinrate() {
		return winrate;
	}
	/**
	 * @param winrate the winrate to set
	 */
	public void setWinrate(double winrate) {
		this.winrate = winrate;
	}
	double winrate;
	
	
	

}
