package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase5_roundtrip_search  extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void oneway_search() throws EncryptedDocumentException, IOException, InterruptedException {
	
	Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
	lg.valid();
	lg.login();
	Amz_round_trip tr=new Amz_round_trip(driver);
	
	
	tr.roundtrip();
	tr.roundtripto();
	System.out.println(driver.getTitle());

	Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");


	//Assert.assertTrue(book.isDisplayed(), "sorry,it is not displayed");
	
}}
