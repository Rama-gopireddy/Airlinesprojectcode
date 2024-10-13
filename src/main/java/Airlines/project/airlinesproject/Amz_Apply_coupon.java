package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Apply_coupon {
	

	WebDriver driver;
	
	@FindBy(xpath = "(//i[@class='_4b539ab8'])[1]")
	WebElement onewaybutton;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	
	@FindBy(xpath = "(//span[@class='db14b3bc'])[26]")
	WebElement selectdate;

	@FindBy(xpath = "(//button[@class='_7e149b6e  '])[1]")
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
	
	
	
	
	
	
	

	public void onewayfrom() {
		
		onewaybutton.click();

		selectairportfrom.click();


		selectcity.click();
	}

	public void onewayto() throws InterruptedException {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		
		Assert.assertEquals(seaselection.isEnabled() ,true, "sorry it is not enabled");
		
		seaselection.click();
		
		Thread.sleep(2000);
		selectedseat.click();
		
		next.click();
		
		
		
	}

	public Amz_Apply_coupon(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


}
