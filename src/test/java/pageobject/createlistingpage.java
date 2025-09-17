package pageobject;

import java.sql.Time;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

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
	
	@FindBy(xpath = "//span[@class='ant-select-selection-item']")  // //div[@class='ant-select-selector']
	private List<WebElement> clickonalldropdown;
	
	@FindBy(xpath = "//div[@class='ant-select-item-option-content']") //  //div[@class='rc-virtual-list-holder-inner']/div   
	private List<WebElement> Alldropdownoptionlist;
	
	@FindBy(xpath = "//div[@class='ant-form-item-control-input-content']/input")
	private List<WebElement> Allinputfield;
	
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
	
	//  //div[@class='ant-form-item-control-input-content']/input       ::-->Text field
	//  //div[@class='ant-col ant-form-item-label css-1tbu3z4']/label   ::-->Labels
	
	public void clickonlistingfromnavbar()
	{
		waitforElement(navlistingbutton);
		navlistingbutton.click();
	}

	public void clickoncreatelistingbutton() throws InterruptedException
	{
		Thread.sleep(5000);
		waitforElement(createlistingitembutton);
		createlistingitembutton.click();
		
		Thread.sleep(2000);
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
			//System.out.println(" count :- "+ fetchallthelabelname.size());
			System.out.println(" Name of label :- "+ labelname);
		}
	}
	/*
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
	
	*/
		
		public void fetchoptionname()
		{
			for(int i = 0; i<Alldropdownoptionlist.size(); i++)
			{
				String optionname = Alldropdownoptionlist.get(i).getText();
				System.out.println(" count of option :- "+ Alldropdownoptionlist.size());
				System.out.println(" Name of option :- "+ optionname);
			}
		}
			
	
	public void selectOptionFromDropdown(String optionName) {
	    // Wait for all dropdown options to be visible
//	    List<WebElement> options = new WebDriverWait(driver, Duration.ofSeconds(10))
//	            .until(ExpectedConditions.visibilityOfAllElements(Alldropdownoptionlist));

	    for (WebElement option : Alldropdownoptionlist) {
	        String text = option.getText().trim();
	        try {
	        	if (text.contains(optionName)) 
	        	{
		            System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
		            option.click();
		            return; // Exit after selecting
		        }
			} catch (Exception e) {
				System.out.println("Text :-"+ text);
				if (text.contains(optionName)) 
				{
					System.out.println("Selecting option :- " + text);
		            waitforElement(option);  // <-- your existing custom wait method
		            option.click();
		            return; // Exit after selecting
		        }
			}
	        
	    }
	    throw new RuntimeException("Option '" + optionName + "' not found in dropdown!");
	}
	
	
	
	 public void selectDropdownOption(String labelName, String optionName) throws InterruptedException   //  
	 {
	        for (int i = 0; i < fetchallthelabelname.size(); i++) 
	        {
	            String currentLabel = fetchallthelabelname.get(i).getText().trim();
	            System.out.println("Fetch label name :- "+currentLabel);

	            switch (currentLabel)
	            {
	                case "Business Profile":
	                case "Coal Type":
	                case "Origin of Coal":
	                case "Source of Coal":
	                case "Grade":
	                case "CIL Subsidiary":
	                case "Mine":
	                case "Fixed Carbon Percentage":
	                case "Fixed Carbon MIN/MAX":
	                case "Ash Content Percentage":
	                case "Ash Content MIN/MAX":
	                case "Volatile Matter Percentage":
	                case "Volatile Matter MIN/MAX":
	                case "Total Moisture Percentage":
	                case "Total Moisture MIN/MAX":
	                case "Delivery mode":
	                case "Railway siding code":
	                case "Quantity (MT)":
	                case "Rate per MT (INR)":
	                case "Delivery terms":
	                case "Payment terms":
	                case "Credit Days":
	                case "EMD%":
	                case "Free Payment Period (Days)":
	                case "Free Lifting Period (Days)":
	                case "Validity Start Date":
	                case "Validity End Date":
	                case "Loading Point Address":
	                
	                
	                    if (currentLabel.equalsIgnoreCase(labelName)) 
	                    {
	                        // Click corresponding dropdown
	                    	//waitforElement(clickonalldropdown);
	                    	System.out.println("verify label name 1 :- "+ currentLabel);
	                    	Thread.sleep(3000);
	                        clickonalldropdown.get(i).click();
	                        Thread.sleep(1000);
	                        System.out.println(clickonalldropdown.get(i));
	                        System.out.println("verify label name 2 :- "+ currentLabel);
	                        selectOptionFromDropdown(optionName);
	                        return;
	                        

//	                        // Find and click option
//	       // mahindra123 (TOYOTA TSUSHO INSURANCE BROKER INDIA PRIVATE LIMITED)
//	                        for (WebElement option : Alldropdownoptionlist) 
//	                        {
//	                            if (option.getText().trim().equalsIgnoreCase(optionName)) 
//	                            {
//	                            	System.out.println("option name :- "+ option);
//	                            	waitforElement(option);
//	                                option.click();
//	                                return; // Exit after selecting
//	                            }
//	                        }
	                    }
	                    break;

	                default:
	                    // For labels not handled in switch
	                    break;
	            }
	        }
	    }

	
	
	 public void enterdataintoinputfield(String labelName, String inputdata) throws InterruptedException
	 {
		 for (int i = 0; i < fetchallthelabelname.size(); i++) 
	     {
	         String currentLabel = fetchallthelabelname.get(i).getText().trim();
	         System.out.println("Fetch label name :- "+currentLabel);

	         switch (currentLabel)
	         {
	             
	             	case "Business Profile":
	                case "Coal Type":
	                case "Origin of Coal":
	                case "Source of Coal":
	                case "Grade":
	                case "CIL Subsidiary":
	                case "Mine":
	                case "Fixed Carbon Percentage":
	                case "Fixed Carbon MIN/MAX":
	                case "Ash Content Percentage":
	                case "Ash Content MIN/MAX":
	                case "Volatile Matter Percentage":
	                case "Volatile Matter MIN/MAX":
	                case "Total Moisture Percentage":
	                case "Total Moisture MIN/MAX":
	                case "Delivery mode":
	                case "Railway siding code":
	                case "Quantity (MT)":
	                case "Rate per MT (INR)":
	                case "Delivery terms":
	                case "Payment terms":
	                case "Credit Days":
	                case "EMD%":
	                case "Free Payment Period (Days)":
	                case "Free Lifting Period (Days)":
	                case "Validity Start Date":
	                case "Validity End Date":
	                case "Loading Point Address":
	            	 
	            
	            	 if (currentLabel.equalsIgnoreCase(labelName)) 
	                 {
	                 	
	                 	Thread.sleep(3000);
	                 	System.out.println(Allinputfield.size());  
	                 	 System.out.println("first count :- "+Allinputfield.get(i));
	                 	Allinputfield.get(i).sendKeys(inputdata);
//	                     Thread.sleep(1000);
	                    
	                     System.out.println("verify label name 2 :- "+ currentLabel);
	                     return;
	                 } 
	            	 break;
			default:
	                    // For labels not handled in switch
	                    break;
	
	                    
	         }
	     }
	 }
	 
	 
	 
}


	

