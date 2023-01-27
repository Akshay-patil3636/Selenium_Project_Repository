package basicBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().forward();
		Thread.sleep(5000);
		driver.close();
		

		
		
	}

}
