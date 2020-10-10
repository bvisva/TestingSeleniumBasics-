package org.balajijava.TestngSeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

/**
 * Hello world!
 *
 */
public class App 
{
   /* public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
    
    @Test
	public void test1() {
		
		System.out.println( "Hello World!" );
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.msn.com/en-in/");
		driver.manage().window().maximize();
		System.out.println( "URL success" );		
		 Shutterbug.shootPage(driver,Capture.FULL_SCROLL,500,true).withName("HotmailFullPageScreenshot").save("D:\\Images\\");
	       driver.quit();
	       System.out.println( "screen shot success" );
    }
}
