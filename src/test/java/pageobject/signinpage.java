package pageobject;

import java.util.List;

import org.openqa.selenium.By;
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
	
	
//	public void framer()
//	{
//
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//	}
	
	public void enteremailaddressintofield(String email) throws InterruptedException
	{
		try {
			waitforElement(emailfield);
			emailfield.sendKeys(email);
			//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(email);
		} catch (ElementNotInteractableException e) {
			waitforElement(emailfield);
			//emailfield.sendKeys(email);
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(email);
		}
		
	}
	
	public void enterpasswordintofield(String pwd) throws InterruptedException
	{

		try {
			waitforElement(passwordfield);
			passwordfield.sendKeys(pwd);
			//driver.findElement(By.xpath("(//label[.='Your password'])[1]/../following-sibling::div/div/div/div/div/span/input")).sendKeys(pwd);
		} catch (Exception e) {
			waitforElement(passwordfield);
			passwordfield.sendKeys(pwd);
		}
		
	}
	
	public void clickonsignbtn()
	{
		siginbtn.click();
	}
	
	public void clickonloginwithOTPbutton()
	{
		LoginwithOTPbutton.click();
	}
	

	public void leftnavigationfeature() 
	{
		for(WebElement listoffeature : leftnavigationfeaturename)
		{
			String featurename = listoffeature.getText();
			System.out.println("List of feature name :- "+ featurename);
		}	
	}
	
	}
	
	


