package basicBrowser;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeandMinimize {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// minimize the size of browser
		Dimension d=new Dimension(400,600);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		
		// change the position of browser
		
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(5000);
		
		driver.close();
		

		
		
		
	}

}
