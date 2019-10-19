import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void m1() throws IOException, InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manoj/Desktop/fileupload.html");
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Manoj\\Desktop\\AutoIT\\Fileupload.exe");
	}
	
}
