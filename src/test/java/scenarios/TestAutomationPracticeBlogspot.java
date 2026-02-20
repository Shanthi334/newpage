package scenarios;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TestAutomationPracticeBlogspot
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_value = "E-Reader";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//h2[text()='Form']"))).perform();
		for(int j=2; ; j++)
		{
			try {
				for(int i=1; ;i++)
				{
			
					WebElement element = driver.findElement(By.xpath("(//h2[text()='Pagination Web Table']/..//div/div//tr/td[2])["+i+"]"));
					String actual = element.getText();
					System.out.println(actual);
					if(expected_value.equals(actual))
					{
						driver.findElement(By.xpath("//td[text()='Portable Charger']/following-sibling::td/input[@type='checkbox']")).click();
						return; 
					}
				}
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='"+j+"']")).click();
				System.out.println("created");
			
			}
		}
		
		}
	
	
	}
