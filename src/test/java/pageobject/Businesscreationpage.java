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
	
	@FindBy(xpath="(//button[@type='button'])[2]")WebElement btnCreateBusinessProfile;

	@FindBy(xpath="//input[@type='file']//following-sibling::div")WebElement uploadProfile;
	@FindBy(xpath="//input[@type='text']")List<WebElement> infoPageTextFields;
	
	
}
