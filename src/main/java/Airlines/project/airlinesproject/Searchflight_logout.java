package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchflight_logout {
	
	WebDriver driver;

	

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;
	
	
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath = "(//span[@class='nav-text'])[22]")
	WebElement signout;
	
	

	

	public void search(WebDriver driver) throws InterruptedException  {

		
		search.click();
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		
		a1.moveToElement(accountandlist).perform();
		
		
			signout.click();


	}
	


	public Searchflight_logout(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}


}
