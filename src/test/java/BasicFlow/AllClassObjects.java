package BasicFlow;

import org.openqa.selenium.WebDriver;

import pageobject.Businesscreationpage;
import pageobject.createaccountpage;
import pageobject.signinpage;

public class AllClassObjects 
{
	
	public signinpage sign;
	public createaccountpage createaccount;
	public Businesscreationpage business;

public AllClassObjects(WebDriver driver)
{
	sign = new signinpage(driver);
	createaccount = new createaccountpage(driver);
	business = new Businesscreationpage(driver);
}
}
