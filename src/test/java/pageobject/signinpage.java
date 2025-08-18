package pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;


public class signinpage extends Basicpage {
	
	public WebDriver driver;
	
	public signinpage(WebDriver driver)
	{
		super(driver);
	}
	
	// Address - xpath 
	@FindBy(xpath = "//label[@title='Email address']/../../div[2]//input") private WebElement emailfield;
	@FindBy(xpath = "(//label[.='Your password'])[1]/../following-sibling::div/div/div/div/div/span/input") private WebElement passwordfield;
	@FindBy(xpath = "((//label[.='Your password'])[1]/../../following-sibling::div/button)[1]") private WebElement siginbtn;
	
	
	@FindBy(xpath = "((//label[.='Your password'])[1]/../../following-sibling::div/button)[2]") private WebElement LoginwithOTPbutton;
	@FindBy(xpath = "(((//h2[.='Enter OTP'])[2]/../following-sibling::div)[1]/form/div)[1]/div/div/div/div/div/div/input") private List<WebElement> listofOTPnumberfield;
	
	public void enteremailaddressintofield(String email) throws InterruptedException
	{
		try {
			waitforElement(emailfield);
			emailfield.sendKeys(email);
		} catch (ElementNotInteractableException e) {
			waitforElement(emailfield);
			emailfield.sendKeys(email);
		}
		
	}
	
	public void enterpasswordintofield(String pwd) throws InterruptedException
	{

		try {
			waitforElement(passwordfield);
			passwordfield.sendKeys(pwd);
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
	

	public void fetchemailotp() throws IOException, MailosaurException
	{
		    String apiKey = "NtYQhOQxNRXPpDlZzL0LhLFV4msgk6AJ";
		    String serverId = "50ih2qmm";
		    String serverDomain = "50ih2qmm.mailosaur.net";
		    
//		    anything@50ih2qmm.mailosaur.net


		    MailosaurClient mailosaur = new MailosaurClient(apiKey);

		    MessageSearchParams params = new MessageSearchParams();
		    params.withServer(serverId);
		    
		    SearchCriteria criteria = new SearchCriteria();
		    criteria.withSentTo("anything@" + serverDomain);

		    Message message = mailosaur.messages().get(params, criteria);
//		    System.out.println(message.from().get(0).email());
//		    System.out.println(message.to().get(0).email());
//		    
//		    System.out.println("-------Body --------");
//		    System.out.println(message.text().body());
		    
		    assertNotNull(message);
		    assertEquals("Your Coalmandi OTP for Login", message.subject());
	
		    
		    // otp fetch 
		    System.out.println("-----------"+message.html().codes().size());
		    
		    Code firstcode = message.html().codes().get(0);
		    System.out.println("CODE  :- " +firstcode.value());
		    String OTP = firstcode.value().trim();
		    System.out.println("Fetched OTP: " + OTP);
		    
		    enterlistofOTPnumber(OTP);
		    
		   	}
	
	public void enterlistofOTPnumber(String num) {
	    // Ensure we have enough fields for the OTP length
	    for (int i = 0; i < num.length() && i < listofOTPnumberfield.size(); i++) {
	        WebElement field = listofOTPnumberfield.get(i);
	        field.clear(); // Optional: clear existing value
	        field.sendKeys(String.valueOf(num.charAt(i)));
	    }
	}
	
	}
	
	


