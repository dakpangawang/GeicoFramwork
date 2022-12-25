package testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest  extends BaseClass{
	
	@Test (enabled = true, priority = 1)
	public void clickZipCodeFieldTest() throws InterruptedException {
		homePage.clickZipCodeField();
	}
	
	@Test (enabled = true, priority = 2)
	public void inputZipCodeField() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='zip-code-input' and @name='POL_ratedZip5'and @id='ssp-service-zip' ]")).sendKeys("94061");
		Thread.sleep(3000);
	}
	
	@Test (enabled = true, priority = 3)
	public void clickGoButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='zip-code-input' and @name='POL_ratedZip5'and @id='ssp-service-zip' ]")).sendKeys("94061");
		driver.findElement(By.cssSelector("input.btn.btn--secondary")).click();
		Thread.sleep(3000);
	}
	

}
