package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run th0[] = new Thread_run[10];
		Thread_run th1[] = new Thread_run[10];
		Thread_runnable th2[] = new Thread_runnable[10];
		for( int i = 0; i < 1; i++) {
			th0[i] = new Thread_run();
			th0[i].start();
			th1[i] = new Thread_run();
			th1[i].start();
			th2[i] = new Thread_runnable();
			th2[i].run();
		
			try {
				th0[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í : "+i);
		}

	}

}
