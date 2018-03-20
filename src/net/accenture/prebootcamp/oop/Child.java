package net.accenture.prebootcamp.oop;

public class Child extends Parent {
	String name = "Lucy";
	
	public void sleep( ) {
		System.out.println(name+" sleeps early...");
	}

	public static void main(String... strings) {
		Child daughter = new Child();
		System.out.println(daughter.name);
		System.out.println(daughter.surname);
		System.out.println(daughter.address);
		Parent father = new Parent();
		//System.out.println("Lucy' father is " + father.name);
		father.sleep();
		daughter.sleep();
		
	}
}
