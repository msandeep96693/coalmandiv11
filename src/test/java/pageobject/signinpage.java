package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class signinpage extends Basicpage {
	
	public WebDriver driver;
	
	public signinpage(WebDriver driver)
	{
		super(driver);
	}
	
	// Address - xpath 
	
	
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement emailfield;
	@FindBy(xpath = "(//input[@type='password'])[1]") private WebElement passwordfield;
	@FindBy(xpath = "(//span[text()='Log in'])[1]/..") private WebElement siginbtn;
	
	
	@FindBy(xpath = "((//label[.='Your password'])[1]/../../following-sibling::div/button)[2]") private WebElement LoginwithOTPbutton;
	@FindBy(xpath = "(((//h2[.='Enter OTP'])[2]/../following-sibling::div)[1]/form/div)[1]/div/div/div/div/div/div/input") private List<WebElement> listofOTPnumberfield;
	
	@FindBy(xpath = "(//ul[@role='menu'])[1]/li") private List<WebElement> leftnavigationfeaturename;
	@FindBy(xpath = "//div[@class='ant-notification-notice-with-icon']/div[text()='Login successful']") private WebElement loginconfirmationmessage; 
	
//	@FindBy(xpath = "//span[@aria-label='user']") private WebElement clickonprofile;
	@FindBy(xpath = "//span[@class='font-medium hidden sm:inline']") private WebElement clickonprofile;
	
	@FindBy(xpath = "//span[.='Logout']") private WebElement clickonlogoutbtn;
	
	public void enteremailaddressintofield(String email) throws InterruptedException
	{
			//waitforElement(emailfield);
			emailfield.sendKeys(email);	
	}
	
	public void enterpasswordintofield(String pwd) throws InterruptedException
	{

			waitforElement(passwordfield);
			passwordfield.sendKeys(pwd);	
	}
	
	public void clickonsignbtn()
	{
		siginbtn.click();
	}
	
	public void clickonloginwithOTPbutton()
	{
		LoginwithOTPbutton.click();
	}

	
	public void clickonprofileicon() 
	{
		try {
		waitforElement(clickonprofile);
		clickonprofile.click();	
		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
			waitforElement(clickonprofile);
			driver.findElement(By.xpath("//span[@class='font-medium hidden sm:inline']")).click();
//			clickonprofile.click();
		}
		
	}
	
	public void clickonlogoutbutton()
	
	{
		waitforElement(clickonlogoutbtn);
		clickonlogoutbtn.click();
	}
	
	public String loginsuccessfulconfirmationmessage()
	{
		waitforElement(loginconfirmationmessage);
		return loginconfirmationmessage.getText();
	}
	}
	
	


