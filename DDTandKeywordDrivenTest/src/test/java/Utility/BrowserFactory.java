package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	WebDriver driver;

	@Test
	public static WebDriver BrowserOptions(WebDriver driver, String browserName, String AppUrl) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\CucumberTestClass\\DDTandKeywordDrivenTest\\BrowserDrivers\\ChromeDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\CucumberTestClass\\DDTandKeywordDrivenTest\\BrowserDrivers\\FirefoxDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\CucumberTestClass\\DDTandKeywordDrivenTest\\BrowserDrivers\\IEDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser Does Not Support...");
		}

		driver.manage().window().maximize();
		driver.get(AppUrl);

		return driver;
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
