package String;

class Car
{  
	void mercedesBenz ()
	{
		System.out.println("mercedesBenz has multiple features...");
	}
}  
class  acceleration  extends Car
{  
	void accelerate ()
	{
		System.out.println("it has super acceleration service.");}  
}  
class brakingMechanisms extends Car
{  
	void brake()
	{
		System.out.println("braking Mechanisms is also very good ...");}  
}  
class HiraricalInheritance
{  
	public static void main(String args[])
	{  
		brakingMechanisms c=new brakingMechanisms();  
		c.mercedesBenz();
		c.brake();


	}
}
