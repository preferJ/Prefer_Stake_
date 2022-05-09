package Tset;

public class GameTimer extends Thread {
	@Override
	public void run() {
		for (int i = T07_ThreadGame.timerSecond; i >= 1; i--) {
			if (T07_ThreadGame.inputCheck == true) {
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("시간이 초과되어 당신이 졌습니다.");
		System.exit(0);

	}
	
	
}
