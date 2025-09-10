package pageobject;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createaccountpage  extends Basicpage {

	public createaccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement createanaccountbutton;
	
//	@FindBy(xpath = "//div[@class='text-center mb-6']/following-sibling::div[2]/div/div[2]/div/span") 
	// //div[contains(@class,'role-card')]//span[text()='Importer']
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/span")
//	private List<WebElement> listofsubroles;
	private WebElement listofsubroles;
	
//	@FindBy(xpath = "((//h2[.='Choose User Role'])[2]/../following-sibling::div)[2]/button/span")
	@FindBy(xpath = "//span[.='Continue']")
	private WebElement continuebutton;
	
//	@FindBy(xpath = "(//label[@title='Full Name'])[2]/../following-sibling::div/div/div/input") 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div/form/div[1]/div/div/div[2]/div/div/input")
	private WebElement fullnametextfield;
	//input[@type='text'])[2]
//	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span//input)[2]") 
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement whatsappnumbertextfield;
	
	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span/span/div/div/span/span)[1]/input") 
	private WebElement countrycodetextfiled;
	
//	@FindBy(xpath = "(//label[@title='Email ID'])[2]/../following-sibling::div/div/div/input") 
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailIDtextfield;
	
	@FindBy(xpath = "//button[@type='submit']/span")
	private WebElement sendotpbutton;

	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/form/div[1]/div[2]/div/div/div/div/div/div/input")
	private List<WebElement> whatsappotpinputfield;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/form/div[2]/div[2]/div/div/div/div/div/div/input")
	private List<WebElement> emailotpinputfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement enterpassword;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement enterconfirmpassword;
	
	@FindBy(xpath = "//span[.='Create Account']")
	private WebElement createaccountbtn;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement logoutbutton;
	
	@FindBy(xpath = "//h3[.='Account Created']")
	private WebElement Accountcreatedtext;
	
	@FindBy(xpath = "//h2[.='Create Password']")
	private WebElement createpasswordtext;
	
	@FindBy(xpath = "//div[.='Account created successfully']")
	private WebElement accountcreateconfirmationmessage;
	
	
	
	public void clickonNewtocoalmandibutton()
	{
		waitforElement(createanaccountbutton);
		createanaccountbutton.click();
	}
	
	public void selectsubroles() throws InterruptedException
	{
		waitforElement(listofsubroles);
		System.out.println("Role name :-"+ listofsubroles.getText());
		listofsubroles.click();
		
//		for(WebElement subroles : listofsubroles)
//		{
//			
////			Thread.sleep(40000);
//			String roleslist = subroles.getText();
//			System.out.println("Role name :- "+roleslist);
//			if(roleslist.equalsIgnoreCase(rolename))
//			{
//				
//				subroles.click();
////				scrollUntilElementVisible(subroles);
//				break;
//			}
//		}
	}
	
	
	public void clickoncontinuebtn()
	{
		waitforElement(continuebutton);
		continuebutton.click();
	}
	
	public void enterfullnameintotextfield(String profilename)
	{
		waitforElement(fullnametextfield);
		fullnametextfield.sendKeys(profilename);
	}
	
	public void enterwhatsappnumberintofield(String whatsappnumber)
	{
		waitforElement(whatsappnumbertextfield);
		whatsappnumbertextfield.sendKeys(whatsappnumber);
	}
	
	public void enteremailIDintotextfield(String emailID)
	{
		waitforElement(emailIDtextfield);
		emailIDtextfield.sendKeys(emailID);
	}
	
	public void clickonsendotpbutton() throws InterruptedException
	{
		Thread.sleep(2000);
//		waitforElement(sendotpbutton);
		sendotpbutton.click();
	}
	
	public void enterotpintotextfields()
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(d -> whatsappotpinputfield.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
		
	}
	
	public void enterpasswordintotextfield(String password)
	{
		waitforElement(enterpassword);
		enterpassword.sendKeys(password);
	}
	
	public void enterconfirmpasswordintotextfield(String confirmpassword)
	{
		waitforElement(enterconfirmpassword);
		enterconfirmpassword.sendKeys(confirmpassword);
	}
	
	public void clickoncreateaccountbutton()
	{
		waitforElement(createaccountbtn);
		createaccountbtn.click();
	}
	
	public String verifyprofilepreviewpage()
	{
		waitforElement(Accountcreatedtext);
		return Accountcreatedtext.getText();
	}
	
	public void clickonlogoutbutton() throws InterruptedException
	{
		Thread.sleep(5000);
		try {
			waitforElement(logoutbutton);
			logoutbutton.click();
		} catch (ElementClickInterceptedException e) {
			waitforElement(logoutbutton);
			logoutbutton.click();
			
		}
		
		
	}
	
	public void verifycreatepasswordpage()
	{
		waitforElement(createpasswordtext);
		createpasswordtext.getText();
	}
	
	public String verifyaccountcreatemessage()
	{
		waitforElement(accountcreateconfirmationmessage);
		return accountcreateconfirmationmessage.getText();
	}
	
	
	
	
}
