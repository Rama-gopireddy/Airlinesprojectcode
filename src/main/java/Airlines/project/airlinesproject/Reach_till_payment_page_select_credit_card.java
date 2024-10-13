package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reach_till_payment_page_select_credit_card {
	
WebDriver driver;
	
	@FindBy(xpath = "(//i[@class='_4b539ab8'])[1]")
	WebElement onewaybutton;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	
	
	@FindBy(xpath = "(//span[@class='db14b3bc'])[29]")
	WebElement selectdate;

	@FindBy(xpath = "(//button[@class='_7e149b6e  edfe9d73'])[1]")
	WebElement travelers;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;
	
	@FindBy(xpath = "(//button[.='Book'])[1]")
	WebElement booking;
	
	
	@FindBy(xpath = "//button[.='Proceed to traveller details']")
	WebElement traversdetails;
	
	@FindBy(xpath = "(//span[@class='e5140519 _221e1ca9'])[1]")
	WebElement addnewaudult;
	
	@FindBy(xpath = "(//i[@class='cb79ac4d _86eef271'])[1]")
	WebElement selectgender;
	
	@FindBy(xpath = "(//li[.='Female'])[1]")
	WebElement female;
	
	@FindBy(id = "input-first_name")
	WebElement firstname;
	
	@FindBy(id = "input-last_name")
	WebElement lastname;
	
	
	@FindBy(xpath = "//button[.='Add adult']")
	WebElement addaudult;
	
	@FindBy(xpath = "//button[.='Proceed to seat selection']")
	WebElement seaselection;
	
	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[1]")
	WebElement selectedseat;
	
	
	@FindBy(xpath = "//button[.='Next']")
	WebElement next;
	
	@FindBy(xpath = "//i[@class='d726bd8f _4d2636f0']")
	WebElement checkbox;
	
	
	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2']")
	WebElement procedtopayment;
	
	/*@FindBy(name = "ppw-instrumentRowSelection")
	WebElement creditcardradiobutton;*/
	
	@FindBy(xpath = "(//div[@class='a-radio'])[2]") // radiobutton
	WebElement creditcard;
	
	
	/*@FindBy(name = "ApxSecureIframe")
	WebElement iframe;//*/
	
	@FindBy(name = "addCreditCardNumber")
	WebElement addcreditcardnum;
	
	@FindBy(name = "ppw-expirationDate_month")
	WebElement expiremonth;

	@FindBy(name = "ppw-expirationDate_year")
	WebElement expireyear;

	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement entercarddetails;
	
	@FindBy(name = "addCreditCardVerificationNumber0")
	WebElement entercvv;
	
	
	
	
	/*@FindBy(xpath = "(//span[@class='a-dropdown-prompt'])[1]")
	WebElement dropdownmonth;
	
	@FindBy(xpath = "(//span[@class='a-dropdown-prompt'])[2]")
	WebElement dropdownyear;
	
	@FindBy(name = "ApxSecureIframe")
	WebElement iframe;
	
	
	@FindBy(id = "pp-mBQrcG-124-announce")
	WebElement entercreditcarddetails;
	
	
	/*@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement entercarddetails;

	@FindBy(name = "apx-secure-field-addCreditCardVerificationNumber")
	WebElement iframe2;

	@FindBy(id = "field")
	WebElement cvv;
	
		@FindBy(name = "ApxSecureIframe")
	WebElement iframe;*/

	/* @FindBy(id="pp-sbhLhO-104")
	@FindBy(xpath = "//input[@class='a-input-text a-form-normal pmts-account-Number']")
	WebElement creditcardnum;

	@FindBy(name = "ppw-accountHolderName")
	WebElement nickname;
	@FindBy(name = "ppw-expirationDate_month")
	WebElement expiremonth;

	@FindBy(name = "ppw-expirationDate_year")
	WebElement expireyear;

	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement entercarddetails;

	@FindBy(name = "apx-secure-field-addCreditCardVerificationNumber")
	WebElement iframe2;

	@FindBy(id = "field")
	WebElement cvv;*/
	
	
	
	
	
	
	
	
	

	public void onewayfrom() {
		
		onewaybutton.click();

		selectairportfrom.click();


		selectcity.click();
	}

	public void onewayto() throws InterruptedException {

		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		
		selectdetinationcity.click();
        selectdate.click();
		travelers.click();
		search.click();
	}
		public void book() throws InterruptedException
		{
		booking.click();
		
		Thread.sleep(2000);

		traversdetails.click();
		
		addnewaudult.click();
		
		Thread.sleep(2000);
		selectgender.click();
		
		Thread.sleep(2000);
		female.click();
		
		firstname.sendKeys("Rama");
		lastname.sendKeys("gopireddy");
		
		addaudult.click();
		
		Thread.sleep(2000);
		
		seaselection.click();
		
		Thread.sleep(2000);
		selectedseat.click();
		
		next.click();
		
		
		
	}
		
		public void payment() throws InterruptedException
		{
			checkbox.click();
			
			procedtopayment.click();
			
			creditcard.click();
			
			//driver.switchTo().frame(iframe);
			addcreditcardnum.sendKeys("4266841695059863");
			
			Select s1 = new Select(expiremonth);

			s1.selectByIndex(2);

			Select s2 = new Select(expireyear);

			s2.selectByIndex(2);

			entercarddetails.click();
			
			entercvv.sendKeys("767");

		/*	WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			w3.until(ExpectedConditions.visibilityOf(creditcardnum));

			///creditcardnum.sendKeys("");
			nickname.clear();
			nickname.sendKeys("ramya");

			Thread.sleep(4000);
		*/
		
	}

	public Reach_till_payment_page_select_credit_card(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
