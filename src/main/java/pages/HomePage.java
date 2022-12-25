package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "ssp-service-zip")
	WebElement zipCodeField;
	
	public void clickZipCodeField() throws InterruptedException {
		zipCodeField.click();
		Thread.sleep(3000);
	}

}
