package DefinitionSteps;

import org.testng.internal.BaseClassFinder;

import BasicFlow.BasicClass;
import io.cucumber.java.en.*;
import pageobject.createaccountpage;

public class BusinessaccountcreationStep extends BasicClass {
	
	@When("customer click on create an account button")
	public void customer_click_on_create_an_account_button() {
		createaccount = new createaccountpage(driver);
		System.out.println("check driver :-"+ driver);
		createaccount.clickonNewtocoalmandibutton();
	}
	
	@When("customer should select one subrole")
	public void customer_should_select_one_subrole() throws InterruptedException {
		createaccount.selectsubroles("Consumer");
	}
	
	@When("customer click on continue button")
	public void customer_click_on_continue_button() {
	   createaccount.clickoncontinuebtn();
	}
	@When("customer enter fullname")
	public void customer_enter_fullname() {
	    createaccount.enterfullnameintotextfield("Sandeep");
	}
	@When("customer enter whatsapp number")
	public void customer_enter_whatsapp_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter emailID")
	public void customer_enter_email_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on send otp button")
	public void customer_click_on_send_otp_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Extract the OTP from whatsapp number and enter into whatsapp number field")
	public void extract_the_otp_from_whatsapp_number_and_enter_into_whatsapp_number_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Extract the OTP from email and enter into emailid field")
	public void extract_the_otp_from_email_and_enter_into_emailid_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on verify account button")
	public void customer_click_on_verify_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("then user navigate to create password page")
	public void then_user_navigate_to_create_password_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter password")
	public void customer_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter confirm password")
	public void customer_enter_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on create Account button with confirmation message")
	public void customer_click_on_create_account_button_with_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("Profile profile view page will display")
	public void profile_profile_view_page_will_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("click on logout button")
	public void click_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("customer click on create business profile button")
	public void customer_click_on_create_business_profile_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on image upload icon")
	public void customer_click_on_image_upload_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter remember As into textfield")
	public void customer_enter_remember_as_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter GST number into textfield")
	public void customer_enter_gst_number_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on verify GST button")
	public void customer_click_on_verify_gst_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer verify the business name and registered address data")
	public void customer_verify_the_business_name_and_registered_address_data() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter city into textfield")
	public void customer_enter_city_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter state into textfield")
	public void customer_enter_state_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select a option from ownership dropdown")
	public void customer_select_a_option_from_ownership_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select a option from industry dropdown")
	public void customer_select_a_option_from_industry_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select a option from product to Trade dropdown")
	public void customer_select_a_option_from_product_to_trade_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select a option from origin of coal dropdown")
	public void customer_select_a_option_from_origin_of_coal_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter customer person name into textfield")
	public void customer_enter_customer_person_name_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter designation into textfield")
	public void customer_enter_designation_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter Business email into textfield")
	public void customer_enter_business_email_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter mobile number into textfield")
	public void customer_enter_mobile_number_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on save & Proceed button")
	public void customer_click_on_save_proceed_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	

}
