package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createaccountpage  extends Basicpage {

	public createaccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "((//label[.='Your password'])[1]/../../following-sibling::div/button)[2]") private WebElement LoginwithOTPbutton;
	
	
	@FindBy(xpath = "(//span[.='Create an account'])[2]") private WebElement createanaccountbutton;
	@FindBy(xpath = "((//h2[.='Choose User Role'])[2]/../following-sibling::div)[1]/div") private List<WebElement> listofsubroles;
	@FindBy(xpath = "((//h2[.='Choose User Role'])[2]/../following-sibling::div)[2]/button/span") private WebElement continuebutton;
	
	@FindBy(xpath = "(//label[@title='Full Name'])[2]/../following-sibling::div/div/div/input") private WebElement fullnametextfield;
	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span//input)[2]") private WebElement whatsappnumbertextfield;
	@FindBy(xpath = "(((//label[@title='WhatsApp Number (Primary)'])[2]/../following-sibling::div/div)[1]/div/span/span/span/div/div/span/span)[1]/input") private WebElement countrycodetextfiled;
	@FindBy(xpath = "(//label[@title='Email ID'])[2]/../following-sibling::div/div/div/input") private WebElement emailIDtextfield;
	@FindBy(xpath = "(//button[@type='submit'])[2]/span") private WebElement sendotpbutton;
	
	
	public void clickonloginwithOTPbutton()
	{
		LoginwithOTPbutton.click();
	}

	
	
	public void selectsubroles()
	{
		for(int i = 0; i>= listofsubroles.size(); i++)
		{
			WebElement subroles = listofsubroles.get(i);
			System.out.println("List of subroles :- "+ subroles);
			
		}
	}
}
