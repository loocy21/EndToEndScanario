package Practice;

class Facebook
{
	//this is global variable
	int noOfFriends = 0;
	int noOfPost = 0;
}


public class Test3 {

	public static void main(String[] args)
	{
		Facebook fb = new Facebook();
		//call those global variable
		//initialize those variable
		System.out.println("noOfFriends="+fb.noOfFriends);
		System.out.println("noOfPost="+fb.noOfPost);
		
		//create new value;
		fb.noOfFriends = 150;
		fb.noOfPost = 2;
		
		System.out.println("noOfFriends="+fb.noOfFriends);
		System.out.println("noOfPost="+fb.noOfPost);
		
		//create new object with new refrence variable
		Facebook fb1 = new Facebook();
		fb1.noOfFriends = 700;
		fb1.noOfPost = 50;
		
		System.out.println("noOfFriends="+fb1.noOfFriends);
		System.out.println("noOfPost="+fb1.noOfPost);
		
		System.out.println("noOfFriends="+fb1.noOfFriends);
		System.out.println("noOfPost="+fb1.noOfPost);
		
		

	}

}
