package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validate_flightdetails_cancellationrules {
	
	WebDriver driver;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	@FindBy(xpath = "(//span[@class='_90d49e26'])[25]")
	WebElement selectdate;

	@FindBy(xpath = "(//button[@class='_7e149b6e  edfe9d73'])[2]")
	WebElement travelers;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

	@FindBy(xpath = "(//button[.='Book'])[1]")
	WebElement booking;
	

	/*@FindBy(xpath = "(//span[@class='e5140519 _221e1ca9'])[1]")
	WebElement visadetails;*/
	

	@FindBy(xpath = "(//span[@class='e5140519 _221e1ca9'])[2]")
	WebElement viewbaggageandcancell;
	

	@FindBy(xpath = "//div[@class='_7c598c35 a69d62e8']")
	WebElement viewfaredetails;
	
	//div[@class='_7c598c35 a69d62e8']
	
	
	


	

	public void onewayfrom() {

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

	public void book() throws InterruptedException {
		booking.click();
		
		//visadetails.click();
		
		Thread.sleep(5000);

		viewbaggageandcancell.click();
		
		Thread.sleep(5000);
		
		viewfaredetails.click();
		

	}

	public Validate_flightdetails_cancellationrules(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
