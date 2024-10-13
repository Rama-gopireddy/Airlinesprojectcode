package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_round_trip {

	WebDriver driver;
	
	
			
			@FindBy(xpath = "(//i[@class='_4b539ab8'])[2]")
			WebElement roundtripradiobutton;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	@FindBy(xpath = "(//span[@class='_90d49e26'])[28]")
	WebElement selectdate;
	
	/*@FindBy(xpath = "//span[@class='dcb9db95 colorTertiary sizeMedium']")
	WebElement addreturn;*/
	@FindBy(xpath = "(//span[@class='db14b3bc'])[45]")
	WebElement returndate;
	
	
	

	@FindBy(xpath = "(//button[.='2'])[2]")
	WebElement travelers;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

	public void roundtrip() {
		
		roundtripradiobutton.click();
		

		
		selectairportfrom.click();


		selectcity.click();
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void roundtripto() throws InterruptedException {

		Thread.sleep(5000);

		
		selectdetinationcity.click();
        selectdate.click();


       /* WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w2.until(ExpectedConditions.elementToBeClickable( returndate));*/
        
        Thread.sleep(2000);
        returndate.click();
       /* WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(10));
     		w3.until(ExpectedConditions.elementToBeClickable( travelers));*/
        
        
        Thread.sleep(5000);
		travelers.click();
		search.click();
		

		Assert.assertTrue(search.isDisplayed(), "sorry,it is not displayed");

	}

	public Amz_round_trip(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


}
