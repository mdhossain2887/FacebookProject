package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class ProfilePage {
	@FindBy(xpath="//*[@id=\"navItem_100010390688981\"]/a/div") WebElement profilename;
	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyName() {
		Shared.verify(profilename);
	}
}
