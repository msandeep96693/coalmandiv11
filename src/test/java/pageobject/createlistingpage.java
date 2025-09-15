package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createlistingpage extends Basicpage {
	
	public createlistingpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//button[.='Listing']")
	private WebElement navlistingbutton;
	
	@FindBy(xpath = "//span[contains(.,'Create Listing Item')]")  // //span[.='Create Listing Item']
	private WebElement createlistingitembutton;
	
	@FindBy(xpath = "//label[@class='ant-form-item-required']")
	private List<WebElement> fetchallthelabelname;
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[1]")  // //div[@class='ant-select-selector']
	private WebElement clickonalldropdown; 
	
	@FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div") // //div[@class='ant-select-item-option-content']
	private List<WebElement> Alldropdownoptionlist;
	
	// fixed carbon, moisture and etc field address and EMD%, credit days
	@FindBy(xpath = "//input[@type='number']") 
	private List<WebElement> coalspecificationinputfield;
	
	// siding code, Quantity, Rate per MT, Free payment peroid input field
	@FindBy(xpath = "//input[@type='text']")
	private List<WebElement> alllogisticsinputfield;
	
	// loading point address and other remarks textarea
	@FindBy(xpath = "//textarea") 
	private List<WebElement> alltextareainputfield;
	
	// Upload document
	@FindBy(xpath = "//input[@type='file']")
	private WebElement attachdocument; 
	
	@FindBy(xpath = "//span[contains(.,'Create Listing')]")  // //span[.='Create Listing']
	private WebElement createlistingbutton;
	
	@FindBy(xpath = "//div[.='My Listings']") 
	private WebElement mylistingtabname;
	
//	verfiy the source coal and pensing status name in Mylisting page after create a listing
	@FindBy(xpath = "//div[contains(@class,'ant-card-head-title')]/..")
	private WebElement verifycoalnameandpendingstatusname;
	
	
	
	public void clickonlistingfromnavbar()
	{
		waitforElement(navlistingbutton);
		navlistingbutton.click();
	}

	public void clickoncreatelistingbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforElement(createlistingitembutton);
		createlistingitembutton.click();
	}
	
//	public void fetchallthelabelnameforallfields()
//	{
//		for( WebElement labelname : fetchallthelabelname)
//		{
//			waitforElement(labelname);
//			String nameoflabel = labelname.getText();
//			
//			System.out.println("Name of labels :- "+ nameoflabel);
//		}
//	}
	
	public void labelcount()
	{
		for(int i = 0; i<fetchallthelabelname.size(); i++)
		{
			String labelname = fetchallthelabelname.get(i).getText();
			System.out.println(" count :- "+ fetchallthelabelname.size());
			System.out.println(" Name of label :- "+ labelname);
		}
	}
	
	public void clickondropdown()
	{
		try {
			waitforElement(clickonalldropdown);
			clickonalldropdown.click();
		} catch (ElementClickInterceptedException e) {
			waitforElement(clickonalldropdown);
//			driver.findElement(By.xpath("(//span[@class='ant-select-selection-search'])[1]")).click();
			clickonalldropdown.click();
		}
		
	}
		
		public void fetchoptionname()
		{
			for(int i = 0; i<Alldropdownoptionlist.size(); i++)
			{
				String optionname = Alldropdownoptionlist.get(i).getText();
				System.out.println(" count :- "+ Alldropdownoptionlist.size());
				System.out.println(" Name of label :- "+ optionname);
			}
		}
			
}
