package DefinitionSteps;

import java.awt.AWTException;

import org.testng.internal.BaseClassFinder;

import BasicFlow.BasicClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobject.createaccountpage;

public class BusinessaccountcreationStep extends BasicClass {
	
	@When("customer click on create an account button")
	public void customer_click_on_create_an_account_button() {
		createaccount = new createaccountpage(driver); 
		System.out.println("check driver :-"+ driver);
		createaccount.clickonNewtocoalmandibutton();
	}
	
	@And("customer should select one subrole")
	public void customer_should_select_one_subrole() throws InterruptedException {
		createaccount.selectsubroles();
	}
	
	@And("customer click on continue button")
	public void customer_click_on_continue_button() {
	   createaccount.clickoncontinuebtn();
	}
	@And("customer enter fullname")
	public void customer_enter_fullname() {
	    createaccount.enterfullnameintotextfield(setRandomFirstName());
	}
	@And("customer enter whatsapp number")
	public void customer_enter_whatsapp_number() {
	    createaccount.enterwhatsappnumberintofield(setRandomMobileNumber());
	}
	@And("customer enter emailID")
	public void customer_enter_email_id() {
	   createaccount.enteremailIDintotextfield(setRandomEmail());
	}
	@When("customer click on send otp button")
	public void customer_click_on_send_otp_button() throws InterruptedException {
	    createaccount.clickonsendotpbutton();
	}
	@And("Extract the OTP from whatsapp number and enter into whatsapp number field")
	public void extract_the_otp_from_whatsapp_number_and_enter_into_whatsapp_number_field() {
	    createaccount.enterotpintotextfields();
	}
	@And("then user navigate to create password page")
	public void then_user_navigate_to_create_password_page() {
		createaccount.verifycreatepasswordpage();
	}
	@And("customer enter password")
	public void customer_enter_password() {
	  createaccount.enterpasswordintotextfield("Sandeep@123");
	}
	@And("customer enter confirm password")
	public void customer_enter_confirm_password() {
		createaccount.enterconfirmpasswordintotextfield("Sandeep@123");
	}
	@When("customer click on create Account button with confirmation message")
	public void customer_click_on_create_account_button_with_confirmation_message() {
		createaccount.clickoncreateaccountbutton();
	}
	
	@And("Profile profile view page will display")
	public void profile_profile_view_page_will_display() {
	    Assert.assertEquals(createaccount.verifyprofilepreviewpage(), "Account Created");
	    
	}
	
	@When("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		Assert.assertEquals(createaccount.verifyaccountcreatemessage(), "Account created successfully");
	    createaccount.clickonlogoutbutton();
	}
	
	
	
	

}
