package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_domestic_roundtrip {
	
WebDriver driver;

@FindBy(xpath = "(//i[@class='_4b539ab8'])[2]")
WebElement roundtripradiobutton;

@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
WebElement selectairportfrom;

@FindBy(xpath = "//p[.='New Delhi']")
WebElement selectcity;

@FindBy(xpath = "//p[.='Bangkok']")
WebElement selectdetinationcity;

@FindBy(xpath = "(//span[@class='db14b3bc'])[20]")
WebElement selectdate;

/*@FindBy(xpath = "//span[@class='dcb9db95 colorTertiary sizeMedium']")
WebElement addreturn;*/
@FindBy(xpath = "(//span[@class='db14b3bc'])[50]")
WebElement returndate;

	

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;
	
	
	
	
	

	

	public void search(WebDriver driver) throws InterruptedException  {

roundtripradiobutton.click();
		

		
		selectairportfrom.click();


		selectcity.click();
		selectdetinationcity.click();
		
		selectdate.click();
		returndate.click();
		
		search.click();
		

	}
	


	public Search_domestic_roundtrip(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
