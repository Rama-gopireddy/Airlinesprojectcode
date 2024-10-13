package Airlines.project.airlinesproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Amz_login_valid_credentials extends DDT_Class {
	
	   WebDriver driver;
		
		@FindBy(id="ap_email")
		WebElement un;
		
		
		@FindBy(id="continue")
		WebElement continuebutton;
		
		@FindBy(id="ap_password" )
		WebElement pass;
		
		@FindBy(id="signInSubmit" )
		WebElement signinbutton;
		
		
		
		
		public void login() throws InterruptedException
		{
			
		
		un.sendKeys(username);
		continuebutton.click();
		
		Thread.sleep(5000);
			                                                                             
		pass.sendKeys(password);
		signinbutton.click();
			
			
		}
		
		
		
		public Amz_login_valid_credentials(WebDriver driver)
		{
			
		PageFactory.initElements(driver, this);
		
		}
}
