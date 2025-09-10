package pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.description.modifier.Ownership;

public class Businesscreationpage extends Basicpage {

	public Businesscreationpage(WebDriver driver)
	{
		super(driver);
	}
	
	// xpath business profile 
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div/div[2]/button/span")
	private WebElement btnCreateBusinessProfile;

	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div[3]/div/form/div[1]/div/span/div/span/div")
	private WebElement uploadProfile;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement rememberastextField;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement gstnumberfield;
	
	@FindBy(xpath = "//span[.='Verify GST']") // /html/body/div[1]/div/div/div[2]/div/div/div[3]/div/form/div[3]/div/button/span
	private WebElement verifygstbutton;
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement cityfield;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement statefield;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement contactnamefield;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement desginationfield;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailfield;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement mobilenumberfield;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	private WebElement onwershipdropdown;
	
	@FindBy(xpath = "//div[.='LLP']")  // /html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div
	private WebElement llpoption;
	
	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement industrydropdown;
	
	@FindBy(xpath = "//div[.='Brick Kilns & Ceramics']")  // /html/body/div[4]/div/div/div[2]/div[1]/div/div/div[1]/div
	private WebElement brickkilnoption;
	
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	private WebElement producttotradedropdown;
	
	@FindBy(xpath = "//div[.='PET Coke']") // /html/body/div[5]/div/div/div[2]/div/div/div/div[1]/div
	private WebElement petcokeoption;
	
	@FindBy(xpath = "(//input[@type='search'])[4]")
	private WebElement originofcoaldropdown;
	
	@FindBy(xpath = "//div[.='Domestic']") // /html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div
	private WebElement domesticoption;  
	
	
	
	
	
	
	public void clickoncreatebusinessprofilebutton()
	{
		waitforElement(btnCreateBusinessProfile);
		btnCreateBusinessProfile.click();
	}
	
	public void uploadbusinessprofile()
	{
//		waitforElement(uploadProfile);
//		uploadProfile.sendKeys("C://Users//User//Desktop//Background images//Bg-2.jpg");
		System.out.println("upload file");
	}
	
	public void businessinfotextfield(String remembername)
	{
		waitforElement(rememberastextField);
		rememberastextField.sendKeys(remembername);
		
	}
	
	public void entergstnumberfield(String gstnumber)
	{
		waitforElement(gstnumberfield);
		gstnumberfield.sendKeys(gstnumber);
	}
	
	public void clickonverifygstnumber()
	{
		waitforElement(verifygstbutton);
		verifygstbutton.click();
	}
	
	public void entercityfield(String cityname)
	{
		waitforElement(cityfield);
		cityfield.sendKeys(cityname);
	}
	
	public void enterstatefield(String statename) throws InterruptedException
	{
		waitforElement(statefield);
		statefield.sendKeys(statename);
		
		Thread.sleep(2000);
	}
	
	public void clickonownershipdropdown()
	{
		waitforElement(onwershipdropdown);
		onwershipdropdown.click();
		
		waitforElement(llpoption);
		llpoption.click();
		
		
	}
	
	public void clickonindustrydropdown()
	{
		waitforElement(industrydropdown);
		industrydropdown.click();
		
		waitforElement(brickkilnoption);
		brickkilnoption.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", contactnamefield);
	}
	
	public void clickonproducttotradedropdown() throws AWTException
	{
		waitforElement(producttotradedropdown);
		producttotradedropdown.click();
		
		waitforElement(petcokeoption);
		petcokeoption.click();
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_ESCAPE);
		rt.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public void clickonoriginofcoaldropdown()
	{
		waitforElement(originofcoaldropdown);
		originofcoaldropdown.click();
		
		waitforElement(domesticoption);
		domesticoption.click();
	}
	
	public void entercontactnamefield(String contactname)
	{
//		scrollUntilElementVisible(contactnamefield);
		waitforElement(contactnamefield);
		contactnamefield.sendKeys(contactname);
	}
	
	public void enterdesignationfield(String designation)
	{
		waitforElement(desginationfield);
		desginationfield.sendKeys(designation);
	}
	
	public void enteremailIdfield(String emailID)
	{
		waitforElement(emailfield);
		emailfield.sendKeys(emailID);
	}
	
	public void entermobilenumberfield(String mobilenumber)
	{
		scrollUntilElementVisible(mobilenumberfield);
		waitforElement(mobilenumberfield);
		mobilenumberfield.sendKeys(mobilenumber);
	}

	
}
