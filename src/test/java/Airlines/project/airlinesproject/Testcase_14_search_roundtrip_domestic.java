package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase_14_search_roundtrip_domestic extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void registration() throws EncryptedDocumentException, IOException, InterruptedException {

		

		
		Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
		lg.valid();
		lg.login();
		
		Search_domestic_roundtrip  rt=new Search_domestic_roundtrip (driver);
		
		rt.search(driver);
		
		
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");

	}

}
