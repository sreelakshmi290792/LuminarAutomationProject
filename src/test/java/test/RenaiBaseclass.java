package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class RenaiBaseclass {
	WebDriver driver;

	@BeforeClass
	public void test1() {
	    driver=new ChromeDriver();
		driver.get("https://www.renaimedicity.org/");
		driver.manage().window().maximize();
		
}
}
