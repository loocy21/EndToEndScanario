package Practice;


class Instagram 
{
	String username=" ";
	int noOffollowers = 0;
	int noOfPost = 0;
}

public class Test2 {

	public static void main(String[] args) 
	{
		System.out.println("start of java code");
		Instagram is= new Instagram();
		System.out.println("username="+is.username);
		System.out.println("noOffollowers="+is.noOffollowers);
		System.out.println("noOfPost="+is.noOfPost);
		
		is. username="shobha ";
		is. noOffollowers = 12;
		is. noOfPost = 4;
		
		System.out.println("username="+is.username);
		System.out.println("noOffollowers="+is.noOffollowers);
		System.out.println("noOfPost="+is.noOfPost);
		
		
		

	}

}
