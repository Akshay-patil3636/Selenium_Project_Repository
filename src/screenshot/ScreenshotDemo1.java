package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo1 {
	
	 
    public void screenshot(WebDriver driver,String name) throws IOException
    {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest =new File("G:\\eclipsePathData\\ScreenshotPath"+name+".jpg");
	FileHandler.copy(source,dest);
    }
    
	public static void main(String[]args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(5000);
	    
	    
	    ScreenshotDemo1 sd=new ScreenshotDemo1() ;
	    sd.screenshot(driver,"FlipcartHomePage");
	    Thread.sleep(5000);

	    WebElement cut=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    cut.click();
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    WebElement search=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	    search.sendKeys("melton bottle steel");


	    
	    
	    
	    	
	  
	   
		
	}

}
