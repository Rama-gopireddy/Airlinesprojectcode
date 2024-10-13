package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Multy_city_flight_search {

	WebDriver driver;

	@FindBy(xpath = "(//div[@class='_6c913dd6 b906621e ffcc3b8b'])[2]")
	WebElement recentsearch;

	@FindBy(xpath = "(//button[@class='   _4bdcf672  _1f9721ed b906621e _4ab33e67'])[1]")
	WebElement nonstop;

	@FindBy(xpath = "(//button[@class='   _4bdcf672  _1f9721ed b906621e _4ab33e67'])[2]")
	WebElement onestop;

	/*
	 * @FindBy(xpath =
	 * "(//button[@class='   _4bdcf672  _1f9721ed b906621e _4ab33e67'])[3]")
	 * WebElement twostop;
	 */

	public void multiecity() throws InterruptedException {

		recentsearch.click();

		Thread.sleep(5000);

		nonstop.click();
		Thread.sleep(2000);

		onestop.click();

		/*
		 * Thread.sleep(2000);
		 * 
		 * twostop.click();
		 */

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Assert.assertTrue(search.isDisplayed(), "sorry,it is not displayed");

	}

	public Multy_city_flight_search(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
