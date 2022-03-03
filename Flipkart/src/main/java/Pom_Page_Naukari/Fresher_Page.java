package Pom_Page_Naukari;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
/**
 * Description:this page contains create account as a fresher
 * @author Shobha
 */

import GenricUtilities.WebDriverUtility;

public class Fresher_Page 
{
	WebDriverUtility web= new WebDriverUtility();
	WebDriver driver;

	public Fresher_Page(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	/* register Button */
	@FindBy(xpath="//li[@class='Register']")
	private WebElement registerBtn;
	
	
	/* name text field */
	@FindBy(id="name")
	private WebElement tfuserNm;
	

	/* Email text field */
	@FindBy(id="email")
	private WebElement tfEmail;
	
	

	
	/* password text field */
	@FindBy(id="password")
	private WebElement tfPswd;
	
	
	
	/* mobNum text field */
	@FindBy(id="mobile")
	private WebElement tfMobNum;
	
	/* fresher Button */
	@FindBy(xpath="//div[@data-val='fresher']")
	private WebElement explogo;
	
	/* text field city */
	@FindBy(id="currentCity")
	private WebElement city1;
	 
	private WebElement optionCity(String city) {
		String xpathValue1 ="//span[text()='"+city+"']";
		return driver.findElement(By.xpath(xpathValue1));
	}
	
	
	/* register now Button */
	@FindBy(xpath="//button[text()='Register Now']")
	private WebElement regNowBtn;
	
	
	/* Skip Button */
	@FindBy(xpath="//span[text()='Skip']")
	private WebElement btnSkip;

	/*Text Highest Qualification */
	@FindBy(xpath="//span[contains(text(),'Graduation/Diploma')]")
	private WebElement txtQualification; 
	
	/*Text Course */
	@FindBy(xpath="//span[contains(text(),'BCA')]")
	private WebElement txtCourse;
	
	private WebElement optionsVisibleText(String course) {
		String xpathText="//span[contains(text(),'"+course+"')]";
		return driver.findElement(By.xpath(xpathText));
	}
	/*Text University */
	@FindBy(id="institute-suggestor")
	private WebElement txtUniversity;

	
	/*Text Specialization */
	@FindBy(id="course-suggestor")
	private WebElement txtSpecialization;

	private WebElement optionsVisibleSpec(String specialization) {
		String xpathText="//span[contains(text(),'"+specialization+"')]";
		return driver.findElement(By.xpath(xpathText));
	}
	
	private WebElement optionsVisibleUnivrsity(String university) {
		String xpathText="//span[contains(text(),'"+university+"')]";
		return driver.findElement(By.xpath(xpathText));
	}
	/*course type tf */
	@FindBy(xpath="//span[text()='Full Time']")
	private WebElement courseType;
	


	/*Text Passing Year */
	@FindBy(xpath="//input[@placeholder='Eg. 2022']")
	private WebElement txtPassingYear;

	/*Button Passing Year */
	@FindBy(xpath="//label[text()='Passing Year']")
	private WebElement btnPassingYear;

	
	private WebElement optionsVisiblePassingyr(String passingYear) {
		String xpathText="//span[contains(text(),'"+passingYear+"')]";
		return driver.findElement(By.xpath(xpathText));
	}
	private WebElement optionsSkills(String keySkills) {
		String xpathindustry="//div[@title='"+keySkills+"']";
		return driver.findElement(By.xpath(xpathindustry));
	}
	/*Test Key Skills */
	@FindBy(xpath="//input[@placeholder='Key skills are crucial for recruiters to hire you']")
	private WebElement txtKeySkills;

	/* course auto suggestion */
	@FindBy(xpath="//span[text()='IT Infrastructure']")
	private WebElement secondKeySkill;
	
	

	/*Button Skip And Continue*/
	@FindBy(xpath="//button[@class='submit-btn resman-btn-primary resman-btn-regular']")
	private WebElement btnSkipAndContinue;
	 
	
	/* radio button */
	@FindBy(css="[fill='none']")
	private WebElement rdoCheckBox; 
	
	/* job type auto suggestion */
	@FindBy(xpath="//span[text()='Permanent']")
	private WebElement jobType; 
	
	/*course Type*/
	@FindBy(xpath="//span[text()='Full Time']")
	private WebElement employType; 
	
	/* work location*/
	@FindBy(id="newLocationPrefId")
	private WebElement wrkLocation; 
	
	/*genric xpath for keyskills*/
	private WebElement optionsSkills2(String keySkills2) {
		String xpathindustry="//span[@title='"+keySkills2+"']";
		return driver.findElement(By.xpath(xpathindustry));
	}
	/**
	 * description:This method is used for click on register and switching window
	 * @author Shobha
	 */
	public void switchingWindow()
	{
		try {
		registerBtn.click();
		web.switchToWindow(driver, "Register on Naukri.com: Apply to Millions of Jobs Online");
		System.out.println("succesfully switching window");
		}catch(Exception e) {
			System.out.println(" window not switching");
			Assert.fail("window not switching");
		}
	
	/**
	 * Description:Method is used for fill the register page
	 * @author Shobha
	 * @param FullName
	 * @param email
	 * @param Password
	 * @param MobNumber
	 */

	}
	public void fetchData(String FullName,String email,String Password,String MobNumber,String city,String course,
			String specialization,String university,String passingYear,String keySkills,String keySkills2) throws Throwable
	{
		try {
		tfuserNm.sendKeys(FullName);
		tfEmail.sendKeys(email);
	
		tfPswd.sendKeys(Password);
		tfMobNum.sendKeys(MobNumber);
		explogo.click();
		city1.sendKeys(city);
		optionCity(city).click();
		
		regNowBtn.click();
		btnSkip.click();
		txtQualification.click();
		txtCourse.click();
		optionsVisibleText(course).click();
		txtSpecialization.sendKeys(specialization);
		optionsVisibleSpec(specialization).click();
		txtUniversity.sendKeys(university);
		optionsVisibleUnivrsity(university).click();
		courseType.click();
		web.ScrollDown(driver);
		btnPassingYear.click();
		optionsVisiblePassingyr(passingYear).click();
		txtKeySkills.sendKeys(keySkills);
		optionsSkills(keySkills).click();
		secondKeySkill.click();
	
		
		
		web.scrollBar(driver, btnSkipAndContinue);
		btnSkipAndContinue.click();
		rdoCheckBox.click();
		
		employType.click();
		optionCity(city).click();
		
		System.out.println("succesfully fill the text field");
	}catch(Exception e) {
		System.out.println(" unable to fill the text field");
		Assert.fail("unable to fill the text field");
	}
		
		
	

	}
}

