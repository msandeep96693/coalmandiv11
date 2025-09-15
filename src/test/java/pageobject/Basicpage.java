
package pageobject;

import java.time.Duration;
import java.util.List;
import java.util.function.BooleanSupplier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILS.waitHelper;

public class Basicpage 
{
	waitHelper wait;
	WebDriver driver;


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
	
	public void waituntilelementvisibleandclickable(WebElement element)
	{
		wait = new waitHelper(driver);
		wait.waituntilelementclickable(element, Duration.ofSeconds(30));
	}
		
	public void scrollUntilElementVisible(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		//element.click();
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
	
	
	// --------------------------------------------------------------------------------
	
	
	 public static WebElement waitForClick(WebDriver driver, WebElement element, int timeout) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	       // wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(element)));
	        return wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	
	
	public static void safeClick(WebDriver driver, WebElement element, int timeout) {
        try {
            waitForClick(driver, element, timeout).click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }
	
	
}
