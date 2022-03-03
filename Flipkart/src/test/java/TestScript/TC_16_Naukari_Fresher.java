package TestScript;

import org.testng.annotations.Test;

import GenricUtilities.BaseClass;
import GenricUtilities.JavaUtility;
import GenricUtilities.SampleDataProvider;
import Pom_Page_Naukari.Fresher_Page;
/**
 * Description:Method is used for create account as a fresher
 * @author Shobha
 *
 */

public class TC_16_Naukari_Fresher extends BaseClass
{

	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Naukri(String fullName,String email,String	password,String	mobNumber,String city,String course,String	
			specialization,String university,String	passingYear,String	keySkills,String keySkills2) throws Throwable
	{  
		
		JavaUtility  ju = new JavaUtility();
		Fresher_Page fp = new Fresher_Page(driver);
		/*create account as a fresher*/
		fp.switchingWindow();
		/* genrate random number into mail*/
		String EmailId = email+ju.getRandomNum()+"@gmail.com";
		/* fetch data by excel sheet*/
		fp.fetchData(fullName, EmailId, password, mobNumber,city,course,specialization,university,passingYear,keySkills,keySkills2);
		
}
	
}
