package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseTest {
	WebDriver driver;
	public void openBrowser(String br) {
		WebDriverManager.chromedriver().setup();
		if(br.equals("chrome")) {
			driver=new FirefoxDriver();
		}
		else if(br.equals("firefox")){
			driver=new ChromeDriver();
		}
		else if(br.equals("safari")) {
			driver=new SafariDriver();
		}
	}
	public HomePage goToUrl() {
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new HomePage(driver);
	}

}
