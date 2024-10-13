package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase9_book_multiple_passengers extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void oneway_search() throws EncryptedDocumentException, IOException, InterruptedException {

		

		
		Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
		lg.valid();
		lg.login();
		
		Book_multiple_passengers ss=new Book_multiple_passengers(driver);
		
		ss.onewayfrom();
		ss.onewayto();
		
		ss.book();
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");

	}


}
