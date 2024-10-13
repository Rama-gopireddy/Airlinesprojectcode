package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase15_payment_page_creditcard extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void oneway_search() throws EncryptedDocumentException, IOException, InterruptedException {

		

		
		Amz_login_valid_credentials lg =new Amz_login_valid_credentials(driver);
		lg.valid();
		lg.login();
		
		Reach_till_payment_page_select_credit_card ss=new Reach_till_payment_page_select_credit_card(driver);
		
		ss.onewayfrom();
		ss.onewayto();
		
		ss.book();
		
		ss.payment();
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Flight Bookings on Amazon");

	}

}
