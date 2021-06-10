package CollectionPrograms;

//class Animal {
//	void eat() {
//		System.out.println("eating...");
//	}
//}
//
//class Dog extends Animal {
//	void bark() {
//		System.out.println("barking...");
//	}
//}
//
//class BabyDog extends Animal {
//	void weep() {
//		super.eat();
//		System.out.println("weeping...");
//		
//		super.eat();
//	}
//}

public class TestInheritance extends overload {
	public static void main(String[] args) {
		main();
		main("hii");
		
	}
	
	
	}

 class overload {
	public static void main(String[] args){System.out.println("main with String[]");}  
	public static void main(String args){System.out.println("main with String");}  
	 static void main(){System.out.println("main without args");}  
		
	
}
