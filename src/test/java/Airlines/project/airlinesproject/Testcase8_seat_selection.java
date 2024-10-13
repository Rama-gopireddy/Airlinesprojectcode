package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase8_seat_selection extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void oneway_search() throws EncryptedDocumentException, IOException, InterruptedException {

		

		
		Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
		lg.valid();
		lg.login();
		
		Check_seat_selection ss=new Check_seat_selection(driver);
		
		ss.onewayfrom();
		ss.onewayto();
		
		ss.book();
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");

	}

	
	

}
