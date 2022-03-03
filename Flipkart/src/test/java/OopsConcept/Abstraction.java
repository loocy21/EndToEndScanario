package OopsConcept;

abstract class Demo1
{
	abstract void start();
	abstract void end();
}
abstract class Demo2 extends Demo1
{
	void end()
	{
		System.out.println("executing end method");
	}
	
}
class Demo3 extends Demo2

{
	void start()
	{
		System.out.println("executing start method");
	}
}

public class Abstraction {

	public static void main(String[] args) 
	{
		Demo3 d = new Demo3();
		d.start();
		d.end();

	}

}
