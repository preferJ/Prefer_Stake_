package project_stake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {
	Scanner sc = new Scanner(System.in);
	static int players = 0;
	static double startMoney = 0;
	Repository re = new Repository();
	
	
	
	
	public void batDecision() {
		
	}

	public void winCal() {

		for (int i = 0; i < players; i++) {
			List<Integer> cardDeck = new ArrayList<>();
			cardDeck = makeCardDeck();
			double total = 0;
			double win = 0;
			for (int c = 0; c < players; c++) {
				cardDeck.remove(Integer.valueOf(re.playerList.get(c).card2));
			}
			cardDeck.remove(Integer.valueOf(re.playerList.get(i).card1));
			for (int j = 0; j < players; j++) {
				if (i == j) {

				} else {
					for (int k = 0; k < cardDeck.size(); k++) {

						int myCard1 = re.playerList.get(i).card1;
						int myCard2 = re.playerList.get(i).card2;
						int otherCard2 = re.playerList.get(j).card2;
						int unknowCard = cardDeck.get(k);

						if (handsVal(handsCal(myCard1, myCard2)) > handsVal(handsCal(otherCard2, unknowCard))) {
							System.out.println("이겻닭");
							win++;
							total++;
						} else {
							System.out.println("지거나 비겻닭");
							total++;
						}

					}
				}
			}
			re.playerList.get(i).setWinrate(win / total);
			win = 0;
			total = 0;
		}
	}

	public void batCal1() {
		if (!re.playerList.get(1).callCheck) {
			int a = re.playerList.get(1).getCard1();
			int b = re.playerList.get(1).getCard2();
			handsVal(handsCal(a, b));
		}

	}

	public List<Integer> makeCardDeck() {
		List<Integer> newCard = new ArrayList<>() {
			{
				add(10);
				add(10);
				add(9);
				add(59);
				add(8);
				add(98);
				add(7);
				add(57);
				add(6);
				add(6);
				add(5);
				add(5);
				add(4);
				add(54);
				add(3);
				add(93);
				add(2);
				add(2);
				add(1);
				add(91);
			}
		};
		return newCard;

	}

	public void setStartCard() {
		re.cardDeck = makeCardDeck();
		Collections.shuffle(re.cardDeck);

	}

	public String handsCal(int a, int b) {
		String handsName = "";
		if ((a == 98 && b == 93) || (a == 93 && b == 98)) {
			handsName = "38광땡";
		} else if ((a == 98 && b == 91) || (a == 91 && b == 98)) {
			handsName = "18광땡";
		} else if ((a == 91 && b == 93) || (a == 93 && b == 91)) {
			handsName = "13광땡";
		} else if ((a == 93 && b == 57) || (a == 57 && b == 93)) {
			handsName = "땡잡이";
		} else if ((a == 54 && b == 57) || (a == 57 && b == 54)) {
			handsName = "암행어사";
		} else if ((a == 54 && b == 59) || (a == 59 && b == 54)) {
			handsName = "멍사구";
		} else {
			if (a != 10) {
				a = (a % 10);
			}
			if (b != 10) {
				b = (b % 10);
			}
			if ((a == 1 && b == 2) || (a == 2 && b == 1)) {
				handsName = "알리";
			} else if ((a == 1 && b == 4) || (a == 4 && b == 1)) {
				handsName = "독사";
			} else if ((a == 1 && b == 9) || (a == 9 && b == 1)) {
				handsName = "구삥";
			} else if ((a == 1 && b == 10) || (a == 10 && b == 1)) {
				handsName = "장삥";
			} else if ((a == 10 && b == 4) || (a == 4 && b == 10)) {
				handsName = "장사";
			} else if ((a == 6 && b == 4) || (a == 4 && b == 6)) {
				handsName = "새륙";
			} else if (a == b) {
				handsName = a + "땡";
			} else if (a != b && ((a + b) == 10)) {
				handsName = "망통";
			} else if (a != b) {
				handsName = ((a + b) % 10) + "끗";
			}

		}
		return handsName;

	}

	public static int handsVal(String handsName) {
		int val = 0;
		switch (handsName) {
		case "38광땡":
			val = 32;
			break;
		case "18광떙":
			val = 31;
			break;
		case "13광땡":
			val = 30;
			break;
		case "10땡":
			val = 29;
			break;
		case "9땡":
			val = 28;
			break;
		case "8땡":
			val = 27;
			break;
		case "7땡":
			val = 26;
			break;
		case "6땡":
			val = 25;
			break;
		case "5땡":
			val = 24;
			break;
		case "4땡":
			val = 23;
			break;
		case "3땡":
			val = 22;
			break;
		case "2땡":
			val = 21;
			break;
		case "1땡":
			val = 20;
			break;
		case "알리":
			val = 19;
			break;
		case "독사":
			val = 18;
			break;
		case "구삥":
			val = 17;
			break;
		case "장삥":
			val = 16;
			break;
		case "장사":
			val = 15;
			break;
		case "새륙":
			val = 14;
			break;
		case "9끗":
			val = 13;
			break;
		case "8끗":
			val = 12;
			break;
		case "7끗":
			val = 11;
			break;
		case "6끗":
			val = 10;
			break;
		case "5끗":
			val = 9;
			break;
		case "4끗":
			val = 8;
			break;
		case "3끗":
			val = 7;
			break;
		case "2끗":
			val = 6;
			break;
		case "1끗":
			val = 5;
			break;
		case "망통":
			val = 4;
			break;
		case "멍사구":
			val = 3;
			break;
		case "땡잡이":
			val = 2;
			break;
		case "암행어사":
			val = 1;
			break;
		case "사구":
			val = 0;
			break;

		}

		return val;

	}

	public void setPlayer() {
		// TODO Auto-generated method stub
		System.out.println("게임에 참가할 플레이어 수 입력");
		players = sc.nextInt();
		System.out.println("게임 시작머니 입력");
		startMoney = sc.nextInt();
		re.setPlayer(startMoney);
		for (int i = 0; i < players - 1; i++) {
			re.setPlayerCom(startMoney);
		}
	}

// 카드받기 -------------------------------------------------------------------
	public void takeCard1() {
		// TODO Auto-generated method stub
		for (int i = 0; i < players; i++) {
			int card1 = re.cardDeck.get(0);
			re.cardDeck.remove(0);
			re.playerList.get(i).setCard1(card1);
		}

	}

	public void takeCard2() {
		// TODO Auto-generated method stub
		for (int i = 0; i < players; i++) {
			int card1 = re.cardDeck.get(0);
			re.cardDeck.remove(0);
			re.playerList.get(i).setCard2(card1);
		}

	}

	public void takeCard3() {
		// TODO Auto-generated method stub
		for (int i = 0; i < players; i++) {
			int card1 = re.cardDeck.get(0);
			re.cardDeck.remove(0);
			re.playerList.get(i).setCard3(card1);
		}

	}
// 카드받기 -------------------------------------------------------------------

}
