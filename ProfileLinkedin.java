//import java.io.File;
//import java.io.IOException;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class ProfileLinkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svetlana\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
					
	driver.get("http://google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("Svetlana Legacheva Linkedin");
	driver.findElement(By.name("btnK")).click(); 
	boolean pass = driver.getPageSource().contains("https://www.linkedin.com/in/svetlana-legacheva");
	
	
	if (pass) {
         System.out.println("Profile found");
     } else if (!pass) {
         System.out.println("Profile not found");

     }
		
	}

}


