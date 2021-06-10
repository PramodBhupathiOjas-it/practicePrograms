package thread;

public class Demo {
public static void main(String[] args) {
	Thread t = new Thread();
	t.start();
	System.out.println(t.getState());
}
}
