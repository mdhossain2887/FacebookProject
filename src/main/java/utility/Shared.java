package utility;

import org.openqa.selenium.WebElement;

public class Shared {

	public static void type(WebElement ele) {
		ele.sendKeys();
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void verify(WebElement ele) {
		if(ele.getText().equals("Latenight breeze")) {
			System.out.println("correct profile page");
		}
		else {
			System.out.println("wrong profile page");
		}
	}
}
