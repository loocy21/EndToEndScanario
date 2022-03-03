package TestScript;

import org.testng.annotations.Test;
import GenricUtilities.BaseClass;
import GenricUtilities.JavaUtility;
import GenricUtilities.SampleDataProvider;
import Pom_Page_Naukari.Employement_Page;
import Pom_Page_Naukari.RegisterPage;

public class TC_15_Naukri extends BaseClass
{
	@Test(description="", dataProvider="TestDataProvider", dataProviderClass=SampleDataProvider.class)
	public void Naukri(String fullName,String email,String password,String mobileNumber,String value1,String value2,
			String company,String jobTitle,String location,String mmyear,String salary,String availability,
			String industry,String department,String roleCategory,String role,String keySkill1,String course,String specialization,String university,String courseType,String passYear,String prefferdJobType,
			String prefferdEmployType,String prefferdWorkLocation1,String prefferdWorkLocation2,String gender) throws Throwable
	{
		
	JavaUtility  ju = new JavaUtility();
	RegisterPage rp = new RegisterPage(driver);
	Employement_Page re = new Employement_Page(driver);
	rp.switchingWindow();
	
	/*text field email with data provider */
	String EmailId = email+ju.getRandomNum()+"@gmail.com";
	/*take data by excel sheet*/
	rp.fetchData(fullName, EmailId,  password, mobileNumber);
	rp.clkExp();
	

	/*Set Your Employment */
	re.setYourEmployment( value1,value2,company,jobTitle,location,mmyear,salary,availability,industry,department,roleCategory,role,keySkill1);
	

	
	/*Set Your preferred location and details */
	re.setYourEducationAndSetHeadLineAndPrefference(course, specialization, university, courseType, passYear, prefferdJobType, prefferdEmployType, prefferdWorkLocation1,prefferdWorkLocation2, gender);
	}
	}
