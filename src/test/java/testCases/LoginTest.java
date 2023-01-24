package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {

	@Test(groups= {"Sanity","Master"})
	public void test_Login() {
		logger.info("Starting LoginTest");

		try {
			HomePage hp = new HomePage(driver);

			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);

			lp.setEmail(rb.getString("email")); // valid email, get it from properties file

			lp.setPassword(rb.getString("password")); // valid password, get it from properties file

			lp.clickLogin();

			MyAccountPage macc = new MyAccountPage(driver);
			
			Thread.sleep(10000);
			boolean targetpage = macc.isLogoutBtnExists();

			Assert.assertEquals(targetpage, true);

			macc.clickLogout();

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");

	}

}
