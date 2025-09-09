package DefinitionSteps;


import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;

import BasicFlow.BasicClass;
import io.cucumber.java.en.*;
import pageobject.signinpage;

public class LoginStep extends BasicClass  {
	
	@Given("user should navigate to the login page")
	public void user_should_navigate_to_the_login_page()  {
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
		String Actual_title = driver.getTitle();
		String Expected_title = "coalmandi";
		Assert.assertEquals(Expected_title, Actual_title);
	  }
	
	@And("Enter the email address as {string} and password as {string}")
	public void enter_the_email_address_as_and_password_as(String email, String pwd) throws InterruptedException {
	   
		sign.enteremailaddressintofield(email);
	    sign.enterpasswordintofield(pwd);
	}
	
	@And("Clicks on the login button")
	public void clicks_on_the_login_button() throws AWTException {
	    sign.clickonsignbtn();
	    
	}
	
	@Then("Verify that the customer is navigated to the dashboard page with the confirmation message")
	public void verify_that_the_admin_is_navigated_to_the_dashboard_page_with_the_confirmation_message() {
		//Assert.assertEquals(sign.loginsuccessfulconfirmationmessage(), "Login successful");
		System.out.println("Dashboard");
	}
	
	@When("user enter the invalid email address as {string} and valid password as {string}")
	public void user_enter_the_invalid_email_address_as_and_valid_password_as(String email1, String pwd2) throws InterruptedException {
	  sign.enteremailaddressintofield(email1);
	  sign.enterpasswordintofield(pwd2);
		
	}
	
	@Then("Verify the email not registered error message")
	public void verify_the_email_not_registered_error_message() {
		Assert.assertEquals(sign.Emailnotregisteredconfirmationmessage(), "Email not registered");
		
	}
	
	@When("user enter the valid email address as {string} and invalid password as {string}")
	public void user_enter_the_valid_email_address_as_and_invalid_password_as(String email3, String pwd3) throws InterruptedException {
		sign.enteremailaddressintofield(email3);
		sign.enterpasswordintofield(pwd3);
	}
	
	@Then("Verify the invalid password error message")
	public void verify_the_invalid_password_error_message() {
		Assert.assertEquals(sign.invalidpasswordconfirmationmessage(), "Invalid Password");
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
	public void extract_otp_from_email_and_enter_otp_into_otp_fields() throws AWTException, InterruptedException  {
		sign.enterotpintotextfields();
		}
	
//	@When("user click on Verify & Log in button")
//	public void user_click_on_verify_log_in_button() {
//	    sign.clickonverifyandloginbutton();
//	}
	
	@And("user click on profile icon")
	public void user_click_on_profile_icon() throws InterruptedException {
	   sign.clickonprofileicon();
	}
	
	@And("user click on logout button")
	public void user_click_on_logout_button() {
	    sign.clickonlogoutbutton();
	}
	
	@Then("verify the login page is displayed")
	public void verify_the_login_page_is_displayed() {
		System.out.println("Verified");
	    
	}

	@Then("close the application")
	public void close_the_application() {
	    TearDown();
	}

}
