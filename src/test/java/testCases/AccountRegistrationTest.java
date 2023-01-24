package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	@Test(groups= {"Regression","Master"})
	public void testAcctRegistration() {
		
		logger.info("*****Starting Account Registration test******");
		logger.debug("Application logs");
		try {
			HomePage hp = new HomePage(driver);
			
			logger.info("**clicking Resigter link**");
			hp.clickRegister();

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			regpage.setFirstName("abc");
			regpage.setLastName("xyz");
			regpage.setEmail(randomString()+"@gmail.com");
			regpage.setTelephone(randomNumber());
			regpage.setPassword("test@123");
			regpage.setConfirmPassword("test@123");
			regpage.setPrivacyPolicy();
			
			logger.info("Clicking on Continue");
			regpage.clickContinue();

			String confmsg = regpage.getConfirmationMsg();
			
			logger.info("validating successful registration meggase");
			Assert.assertEquals(confmsg, "Your Account Has Been Created");
		} catch (Exception e) {
			Assert.fail();
		}

	}

}
