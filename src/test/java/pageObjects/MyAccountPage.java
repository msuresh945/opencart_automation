package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text()='Account Details']") // MyAccount Page heading
	WebElement msgHeading;

	@FindBy(xpath = "(//a[text()='Logout'])[2]") // Logout
	WebElement logout_btn;

	public boolean isLogoutBtnExists() // MyAccount Page heading display status
	{
		try {
			return (logout_btn.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() // MyAccount Page heading display status
	{
		logout_btn.click();
	}

}
