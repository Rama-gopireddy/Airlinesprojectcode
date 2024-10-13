package Airlines.project.airlinesproject;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Testcase1_New_user extends Launch_Quit {

	@Test//(retryAnalyzer = Airlines.project.airlinesproject.Iretry_logic.class)
	public void registration() {

		Amazon_Airline_homepage hp = new Amazon_Airline_homepage(driver);
		hp.createaccount(driver);

		Amz_new_user_register rg = new Amz_new_user_register(driver);
		rg.register();

		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Authentication required");

	}

}
