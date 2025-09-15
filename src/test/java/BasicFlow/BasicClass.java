package BasicFlow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.Businesscreationpage;
import pageobject.createaccountpage;
import pageobject.createlistingpage;
import pageobject.signinpage;


public class BasicClass {
	
	
	public static WebDriver driver;
	public AllClassObjects pom;
	
	public signinpage sign;
	public createaccountpage createaccount;
	public Businesscreationpage business;
	public createlistingpage createlisting;
	
	@Before
	public void InitialiseBrowser(String BrowserName)  {
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		} else if(BrowserName.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
			
		} else if(BrowserName.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		pom = new AllClassObjects(driver);
		
		}
	

	@After
	public void TearDown() 
	{
		driver.quit();
	}
	
	public String setRandomCampaignName()
	   {
		 String randomstring=RandomStringUtils.random(4,"abcdefghijklmnopqrstuvwxyz");
		 return "Test campaign"+randomstring;
	   }
	   
	   public String setRandomBusinessName()
	   {
		 String randomstring=RandomStringUtils.random(4,"abcdefghijklmnopqrstuvwxyz");
		 return "Remember me"+randomstring;
	   }
	   
	   public String setRandomFirstName()
	   {
		 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
		 return "Sandeep"+randomstring;
	   }
	   
	   public String setRandomLastName()
	   {
		 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
		 return "Rathod"+randomstring;
	   }
	   
	   public String setRandomEmail()
	   {
		 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
		 return "sandeep"+"+"+randomstring+"@rokkun.io";
	   }
	   public String setRandomMobileNumber()
	   {
		  String randomnumeric=RandomStringUtils.randomNumeric(6);
		  return "9620"+randomnumeric;
	   }
	   
//	   public String setRandomalphanumber()
//	   {
//		  String randomalphanumeric=RandomString.randomAlphanumeric(5);
//		  return randomalphanumeric;
//	   }
	  
	   public void robotClickAction() throws AWTException
	   {
			Robot rob=new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
	   }
	   
	   public void minimizethepagesize() throws AWTException, InterruptedException
		{
			Robot rb=new Robot();
			for(int i = 1; i<=3; i++)
			{
				Thread.sleep(1000);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_MINUS);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_MINUS);
			} 	
		}
}