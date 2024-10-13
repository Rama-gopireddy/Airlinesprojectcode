package Airlines.project.airlinesproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validate_search_different_classes {

	WebDriver driver;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[2]")
	WebElement roundtripradiobutton;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	@FindBy(xpath = "(//span[@class='_90d49e26'])[20]")
	WebElement selectdate;

	@FindBy(xpath = "(//span[@class='db14b3bc'])[50]")
	WebElement returndate;

	@FindBy(xpath = "(//button[.='2'])[1]")
	WebElement travelers;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[1]")
	WebElement Economy;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")

	WebElement search1;

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")

	WebElement selectpreecon;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[2]")
	WebElement PrememiumEconomy;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")

	WebElement search2;

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")

	WebElement selectbusiness;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[3]")
	WebElement Business;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")

	WebElement search3;

	public void roundtrip() {

		roundtripradiobutton.click();

		selectairportfrom.click();

		selectcity.click();

	}

	public void roundtripto() throws InterruptedException {

		Thread.sleep(5000);

		selectdetinationcity.click();
		selectdate.click();

		returndate.click();

		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w2.until(ExpectedConditions.elementToBeClickable(travelers));

		travelers.click();

		Thread.sleep(5000);

		Economy.click();

		Thread.sleep(2000);

		search1.click();

		Thread.sleep(5000);

		selectpreecon.click();

		Thread.sleep(5000);

		PrememiumEconomy.click();

		WebDriverWait w6 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w6.until(ExpectedConditions.elementToBeClickable(search2));

		search2.click();

		WebDriverWait w7 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w7.until(ExpectedConditions.elementToBeClickable(selectbusiness));

		selectbusiness.click();

		WebDriverWait w8 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w8.until(ExpectedConditions.elementToBeClickable(Business));

		Business.click();

		WebDriverWait w9 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w9.until(ExpectedConditions.elementToBeClickable(search3));

		search3.click();

	}

	public Validate_search_different_classes(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
