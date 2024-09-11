package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RenaiRepo {
	WebDriver driver;
	public  RenaiRepo(WebDriver driver) {
		this.driver=driver;
	}

	By clickRequestBookAppointment=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/a[2]");
	By scrollToSubmit=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[12]/p/input");
	By clickDepartment=By.xpath("//select[@id='app-dept']");
	By selectDoctor=By.xpath("//select[@id='app-doctor']");
	By enterPatientsname=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[3]/p/span/input");
	By enterDate=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[4]/p/span/input");
	By actualMonth=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[4]/p/span/input");
	By nextMonthArrow=By.xpath("//*[@id=\"wpcf7-f1128-o2\"]/form/div[2]/div[4]/p/span/input");
	By telephoneNumber=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[5]/p/span/input");
	By emailAddress= By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[6]/p/span/input");
	By state=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[7]/p/span/input");
	By city=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[7]/p/span/input");
	By Address=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[9]/p/span/textarea");
	By comment=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[10]/p/span/textarea");
	By captcha=By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
	By submit=By.xpath("//*[@id=\"wpcf7-f1128-o1\"]/form/div[2]/div[12]/p/input");
	By confirmationMessage=By.xpath("//div[contains(text(),'Thank you for your message. It has been sent.')]");
	
	public void requestAppoinment() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(clickRequestBookAppointment).click();
	}
	
	public void scrollDown() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(scrollToSubmit)).perform();
		Thread.sleep(3000);
		
	}
	
	public void enterDepartment() {
		//driver.findElement(clickDepartment).click();
		Select department=new Select(driver.findElement(clickDepartment));
		department.selectByVisibleText("Dental Sciences");
	}
	 public void selectDoctors() throws InterruptedException {
		 Thread.sleep(3000);
		 Select doctor=new Select(driver.findElement(selectDoctor));
		 doctor.selectByVisibleText("Dr. Lakshmi S. Nair");
	 }
	
	public void enterName(String name) throws InterruptedException {
	     Thread.sleep(3000);
	  WebElement patientName= driver.findElement(enterPatientsname);
	  patientName.click();
	  patientName.sendKeys(name);
	}
	
	public void enterDate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(enterDate).click();
		String expected="September 2024";
		String actual=driver.findElement(actualMonth).getText();
		if(actual.equals(expected)) {
		}
		else {
			driver.findElement(nextMonthArrow).click();
			Thread.sleep(3000);
		}
	}
	    
	   public void enterPhoneNumber(String phonenumbers) {
		   driver.findElement(telephoneNumber).sendKeys(phonenumbers);
	   }
			
		public void enterEmailAddress(String email) {
			driver.findElement(emailAddress).sendKeys(email);
			
		}
		
		public void enterState(String states) {
			driver.findElement(state).sendKeys(states);
		}
		
		public void enterCity(String cities) {
			driver.findElement(city).sendKeys(cities);
		}
		public void enterAddress(String addresses) {
			driver.findElement(Address).sendKeys(addresses);
		}
		public void enterCaptcha() {
			driver.findElement(captcha).click();
		}
		public void clickSubmit() {
			driver.findElement(submit).click();
		}
		public void validateConfirmationMessage() {
			Assert.assertTrue(driver.findElement(confirmationMessage).isDisplayed(), 
					"Confirmation message not displayed after submission");
		}
	
}


