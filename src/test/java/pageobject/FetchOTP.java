package pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class FetchOTP {
	
	WebDriver driver;
	
	public FetchOTP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "(((//h2[.='Enter OTP'])[2]/../following-sibling::div)[1]/form/div)[1]/div/div/div/div/div/div/input") private List<WebElement> listofOTPnumberfield;
	
	
	
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
		    System.out.println(message.from().get(0).email());
		    System.out.println(message.to().get(0).email());
		    
		    System.out.println("-------Body --------");
		    System.out.println(message.text().body());
		    
		    // otp fetch 
		    System.out.println(message.html().codes().size());
		    
		    Code firstcode = message.html().codes().get(0);
		    System.out.println("CODE  :- " +firstcode.value());
		    String OTP = firstcode.value().trim();
		    
		    assertNotNull(message);
		    assertEquals("Welcome to Coalmandi – Your OTP Code", message.subject());
	}

}
