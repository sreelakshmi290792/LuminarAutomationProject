package test;

import org.testng.annotations.Test;

import page.RenaiRepo;

public class RenaiPom extends RenaiBaseclass{
	@Test
	public void test2() throws InterruptedException {
		RenaiRepo obj= new RenaiRepo(driver);
		obj.requestAppoinment();
		obj.scrollDown();
		obj.enterDepartment();
		obj.selectDoctors();
		obj.enterName("Sreelakshmi");
		obj.enterPhoneNumber("8907597534");
		obj.enterEmailAddress("slsuresh123@gmail.com");
		obj.enterState("Kerala");
		obj.enterCity("Ernakulam");
		obj.enterAddress("Flatno.B6 Lotus Apartments Tripunithura.");
		obj.enterCaptcha();
		obj.clickSubmit();
		obj.validateConfirmationMessage();
	}
}
