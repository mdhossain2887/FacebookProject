package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	@FindBy(xpath="//*[@id=\"u_0_2\"]") WebElement login;
	@FindBy(xpath="//*[@id=\"pass\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"email\"]") WebElement username;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void typeUserName(String text) {
		Shared.type(username);
	}
	public void typePassword(String text) {
		Shared.type(password);
		
	}
	public ProfilePage click() {
		Shared.click(login);
		return new ProfilePage(driver);
	}

}
