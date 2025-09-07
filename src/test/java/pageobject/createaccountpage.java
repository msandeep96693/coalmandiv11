package pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//div[@class='text-center mb-6']/following-sibling::div[2]/div/div[2]/div/span") 
	private List<WebElement> listofsubroles;
	
	@FindBy(xpath = "((//h2[.='Choose User Role'])[2]/../following-sibling::div)[2]/button/span") 
	private WebElement continuebutton;
	
	@FindBy(xpath = "(//label[@title='Full Name'])[2]/../following-sibling::div/div/div/input") 
	private WebElement fullnametextfield;
	
	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span//input)[2]") 
	private WebElement whatsappnumbertextfield;
	
	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span/span/div/div/span/span)[1]/input") 
	private WebElement countrycodetextfiled;
	
	@FindBy(xpath = "(//label[@title='Email ID'])[2]/../following-sibling::div/div/div/input") 
	private WebElement emailIDtextfield;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]/span") 
	private WebElement sendotpbutton;

	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/form/div[1]/div[2]/div/div/div/div/div/div/input")
	private List<WebElement> whatsappotpinputfield;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/form/div[2]/div[2]/div/div/div/div/div/div/input")
	private List<WebElement> emailotpinputfield;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement verifyAccountButton;
	
	
	public void clickonNewtocoalmandibutton()
	{
		waitforElement(createanaccountbutton);
		createanaccountbutton.click();
	}
	
	public void selectsubroles(String rolename) throws InterruptedException
	{
		for(WebElement subroles : listofsubroles)
		{
			//waitforElement(subroles);
			Thread.sleep(40000);
			String roleslist = subroles.getText();
			System.out.println("Role name :- "+roleslist);
			if(roleslist.equalsIgnoreCase(rolename))
			{
				scrollUntilElementVisible(subroles);
				break;
			}
		}
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
	
	public void clickonsendotpbutton()
	{
		waitforElement(sendotpbutton);
		sendotpbutton.click();
	}
	
	public void enterotpintotextfields()
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		 wait.until(d -> whatsappotpinputfield.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
		 wait.until(d -> emailotpinputfield.stream().allMatch(field -> !field.getAttribute("value").isEmpty()));
	}
	
	public void clickonverifyaccountbtn()
	{
		waitforElement(verifyAccountButton);
		verifyAccountButton.click();
	}
	
	
	
	
}
