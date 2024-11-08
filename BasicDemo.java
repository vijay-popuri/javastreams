package basics;

interface Actor{
	void speak();
	void act();
	default void comedy() {
		System.out.println("hey i can do comedy....");
	}
	
}

class Hero implements Actor{
	public void speak() {
		System.out.println("Hero can speak");
	}
	public void act() {
		System.out.println("Hero can act");
	}
}

class Vilon implements Actor{
	public void speak() {
		System.out.println("vilon can speak");
	}
	public void act() {
		System.out.println("vilon can act");
	}
}
public class BasicDemo {

	public static void main(String[] args)
	{
		Vilon v=new Vilon();
		v.speak();
		v.act();
		v.comedy();
		
	}

}
