package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_oneway_trip {

	WebDriver driver;
	
	@FindBy(xpath = "(//i[@class='_4b539ab8'])[1]")
	WebElement onewaybutton;
	
	

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	@FindBy(xpath = "(//span[@class='_90d49e26'])[30]")
	WebElement selectdate;

	@FindBy(xpath = "(//button[@class='_7e149b6e  edfe9d73'])[1]")
	WebElement travelers;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

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

	public Amz_oneway_trip(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
