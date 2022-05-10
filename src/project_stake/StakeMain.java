package project_stake;

public class StakeMain {
	public static void main(String[] args) {
		Service sv = new Service();
		Repository re = new Repository();

		// 초기 플레이어, 머니, 덱 세팅
		sv.setStartCard();
		sv.setPlayer();

		sv.takeCard1();
		sv.takeCard2();
		sv.winCal();


	}
}
