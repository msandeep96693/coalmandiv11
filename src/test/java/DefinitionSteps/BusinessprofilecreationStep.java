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
	@And("customer click on image upload icon")
	public void customer_click_on_image_upload_icon() throws InterruptedException {
	   business.uploadbusinessprofile();
	}
	
	
	
	@And("customer enter remember As into textfield")
	public void customer_enter_remember_as_into_textfield() {
	    business.businessinfotextfield(setRandomBusinessName());
	}
	
	@And("customer enter GST number into textfield")
	public void customer_enter_gst_number_into_textfield() {
	   business.entergstnumberfield("36AAFCK8053R1ZS");
	}
	@And("customer click on verify GST button")
	public void customer_click_on_verify_gst_button() {
	    business.clickonverifygstnumber();
	}
	@And("customer verify the business name and registered address data")
	public void customer_verify_the_business_name_and_registered_address_data() {
	    System.out.println("Verified");
	}
	@And("customer enter city into textfield")
	public void customer_enter_city_into_textfield() {
	    business.entercityfield("chennai");
	}
	@And("customer enter state into textfield")
	public void customer_enter_state_into_textfield() throws InterruptedException {
	    business.enterstatefield("Tamil Nadu");
	}
	@And("customer select a option from ownership dropdown")
	public void customer_select_a_option_from_ownership_dropdown() {
	    business.clickonownershipdropdown();
	}
	@And("customer select a option from industry dropdown")
	public void customer_select_a_option_from_industry_dropdown() {
	    business.clickonindustrydropdown();
	}
	@And("customer select a option from product to Trade dropdown")
	public void customer_select_a_option_from_product_to_trade_dropdown() throws AWTException, InterruptedException {
	    business.clickonproducttotradedropdown();
	}
	@And("customer select a option from origin of coal dropdown")
	public void customer_select_a_option_from_origin_of_coal_dropdown() {
	    business.clickonoriginofcoaldropdown();
	}
	@And("customer enter customer person name into textfield")
	public void customer_enter_customer_person_name_into_textfield() {
	    business.entercontactnamefield(setRandomFirstName());
	}
	@And("customer enter designation into textfield")
	public void customer_enter_designation_into_textfield() {
	    business.enterdesignationfield("manager");
	}
	@And("customer enter Business email into textfield")
	public void customer_enter_business_email_into_textfield() {
	    business.enteremailIdfield(setRandomEmail());
	}
	@And("customer enter mobile number into textfield")
	public void customer_enter_mobile_number_into_textfield() {
	    business.entermobilenumberfield(setRandomMobileNumber());
	}
	@When("customer click on Proceed button")
	public void customer_click_on_proceed_button() {
	    System.out.println("clicked");
	}
	
	// review page 
	
	@And("customer verify the review page")
	public void customer_verify_the_review_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user click on add sub business unit button")
	public void user_click_on_add_sub_business_unit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@And("verify the GST number")
	public void verify_the_gst_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("customer enter sub unit address into textfield")
	public void customer_enter_sub_unit_address_into_textfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer click on save button")
	public void customer_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// kyc page
	
	@When("the user uploads an authorization letter and submits the form")
	public void the_user_uploads_an_authorization_letter_and_submits_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the authorization letter success confirmation message should be displayed")
	public void the_authorization_letter_success_confirmation_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user uploads an PAN card and submits the form")
	public void the_user_uploads_an_pan_card_and_submits_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the PAN card success confirmation message should be displayed")
	public void the_pan_card_success_confirmation_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user uploads an GST certificate and submits the form")
	public void the_user_uploads_an_gst_certificate_and_submits_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the GST certificate success confirmation message should be displayed")
	public void the_gst_certificate_success_confirmation_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user submits the form with valid bank details and a cancelled cheque")
	public void the_user_submits_the_form_with_valid_bank_details_and_a_cancelled_cheque() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the form should be submitted successfully")
	public void the_form_should_be_submitted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user submits the form with valid Udyam certificate details and Upload Udyam Certificate file")
	public void the_user_submits_the_form_with_valid_udyam_certificate_details_and_upload_udyam_certificate_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user submits the form with valid IEC certificate details and Upload IEC certificate file")
	public void the_user_submits_the_form_with_valid_iec_certificate_details_and_upload_iec_certificate_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user submits the form with valid D&B numberer details and Upload D&B number file")
	public void the_user_submits_the_form_with_valid_d_b_numberer_details_and_upload_d_b_number_file() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("the user redirected to review & submit page")
	public void the_user_redirected_to_review_submit_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("customer select the confirm info correctness and accept terms checkbox")
	public void customer_select_the_confirm_info_correctness_and_accept_terms_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("customer click on save & proceed button")
	public void customer_click_on_save_proceed_button() {
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


