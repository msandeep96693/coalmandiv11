package DefinitionSteps;

import java.io.IOException;
import java.net.MalformedURLException;

import com.mailosaur.MailosaurException;

import BasicFlow.BasicClass;
import BasicFlow.ReadGmailOTP;
import io.cucumber.java.en.*;
import pageobject.FetchOTP;
import pageobject.signinpage;

public class LoginStep extends BasicClass  {
	
	@Given("should navigate to the login page")
	public void user_should_navigate_to_the_login_page() throws MalformedURLException {
		InitialiseBrowser("chrome");
		sign = new signinpage(driver);
		System.out.println("User navigate to login page :-"+ driver);	
	}
	
	@When("Enter the url as {string}")
	public void enter_the_url_as(String url) {
		driver.get(url);
	}
	
	@Then("Verify that the customer is navigated to the customer website")
	public void verify_that_the_customer_is_navigated_to_the_customer_website() {
	  System.out.println("Navigated to the customer website");
	  
	}
	
	@When("Enter the email address as {string} and password as {string}")
	public void enter_the_email_address_as_and_password_as(String email, String pwd) throws InterruptedException {
	    sign.enteremailaddressintofield(email);
	    sign.enterpasswordintofield(pwd);
	}
	
	@And("Clicks on the login button")
	public void clicks_on_the_login_button() {
	    sign.clickonsignbtn();
	    
	}
	
	@Then("Verify that the customer is navigated to the dashboard page with the confirmation message")
	public void verify_that_the_admin_is_navigated_to_the_dashboard_page_with_the_confirmation_message() {
	   System.out.println("Dashboard");
	  
	}
	
	@When("user enter the invalid email address as {string} and valid password as {string}")
	public void user_enter_the_invalid_email_address_as_and_valid_password_as(String string, String string2) {
	  System.out.println("Empty");
		
	}
	
	@Then("Verify the email not registered error message will display")
	public void verify_the_email_not_registered_error_message_will_display() {
		System.out.println("Empty");
		
	}
	
	@When("user enter the valid email address as {string} and invalid password as {string}")
	public void user_enter_the_valid_email_address_as_and_invalid_password_as(String string, String string2) {
		System.out.println("Empty"); 
	}
	
	@Then("Verify the invalid password error message will display")
	public void verify_the_invalid_password_error_message_will_display() {
		System.out.println("Empty");
	}
	
	@When("user enter the email address as {string}")
	public void user_enter_the_email_address_as(String email) throws InterruptedException {
		sign.enteremailaddressintofield(email);
	}
	
	@When("Clicks on the login with OTP button")
	public void clicks_on_the_login_with_otp_button() {
	    sign.clickonloginwithOTPbutton();
	}
	
	@When("extract otp from email and enter otp into otp fields")
	public void extract_otp_from_email_and_enter_otp_into_otp_fields() throws InterruptedException, IOException, MailosaurException {

		sign.fetchemailotp();
		
	}
	
	@When("user click on Verify & Log in button")
	public void user_click_on_verify_log_in_button() {
	    System.out.println("Verified");
	}
	
	@Then("verify that user redirected to dashboard page")
	public void verify_that_user_redirected_to_dashboard_page() {
		System.out.println("Dashboard");
		 TearDown();
	}
	

}
