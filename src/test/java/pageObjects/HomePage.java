package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(@class,'navbar-right')]//a[contains(text(),'Register')]")
	WebElement register_btn;

	@FindBy(xpath = "//div[contains(@class,'navbar-right')]//a[contains(text(),'Login')]")
	WebElement login_btn;

	public void clickRegister() {
		register_btn.click();
	}

	public void clickLogin() {
		login_btn.click();
	}

}
