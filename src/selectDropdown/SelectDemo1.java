package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDemo1 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://dribbble.com/tags/gender_select");
	    WebElement	Dropdown=driver.findElement(By.xpath("//a[@data-dropdown-state='closed']"));
	    Dropdown.click();
	    Thread.sleep(5000);
	    System.out.println("clicked by box");
	    Thread.sleep(5000);

	    WebElement	latest=driver.findElement(By.xpath("//a[text()='Latest']"));
	    latest.click();
	    System.out.println("clicked on latest option ");
	    driver.close();
	    

	    
	}

}
