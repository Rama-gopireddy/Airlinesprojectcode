package Airlines.project.airlinesproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Airline_homepage {
	
	
    WebDriver driver;
	
	@FindBy(id="createAccountSubmit")
	WebElement createaccount;
	
	/*@FindBy(partialLinkText="Start here.")
	WebElement starthere;*/
	
	public void createaccount(WebDriver driver)
	{
		
	createaccount.click();
	
	}
	
	
	
	public Amazon_Airline_homepage(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}

}
