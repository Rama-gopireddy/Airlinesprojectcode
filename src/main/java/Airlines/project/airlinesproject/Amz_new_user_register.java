package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_new_user_register {
	
	
	
WebDriver driver;



	
	@FindBy(id="ap_customer_name")
	WebElement un;
	
	
	
	
	@FindBy(id="ap_phone_number" )
	WebElement mobilenum;
	
	@FindBy(id="ap_password" )
	WebElement pass;
	
	
	
	@FindBy(id="continue" )
	WebElement verifynum;
	
	
	
	public void register()
	{
	un.sendKeys("Seetaramya");
	mobilenum.sendKeys("8008654537");
	pass.sendKeys("ritvik143");
	

	verifynum.click();
		
	}
	
	
	public Amz_new_user_register(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}


}
