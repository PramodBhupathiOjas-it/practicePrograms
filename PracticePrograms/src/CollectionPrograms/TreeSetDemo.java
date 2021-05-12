package CollectionPrograms;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		// TODO Auto-generated method stub
		String m1 = o1.toString();
		String m2 = o2.toString();
		return m1.compareTo(m2);
	}


//	@Override
//	public int compare(String s1, String s2) {
//		// TODO Auto-generated method stub
//		return -s1.compareTo(s2);
//	}
	
	
}

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new  MyComparator1());
		t.add(new StringBuffer("Orange"));
		t.add(new StringBuffer("Apple"));
		t.add(new StringBuffer("Banana"));
		t.add(new StringBuffer("Mango"));
		t.forEach(x -> System.out.println(x));
	}

}
