package thread;

public class Thread_run extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("スレッド"+getName()+"から出力 : "+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int getFactorian(int n) { 
		int f = 1;
			for(int i = 1; i <= n; i++) 
				f = f * i;
		return f;
	}
}
