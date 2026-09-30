package exception;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread();
		System.out.println("Current Thread = "+t);
		
		String threadname = Thread.currentThread().getName();
		System.out.println("Thread name = "+threadname);
		
		//change the name of thread
		
		t.setName("New Thread");
		System.out.println("Thread = "+t);
		String newname = Thread.currentThread().getName();
		System.out.println(newname);
		
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
