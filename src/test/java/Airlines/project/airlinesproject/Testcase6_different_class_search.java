package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase6_different_class_search extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void oneway_search() throws EncryptedDocumentException, IOException, InterruptedException {
	
	Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
	lg.valid();
	lg.login();
	Validate_search_different_classes vs=new Validate_search_different_classes(driver);
	
	
	vs.roundtrip();
	vs.roundtripto();
	System.out.println(driver.getTitle());

	Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");


	//Assert.assertTrue(book.isDisplayed(), "sorry,it is not displayed");
	

}}
