package DefinitionSteps;

import java.awt.AWTException;

import BasicFlow.BasicClass;
import UTILS.ConfigProperty;
import io.cucumber.java.en.*;
import pageobject.Businesscreationpage;

public class BusinessprofilecreationStep extends BasicClass {

	
	@When("customer click on create business profile button")
	public void customer_click_on_create_business_profile_button() throws InterruptedException {
		business = new Businesscreationpage(driver);
		System.out.println("check driver :- "+driver);
		business.clickoncreatebusinessprofilebutton();
		
	}
	@When("customer click on image upload icon")
	public void customer_click_on_image_upload_icon() throws InterruptedException {
	   business.uploadbusinessprofile();
	}
	
	@When("customer enter remember As into textfield")
	public void customer_enter_remember_as_into_textfield() {
	    business.businessinfotextfield("Remembername123");
	}
	
	@When("customer enter GST number into textfield")
	public void customer_enter_gst_number_into_textfield() {
	   business.entergstnumberfield("36AAFCK8053R1ZS");
	}
	@When("customer click on verify GST button")
	public void customer_click_on_verify_gst_button() {
	    business.clickonverifygstnumber();
	}
	@When("customer verify the business name and registered address data")
	public void customer_verify_the_business_name_and_registered_address_data() {
	    System.out.println("Verified");
	}
	@When("customer enter city into textfield")
	public void customer_enter_city_into_textfield() {
	    business.entercityfield("chennai");
	}
	@When("customer enter state into textfield")
	public void customer_enter_state_into_textfield() throws InterruptedException {
	    business.enterstatefield("Tamil Nadu");
	}
	@When("customer select a option from ownership dropdown")
	public void customer_select_a_option_from_ownership_dropdown() {
	    business.clickonownershipdropdown();
	}
	@When("customer select a option from industry dropdown")
	public void customer_select_a_option_from_industry_dropdown() {
	    business.clickonindustrydropdown();
	}
	@When("customer select a option from product to Trade dropdown")
	public void customer_select_a_option_from_product_to_trade_dropdown() throws AWTException, InterruptedException {
	    business.clickonproducttotradedropdown();
	}
	@When("customer select a option from origin of coal dropdown")
	public void customer_select_a_option_from_origin_of_coal_dropdown() {
	    business.clickonoriginofcoaldropdown();
	}
	@When("customer enter customer person name into textfield")
	public void customer_enter_customer_person_name_into_textfield() {
	    business.entercontactnamefield(setRandomFirstName());
	}
	@When("customer enter designation into textfield")
	public void customer_enter_designation_into_textfield() {
	    business.enterdesignationfield("manager");
	}
	@When("customer enter Business email into textfield")
	public void customer_enter_business_email_into_textfield() {
	    business.enteremailIdfield(setRandomEmail());
	}
	@When("customer enter mobile number into textfield")
	public void customer_enter_mobile_number_into_textfield() {
	    business.entermobilenumberfield(setRandomMobileNumber());
	}
	@When("customer click on Proceed button")
	public void customer_click_on_proceed_button() {
	    System.out.println("clicked");
	}
	@When("verify the GST number")
	public void verify_the_gst_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer enter sub unit address into textfield")
	public void customer_enter_sub_unit_address_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on save button")
	public void customer_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer upload a authorization letter and click on submit button")
	public void customer_upload_a_authorization_letter_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify authorization letter confirmation message")
	public void verify_authorization_letter_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a Pan card and click on submit button")
	public void customer_upload_a_pan_card_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify Pan card confirmation message")
	public void verify_pan_card_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a GST certificate and click on submit button")
	public void customer_upload_a_gst_certificate_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify GST certificate confirmation message")
	public void verify_gst_certificate_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a Bank details and click on submit button")
	public void customer_upload_a_bank_details_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify Bank details confirmation message")
	public void verify_bank_details_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a Udyam certificate and click on submit button")
	public void customer_upload_a_udyam_certificate_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify Udyam certificate confirmation message")
	public void verify_udyam_certificate_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a IEC certificate and click on submit button")
	public void customer_upload_a_iec_certificate_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify IEC certificate confirmation message")
	public void verify_iec_certificate_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("customer upload a D&B number and click on submit button")
	public void customer_upload_a_d_b_number_and_click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify D&B numberconfirmation message")
	public void verify_d_b_numberconfirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on save & proceed button")
	public void customer_click_on_save_proceed_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("verify the redirected to review & submit page")
	public void verify_the_redirected_to_review_submit_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select the confirm info correctness checkbox")
	public void customer_select_the_confirm_info_correctness_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select the accept terms checkbox")
	public void customer_select_the_accept_terms_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on submit for verification button")
	public void customer_click_on_submit_for_verification_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("verify the review button page")
	public void verify_the_review_button_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}


