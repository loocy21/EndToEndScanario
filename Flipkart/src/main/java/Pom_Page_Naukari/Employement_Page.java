package Pom_Page_Naukari;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import GenricUtilities.WebDriverUtility;




public class Employement_Page {


	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public Employement_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	/*Button Yes */
	@FindBy(xpath="//label[text()='Yes']")
	private WebElement btnYes;

	/*Drop Down Button Experience Year */
	@FindBy(id="year")
	private WebElement ddBtnExperienceYear;

	/*Drop Down Button Experience Month */
	@FindBy(id="month")
	private WebElement ddBtnExperienceMonth;

	/*Drop Down Experience Month */
	@FindBy(xpath="//li[text()='2 Years']")
	private WebElement ddYearsOptions;
	
	/*Drop Down Experience Month */
	@FindBy(xpath="//li[text()='2 Months']")
	private WebElement ddMonthOptions;

	/*Text Comapany Name */
	@FindBy(xpath="//input[@placeholder='Eg. Amazon']")
	private WebElement txtCompanyName;

	/*Text Job Title */
	@FindBy(xpath="//input[@placeholder='Eg. Software Developer']")
	private WebElement txtJobTitle;

	/*Text CurrentCity Name */
	@FindBy(id="currentCity")
	private WebElement txtCurrentCity;

	/*Text Suggestion City Name */
	@FindBy(xpath="//span[contains(text(),'Bangalore')]")
	private WebElement txtsuggestionCity;

	/*Text Working From */
	@FindBy(id="workingFrom")
	private WebElement txtWorkingFrom;

	/*Drop Down Button Currency */
	@FindBy(id="currency")
	private WebElement ddBtnCurrency;

	/*Text Annual Salary */
	@FindBy(xpath="//input[@placeholder='Eg. 5,64,000']")
	private WebElement txtAnnualSalary;
	
	/*Text Industry */
	@FindBy(xpath="//a[contains(text(),'15 Days or less')]")
	private WebElement avilabilty;


	/*Text Industry */
	@FindBy(id="industry")
	private WebElement txtIndustry;

	/*Test Department */
	@FindBy(id="department")
	private WebElement txtDepartment;

	/*Test Role Category */
	@FindBy(id="roleCategory")
	private WebElement txtRoleCategory;

	/*Test Role */
	@FindBy(id="role")
	private WebElement txtRole;

	/*Test Key Skills */
	@FindBy(xpath="//input[@placeholder='Key skills are crucial for recruiters to hire you']")
	private WebElement txtKeySkills;

	/*Button Save And Continue */
	@FindBy(xpath="//button[text()='Save and Continue']")
	private WebElement btnSaveAndContinue;

	/*Text Highest Qualification */
	@FindBy(xpath="//span[contains(text(),'Graduation/Diploma')]")
	private WebElement txtQualification;

	/*Text Course */
	@FindBy(id="course-suggestor")
	private WebElement txtCourse;

	/*Text Specialization */
	@FindBy(id="course-suggestor")
	private WebElement txtSpecialization;

	/*Text University */
	@FindBy(id="institute-suggestor")
	private WebElement txtUniversity;

	/*Text Passing Year */
	@FindBy(xpath="//input[@placeholder='Eg. 2022']")
	private WebElement txtPassingYear;

	/*Button Passing Year */
	@FindBy(xpath="//label[text()='Passing Year']")
	private WebElement btnPassingYear;

	
	/*Radio Button */
	@FindBy(className="iconWrap")
	private WebElement rdoBtn;

	/*Button Submit*/
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement btnSubmit;
	
	/*Button Skip And Continue*/
	@FindBy(xpath="//button[text()='SKIP AND CONTINUE']")
	private WebElement btnSkipAndContinue;
	
	/*Text User Name */
	@FindBy(xpath="//div[@class='popout profile-section card']/descendant::div[@class='user-name roboto-bold-text']")
	private WebElement txtUserName;
	
	/*Text Employ Profile */
	@FindBy(xpath="//div[@class='popout profile-section card']/descendant::div[@class='emp-info roboto-thin-text']")
	private WebElement txtEmpProfile;
	

	/*Drop Down Experience Month */
	@FindBy(xpath="//li[text()='2 Years']")
	private WebElement ddYearsOptions1;


	private WebElement optionsYears(String value1) {
		String xpathValue1 ="//li[text()='"+value1+" Years']";
		return driver.findElement(By.xpath(xpathValue1));
	}

	private WebElement optionsMonths(String value2) {
		String xpathValue2 ="//li[text()='"+value2+" Months']";
		return driver.findElement(By.xpath(xpathValue2));
	}


	private WebElement optionsLocation(String location) {
		String xpathlocation ="//span[contains(text(),'"+location+"')]";
		return driver.findElement(By.xpath(xpathlocation));
	}
	// ₹
	private WebElement optionsCurrency(String currency) {
		String xpathcurrency ="//input[@placeholder='"+currency+"']";
		return driver.findElement(By.xpath(xpathcurrency));
	}
	private WebElement optionsAnnualSalary(String salary) {
		String xpathSalary ="//input[@placeholder='Eg. "+salary+"']";
		return driver.findElement(By.xpath(xpathSalary));
	}

	private WebElement optionsAvailabilityToJoin(String availability) {
		String xpathavailability ="//a[contains(text(),'"+availability+"')]";
		return driver.findElement(By.xpath(xpathavailability));
	}

	private WebElement optionsIndustry(String industry) {
		String xpathindustry="//span[contains(text(),'"+industry+"')]";
		return driver.findElement(By.xpath(xpathindustry));
	}

	private WebElement optionsSkills(String skill) {
		String xpathindustry="//div[@title='"+skill+"']";
		return driver.findElement(By.xpath(xpathindustry));
	}

	private WebElement optionsVisibleText(String text) {
		String xpathText="//span[contains(text(),'"+text+"')]";
		return driver.findElement(By.xpath(xpathText));
	}

	
	
	 /**
	  * Description:Method is used for fill the Employement page
	  * @author Shobha
	  * @param value1
	  * @param value2
	  * @param company
	  * @param jobTitle
	  * @param location
	  * @param mmyear
	  * @param salary
	  * @param availability
	  * @param industry
	  * @param department
	  * @param roleCategory
	  * @param role
	  * @param keySkill1
	  */
	public void setYourEmployment(String value1,String value2,String company,String jobTitle,String location,String mmyear,String salary,String availability,String industry,String department,String roleCategory,String role,String keySkill1) {

		try {

		
		
		btnYes.click();
		ddBtnExperienceYear.click();
		optionsYears(value1).click();


			ddBtnExperienceMonth.click();
			optionsMonths(value2).click();
		

			txtCompanyName.sendKeys(company);
			txtJobTitle.sendKeys(jobTitle);

			optionsLocation(location).click();
			web.scrollToWebElement(driver, txtAnnualSalary);

			txtWorkingFrom.sendKeys(mmyear);

			txtAnnualSalary.sendKeys(salary);
			optionsAvailabilityToJoin(availability).click();

			txtIndustry.sendKeys(industry);
			optionsIndustry(industry).click();

			txtDepartment.sendKeys(department);
			optionsIndustry(department).click();

			web.scrollToWebElement(driver, btnSaveAndContinue);

			txtRoleCategory.sendKeys(roleCategory);
			optionsIndustry(roleCategory).click();

			txtRole.sendKeys(role);
			optionsIndustry(role).click();

			web.scrollToWebElement(driver, btnSaveAndContinue);

			txtKeySkills.sendKeys(keySkill1);
			optionsSkills(keySkill1).click();

			btnSaveAndContinue.click();

			System.out.println("Clicked Save And Continue");

		} catch (Exception e) {
			Assert.fail("Not Clicked Save And Continue");
		}
	}
	/**
	 * Description:Method is used for fill the course page
	 * @author Shobha
	 * @param course
	 * @param specialization
	 * @param university
	 * @param courseType
	 * @param passYear
	 * @param prefferdJobType
	 * @param prefferdEmployType
	 * @param prefferdWorkLocation1
	 * @param prefferdWorkLocation2
	 * @param gender
	 */

	public void setYourEducationAndSetHeadLineAndPrefference(String course,String specialization,String university,String courseType,String passYear,String prefferdJobType,String prefferdEmployType,String prefferdWorkLocation1,String prefferdWorkLocation2,String gender) {

		try {
			txtQualification.click();

			txtCourse.sendKeys(course);
			optionsVisibleText(course).click();

			txtSpecialization.sendKeys(specialization);
			optionsVisibleText(specialization).click();

			txtUniversity.sendKeys(university);
			optionsVisibleText(university).click();

			optionsVisibleText(courseType).click();
			
			web.scrollToWebElement(driver, txtPassingYear);

			txtPassingYear.sendKeys(passYear);
			
			btnPassingYear.click();
			web.waitForElementVisibility(driver, btnSaveAndContinue);
			
			btnSaveAndContinue.click();
			rdoBtn.click();

			optionsVisibleText(prefferdJobType).click();

			optionsVisibleText(prefferdEmployType).click();

			optionsVisibleText(prefferdWorkLocation1).click();

			optionsVisibleText(prefferdWorkLocation2).click();

			optionsVisibleText(gender).click();

			btnSubmit.click();
			System.out.println("User Details Submitted Successfully");
			
			web.waitForElementVisibility(driver, btnSkipAndContinue);
			btnSkipAndContinue.click();
			
			System.out.println(txtUserName.getText());
			System.out.println(txtEmpProfile.getText());
			
			String actual ="Home | Mynaukri";
			String expected = driver.getTitle();
			Assert.assertEquals(actual, expected);
			System.out.println(actual);

			System.out.println("Naukri Home Page Verified SuccessFully");
		} catch (Exception e) {
			Assert.fail("Naukri Home Page Not Verified");
		}					
	}


}