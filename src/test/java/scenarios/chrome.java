package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class chrome
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_value = "E-Reader";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Thread.sleep(3000);
		String name = "Chrome";
		String cpu = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[.='"+name+"']/following-sibling::td[contains(.,'%')]")).getText();
		System.out.println(cpu);
		System.out.println("created");
		driver.quit();
		
		

}
}