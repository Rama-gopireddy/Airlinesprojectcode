package Airlines.project.airlinesproject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3_invalid_cred extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void registration() throws EncryptedDocumentException, IOException, InterruptedException {

		
		
		Amz_loing_invalid_credentials ig=new Amz_loing_invalid_credentials(driver);
		
		
		ig.invalid();
		ig.invalid_login();
		System.out.println(driver.getTitle());

		//Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		//Assert.assertEquals(driver.getTitle(),contains("Amazon.in"));

	}


}
