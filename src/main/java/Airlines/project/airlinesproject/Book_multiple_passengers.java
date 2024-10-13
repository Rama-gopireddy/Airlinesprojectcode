package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_multiple_passengers {

	WebDriver driver;

	@FindBy(xpath = "(//span[@class='_76efd884 sizeMini colorTertiary'])[1]")
	WebElement selectairportfrom;

	@FindBy(xpath = "//p[.='New Delhi']")
	WebElement selectcity;

	@FindBy(xpath = "//p[.='Bangkok']")
	WebElement selectdetinationcity;

	@FindBy(xpath = "(//span[@class='_90d49e26'])[22]")
	WebElement selectdate;

	@FindBy(xpath = "(//button[@class='_7e149b6e  edfe9d73'])[2]")
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

	/*
	 * @FindBy(xpath = "//button[.='Proceed to seat selection']") WebElement
	 * seaselection;
	 * 
	 * @FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[1]") WebElement
	 * selectedseat;
	 */

	@FindBy(xpath = "(//span[@class='e5140519 _221e1ca9'])[1]")
	WebElement addnewaudult2;

	@FindBy(xpath = "(//i[@class='cb79ac4d _86eef271'])[1]")
	WebElement selectgender2;

	@FindBy(xpath = "(//li[.='Female'])[1]")
	WebElement female1;

	@FindBy(id = "input-first_name")
	WebElement firstname1;

	@FindBy(id = "input-last_name")
	WebElement lastname1;

	@FindBy(xpath = "//button[.='Add adult']")
	WebElement addaudult1;

	@FindBy(xpath = "//button[.='Proceed to seat selection']")
	WebElement seaselection;

	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[1]")
	WebElement selectedseat;

	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[2]")
	WebElement selectedseat1;

	@FindBy(xpath = "//button[.='Next']")
	WebElement next;

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

		/*
		 * Thread.sleep(2000);
		 * 
		 * seaselection.click();
		 * 
		 * Thread.sleep(2000); selectedseat.click();
		 * 
		 * next.click();
		 */

		Thread.sleep(3000);
		addnewaudult2.click();

		Thread.sleep(2000);
		selectgender2.click();

		Thread.sleep(2000);
		female1.click();

		firstname1.sendKeys("Ramya");
		lastname1.sendKeys("yerabothula");

		addaudult1.click();

		Thread.sleep(2000);

		seaselection.click();

		Thread.sleep(2000);
		selectedseat.click();

		Thread.sleep(2000);
		selectedseat1.click();

		next.click();

	}

	public Book_multiple_passengers(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
}
