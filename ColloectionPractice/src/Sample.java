import java.util.HashSet;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		HashSet<Integer> sh = new HashSet<>();
		for(int i = 1; i<= 100;i++) {
			sh.add(i);
		}
		Iterator<Integer> is = sh.iterator();
		while(is.hasNext()) {
			int num = is.next();
			if(num % 2 != 0) {
				sh.remove(is.next());
			}
		}
		sh.forEach(x -> System.out.println(x));
	}

}
