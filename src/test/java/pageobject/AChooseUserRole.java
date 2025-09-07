package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AChooseUserRole {
	WebDriver driver;
	public AChooseUserRole(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='/assets/logo-C2RyoRNZ.svg']/../../../following-sibling::div//input")List<WebElement> loginPassword;
	@FindBy(xpath="//img[@src='/assets/logo-C2RyoRNZ.svg']/../../../following-sibling::div//input[@type='text']") WebElement emailfied;
	@FindBy(xpath="//img[@src='/assets/logo-C2RyoRNZ.svg']/../../../following-sibling::div//input[@type='password']") WebElement pwdField;
	
	@FindBy(xpath ="(//h2[text()='Choose User Role'])[1]/../following-sibling::div[1]/div/div[2]/div/span") List<WebElement> roles;
	
	public void ChooseRole(String Role)
	{
	for(WebElement role:roles)
	 {
	  String text=role.getText();
	                      //System.out.println(text);  //Check By print if your getting element text or not
	   if(Role.equalsIgnoreCase(text))
	    {
		role.click();
	    }
	 }
    }
	
	@FindBy(xpath="(//button[@type='button'])[1]") WebElement continueButton;
	@FindBy(xpath="(//a[@href='/login'])[1]") WebElement backToLoginLink;
	
	public void ClickOnButton(String button)
	{
		if(button.equalsIgnoreCase("Continue"))
		{
			continueButton.click();
		}
		else if(button.equalsIgnoreCase("Login"))
		{
			backToLoginLink.click();
		}
	}	
	
	
	
	
//Create an Account Page Consumer	
	@FindBy(xpath="(//input[@type='text'])[1]") WebElement fullName;
	@FindBy(xpath="(//input[@type='text'])[2]") WebElement mobNumber;
	@FindBy(xpath="(//input[@type='email'])[1]") WebElement emailId;
	@FindBy(xpath="(//button[@type='submit'])[1]/span") WebElement sendOtpButton;
	@FindBy(xpath="(//a[@href='/role-selection'])[1]") WebElement returnSignUpLink;
	
//Otp Page
	@FindBy(xpath="(//label[text()='WhatsApp OTP '])[1]") WebElement whatsAppOtp;
	@FindBy(xpath="(//button[text()='Send code again '])[1]") WebElement resendOTPWhatsApp;
    @FindBy(xpath="(//input[@type='text']/..)[1]/input")List<WebElement> whatsAppOtpFields;
    @FindBy(xpath="(//button[text()='Send code again '])[2]") WebElement resendOTPEmail;
    @FindBy(xpath="(//input[@type='text']/..)[2]/input")List<WebElement> gmailAppOtpFields;
    @FindBy(xpath="(//button[@type='submit'])[1]")WebElement verifyAccountButton;
    
    
//Password
    @FindBy(xpath="(//input[@type='password']/..)[1]")WebElement password;
    @FindBy(xpath="(//input[@type='password']/..)[2]")WebElement confirmPwd;
    @FindBy(xpath="(//button[@type='submit'])[1]")WebElement createAccountButton;
//Resume your Application
    
  @FindBy(xpath="//h3[text()='Account Created']")WebElement finalPageText;
  @FindBy(xpath="(//button[@type='button'])[1]")WebElement btnlogout;
  @FindBy(xpath="(//button[@type='button'])[2]")WebElement btnCreateBusinessProfile;

  //Business info  
    @FindBy(xpath="//input[@type='file']//following-sibling::div")WebElement uploadProfile; 
    @FindBy(xpath="//input[@type='text']")List<WebElement> infoPageTextFields;
    //1=rememberus, 2=GstNumber, default On Gst Number(3=BusinessName 4=register adress,6=pincode) 4=city 5=state 
    //7=contactPersonName, 8=Designation 9=ContactMobileNumber
    
    @FindBy(xpath="//input[@type='search']") List<WebElement> infoDropDowns;
    //1=OwnerShip, 2=Industry, 3=ProductsToTrade(MultiSelect), 4=OriginOfCoal, 5=CountryCode 
    
    @FindBy(xpath="(//button[@type='submit'])[1]")WebElement saveAndProceed;
    @FindBy(xpath="(//button[@type='button'])[2]")WebElement btnverifyGst;
    @FindBy(xpath="(//button[@type='button'])[3]")WebElement btnback;
    @FindBy(xpath="//input[@type='email']")       WebElement businessEmail;
   
    //Kyc Page
    @FindBy(xpath="//div[@class='w-full']/p[2]")List<WebElement> reviewData;
    //1=BusinessName, 2=GstNumber, 3=Registered Address, 4=City, 5=State, 6=Pincode, 7=Ownership, 8=Industry
    //9=Products to Trade, 10=Origin of Coal, 11=Contact Person, 12=Designation, 13=Email, 14=WhatsApp Number
    
    @FindBy(xpath="//button[@type='button']")List<WebElement> btnKycPage;
   //2=Add-SubBusinessUnit, 3=Edit, 4=Delete, 5=Back, 6=ProceedToKyc
    
    
    @FindBy(xpath="//input[@type='file']/..")List<WebElement> btnUploadOnKyc;
    //1=Authorization, Letter 2=PAN_Card, 3=GST_Certificate, 4=Bank Details
    //5=Udyam Certificate, 6=IEC Certificate, 7=D&B
    @FindBy(xpath="//button[@type='submit']")List<WebElement> btnSubmit;
    
    @FindBy(xpath="//span[text()='Bank Details']/../following-sibling::div[1]/div/div/div[2]")
         List<WebElement> bankFields; //1=BankName, 2=Account No, 3=IFSC Code
    
    @FindBy(xpath="//span[text()='Udyam Certificate']/../following-sibling::div[1]/div/div/div[2]//input")
         List<WebElement> udyamFields; //1=radio_Yes, 2=radio_No, 3=udyam_No, 4=Udyam Date
    
    @FindBy(xpath="//span[text()='IEC Certificate']/..//following-sibling::div[1]//input")
    List<WebElement> iecCertificate;//1=radioYes, 2=radioNo, 3=IEC_No, 4=IEC_Date, 5=Empty;

    @FindBy(xpath="//input[@placeholder='Enter D&B number']")WebElement dbNumber;
    
    //@FindBy(xpath="//input[@type='file']/..")List<WebElement> btnUploadOnKyc;
    //@FindBy(xpath="//input[@type='file']/..")List<WebElement> btnUploadOnKyc;
    //@FindBy(xpath="//input[@type='file']/..")List<WebElement> btnUploadOnKyc;
    
}










    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

