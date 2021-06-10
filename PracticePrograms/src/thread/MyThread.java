package thread;

public class MyThread {
public static void main(String[] args) {
	Runnable r = () -> {
		for(int i =1; i<= 10;i++) {
			System.out.println(5+"*"+i+"="+(5*i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	};
	
	MyThread r1 = new MyThread();
//	r1.start();
}
}
