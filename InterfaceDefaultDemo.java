package basics;
interface A{
default void equals() {
	System.out.println("A");
}
}

interface B{
default void equals() {
	System.out.println("B");
}
}
class D implements A,B{
	//here you need to override one method...
}
public class InterfaceDefaultDemo {

	public static void main(String[] args)
	{
			D d=new D();
			d.equals();
		
	}

}
