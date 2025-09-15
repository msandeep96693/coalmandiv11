package pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.jsoup.select.Evaluator.IsEmpty;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class signinpage extends Basicpage {
	
	public signinpage(WebDriver driver)
	{
		super(driver);
	}
	
	// Address - xpath 
	
	
	@FindBy(xpath = "(//input[@type='text'])[1]") 
	private WebElement emailfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//span[text()='Log in'])[1]/..") 
	private WebElement siginbtn;
	
	@FindBy(xpath = "(//button[@type='button'])[1]") 
	private WebElement LoginwithOTPbutton;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement verifyloginbtn;
	
	@FindBy(xpath = "(((//h2[.='Enter OTP'])[2]/../following-sibling::div)[1]/form/div)[1]/div/div/div/div/div/div/input") 
	private List<WebElement> listofOTPnumberfield;
	
	@FindBy(xpath = "(//ul[@role='menu'])[1]/li") 
	private List<WebElement> leftnavigationfeaturename;
	
	@FindBy(xpath = "//div[.='Login successful']") 
	private WebElement loginconfirmationmessage; 
	
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	private WebElement invalidpasswordresponsemessage;
	
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	private WebElement emailnotregisteredresponsemessage;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div[3]/form/div[1]/div/div/div/div/div/div/input")
	private List<WebElement> listofinputfield;
	
//	@FindBy(xpath = "//span[@aria-label='user']") 
//	private WebElement clickonprofile;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/header/div/div[2]/div[2]/span[2]") 
	private WebElement clickonprofile;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement clickonlogoutbtn;
	
	
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
	
	public void clickonsignbtn() throws AWTException
	{
		waitforElement(siginbtn);
		siginbtn.click();
		
	}
	
	public void clickonloginwithOTPbutton()
	{
		scrollUntilElementVisible(LoginwithOTPbutton);
		
		waitforElement(LoginwithOTPbutton);
		LoginwithOTPbutton.click();
	}

	
	public void clickonprofileicon() throws InterruptedException 
	{

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickonprofile );
		
//		try {
////		waitforElement(clickonprofile);
//		waituntilelementvisibleandclickable(clickonprofile);
//		clickonprofile.click();	
//		} catch (ElementClickInterceptedException e) {
//			waituntilelementvisibleandclickable(clickonprofile);
//			clickonprofile.click();	
////			driver.findElement(By.xpath("(//span[@role='img'])[3]")).click();
//		}
		
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
	
	public String invalidpasswordconfirmationmessage()
	{
		waitforElement(invalidpasswordresponsemessage);
		return invalidpasswordresponsemessage.getText();
		
	}
	
	public String Emailnotregisteredconfirmationmessage()
	{
		waitforElement(emailnotregisteredresponsemessage);
		return emailnotregisteredresponsemessage.getText();
	}
	
	public void enterotpintotextfields()
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 wait.until(d -> listofinputfield.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
	}
	
//	public void clickonverifyandloginbutton()
//	{
//		waitforElement(verifyloginbtn);
//		verifyloginbtn.click();
//	}
	
	}
	
	


