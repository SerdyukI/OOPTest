package net.accenture.prebootcamp.oop;

public class Parent {

	public String name = "John";
	String surname = "Mayer";
	String address = "Riga 123";
	int age=37;
	
	public void sleep( ) {
		System.out.println(name+" sleeps...");
	}
	public void eat( ) {
		System.out.println(name+" eats somesing...");
	}
	public void work( ) {
		System.out.println(name+" works 8 hours a day...");
	}
	public static void main(String...strings ) {
		Parent father=new Parent();
		System.out.println(father.name);
	}
}
