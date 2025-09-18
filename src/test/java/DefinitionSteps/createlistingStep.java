package DefinitionSteps;

import BasicFlow.BasicClass;
import io.cucumber.java.en.*;
import pageobject.createlistingpage;

public class createlistingStep extends BasicClass {

	@And("the user navigates to the Create Coal Product Listing page")
	public void the_user_navigates_to_the_create_coal_product_listing_page() {
		createlisting = new createlistingpage(driver);
		System.out.println("check driver :- "+driver);
		createlisting.clickonlistingfromnavbar();
		
	}
	
	@When("the user selects a valid Business Profile")
	public void the_user_selects_a_valid_business_profile() throws InterruptedException {
	    createlisting.clickoncreatelistingbutton();
	    createlisting.labelcount();
	    createlisting.selectDropdownOption("Business Profile", "mahindra123"); 
//	    createlisting.fetchallthelabelnameforallfields();
	    
	    
//	    createlisting.clickondropdown();
	    createlisting.fetchoptionname();
	    
	    
	}
	
	@And("the user selects a valid Coal Type")
	public void the_user_selects_a_valid_coal_type() throws InterruptedException {
	    createlisting.selectDropdownOption("Coal Type", "PET Coke");
	}
	@And("the user selects Origin of Coal")
	public void the_user_selects_origin_of_coal() throws InterruptedException {
		 createlisting.selectDropdownOption("Origin of Coal", "Domestic"); 
	}
	
	@And("the user selects CIL Subsidiary")
	public void the_user_selects_cil_subsidiary() throws InterruptedException {
		createlisting.selectDropdownOption("CIL Subsidiary", "Bharat");
	}
	@And("the user selects Source of Coal")
	public void the_user_selects_source_of_coal() throws InterruptedException {
		 createlisting.selectDropdownOption("Source of Coal", "Private Mines");  // Washeries
	}
	@And("the user selects Grade of coal except washeries")
	public void the_user_selects_grade_of_coal_except_washeries() throws InterruptedException {
		 createlisting.selectDropdownOption("Grade", "G11");
	}
	
	@And("the user selects a valid Mine")
	public void the_user_selects_a_valid_mine() throws InterruptedException {
	    createlisting.selectDropdownOption("Mine", "Mine A - BCCL");
	}
	@When("the user enters data in the Fixed Carbon Percentage field")
	public void the_user_enters_data_in_the_fixed_carbon_percentage_field() throws InterruptedException {
	   //createlisting.enterdataintoinputfield("Fixed Carbon Percentage", "25");
		createlisting.enterfixedcarboninputfield("25");
	}
	@And("selects Max from the Fixed Carbon MINMAX dropdown")
	public void selects_max_from_the_fixed_carbon_min_max_dropdown() throws InterruptedException {
		createlisting.selectDropdownOption("Fixed Carbon MIN/MAX", "MAX");
	}
	@And("enters data in the Ash Content Percentage field")
	public void enters_data_in_the_ash_content_percentage_field() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Ash Content Percentage", "25");
		createlisting.enterfixedashcontentinputfield("25");
	}
	@And("selects Max from the Ash Content MINMAX dropdown")
	public void selects_max_from_the_ash_content_min_max_dropdown() throws InterruptedException {
		createlisting.selectDropdownOption("Ash Content MIN/MAX", "MAX");
	}
	@And("enters data in the Volatile Matter Percentage field")
	public void enters_data_in_the_volatile_matter_percentage_field() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Volatile Matter Percentage", "25");
		createlisting.entervolatilematterpercentage("25");
	}

	@And("selects Max from the Volatile Matter MINMAX dropdown")
	public void selects_max_from_the_volatile_matter_min_max_dropdown() throws InterruptedException {
		createlisting.selectDropdownOption("Volatile Matter MIN/MAX", "MAX");
	}
	@And("enters data in the Total Moisture Percentage field")
	public void enters_data_in_the_total_moisture_percentage_field() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Total Moisture Percentage", "25");
	}
	@And("selects Max from the Total Moisture MINMAX dropdown")
	public void selects_max_from_the_total_moisture_min_max_dropdown() throws InterruptedException {
		createlisting.selectDropdownOption("Total Moisture MIN/MAX", "MAX");
	}
	@And("the user selects Delivery Mode")
	public void the_user_selects_delivery_mode() throws InterruptedException {
		createlisting.selectDropdownOption("Delivery mode", "Rail");
	}
	@And("the user enters Railway siding code")
	public void the_user_enters_Railway_siding_code() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Railway siding code", "RailCodeTest 123");
	}
	
	@And("the user enters Quantity in MT")
	public void the_user_enters_quantity_in_mt() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Quantity (MT)", "15000");
	}
	@And("the user enters Rate per MT in INR")
	public void the_user_enters_rate_per_mt_in_inr() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Rate per MT (INR)", "1500");
	}
	@And("the user selects Delivery Terms")
	public void the_user_selects_delivery_terms() throws InterruptedException {
	    createlisting.selectDropdownOption("Delivery terms", "FOB");
	}
	@And("the user selects Payment Terms")
	public void the_user_selects_payment_terms() throws InterruptedException {
	   createlisting.selectDropdownOption("Payment terms", "Letter of Credit");
	}
	
	@And("the user enters credit days")
	public void the_user_enters_credit_days() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Credit Days","32");
	}
	
	@And("the user enters EMD%")
	public void the_user_enters_emd() throws InterruptedException {
		//createlisting.enterdataintoinputfield("EMD%", "54");
	}
	@And("the user enters Free Payment Period in days")
	public void the_user_enters_free_payment_period_in_days() throws InterruptedException {
		//createlisting.enterdataintoinputfield("Free Payment Period (Days)", "3");
	}
	@And("the user enters Free Lifting Period in days")
	public void the_user_enters_free_lifting_period_in_days() throws InterruptedException {
		createlisting.selectDropdownOption("Free Lifting Period (Days)", "3");
	}
	@And("the user selects Validity Start Date")
	public void the_user_selects_validity_start_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("the user selects Validity End Date")
	public void the_user_selects_validity_end_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("the user enters a valid Loading Point Address")
	public void the_user_enters_a_valid_loading_point_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("the user enters Other Remarks")
	public void the_user_enters_other_remarks() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("the user uploads required documents")
	public void the_user_uploads_required_documents() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("the user clicks on the Create Listing button")
	public void the_user_clicks_on_the_create_listing_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the system should successfully create the coal product listing and redirected to mylisting page")
	public void the_system_should_successfully_create_the_coal_product_listing_and_redirected_to_mylisting_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@And("a confirmation message should be displayed")
	public void a_confirmation_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
