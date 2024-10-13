package Airlines.project.airlinesproject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Airlines.project.airlinesproject.Listners_Class.class)


public class Launch_Quit extends Listners_Class{
	

	@BeforeMethod
	//@Parameters("browser")
	public void launch() {
		
		/*if(nameofbrowser.equals("chrome"))
		{
			 driver =new ChromeDriver();
		}
		
		if(nameofbrowser.equals("edge"))
		{
			 driver =new EdgeDriver();
		}	
		//ITestListner.driver=driver;*/
		
	driver=new ChromeDriver ();
	driver.get("https://www.amazon.in/flights");
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterMethod
	public void quit() throws InterruptedException
	{
		
		Thread.sleep(2000);		
		//driver.quit();
	

}

}
