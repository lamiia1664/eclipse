package exception;

class ThrdDemo1 implements Runnable{
	public void run() {
		for (int i=1;i<5;i++) {
			System.out.println("New Thread");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ThreadPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrdDemo1 t1 = new ThrdDemo1();
		Thread t = new Thread(t1);
		t.start();
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Main Thread");
				Thread.sleep(1000);
			}
		}	
		catch(Exception e) {
				System.out.println(e);
		}

	}

}
