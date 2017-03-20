import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		//Adding some comments
		driver.findElement(By.id("Email")).sendKeys("hadoopvverma@gmail.com");
		driver.findElement(By.id("next")).click();
		
		

	}

}
