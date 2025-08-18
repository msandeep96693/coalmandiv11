
package pageobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Code;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

import UTILS.waitHelper;

public class Basicpage 
{
	waitHelper wait;
	WebDriver driver;
	 static int OTP;

	Basicpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitforElement(WebElement element)
	{
		wait=new waitHelper(driver);
		wait.waitElementHelper(element, Duration.ofSeconds(30));
	}
	
	public void waitElementHelper(List<WebElement> elements)
	{
		wait.waitElementHelper(elements, Duration.ofSeconds(30));
	}
	
	public void waitElementHelper(By element)
	{
		wait.waitElementHelper(element, Duration.ofSeconds(30));
	}
	
	public void waitUntilConditionIsTrue(BooleanSupplier condition)
	{
		wait.waitUntilConditionIsTrue(condition, Duration.ofSeconds(30));
	}
	
	public void waitForLoaderToClose(WebElement element)
	{
		wait=new waitHelper(driver);
		wait.waitUntilLoaderToClose(element, Duration.ofSeconds(10));
	}
		
	public void scrollUntilElementVisible(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void scrollBottomofPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");	
	}
	
	public void scrollDownNumberofpixels()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void Hiddennavigationmessage(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='block';",element);
	}
	
	
}
