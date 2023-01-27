package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo2 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
	    WebElement CAbutton=driver.findElement(By.xpath("[data-testid='open-registration-form-button']"));
	    CAbutton.click();
	}

}
