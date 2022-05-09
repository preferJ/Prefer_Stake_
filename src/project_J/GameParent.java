package project_J;

public class GameParent extends Thread{
	int score;
	static public boolean inputCheck = false;
	
	public void timeSleep() {
		
	}
	
	@Override
	public void run() {
		for(int i=5; i>=1; i--){
			if(inputCheck==true){
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
	

}
