package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Businesscreationpage extends Basicpage {

	public Businesscreationpage(WebDriver driver)
	{
		super(driver);
	}
	
	// xpath business profile 
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement btnCreateBusinessProfile;

	@FindBy(xpath="//input[@type='file']//following-sibling::div")
	private WebElement uploadProfile;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement rememberastextField;
	
	
	public void clickoncreatebusinessprofilebutton()
	{
		waitforElement(btnCreateBusinessProfile);
		btnCreateBusinessProfile.click();
	}
	
	public void uploadbusinessprofile()
	{
		System.out.println("upload file");
	}
	
	public void businessinfotextfield()
	{
		waitforElement(rememberastextField);
		rememberastextField.sendKeys("Remembersgsagas");
		
	}
	
}
