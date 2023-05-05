package marathon;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Redbus
{
	public static void main(String[] args) throws InterruptedException
	{
		//Disable notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(option);
		
		//Load the URL
		driver.get("https://www.redbus.in/");
		//Maximize the Window
		driver.manage().window().maximize();
		//Creating an implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Enter Chennai in the From text box
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(500);
		//Select the first option from the drop down 
		driver.findElement(By.xpath("//li[@select-id='results[0].BpList[0]']")).click();
		//Enter Bangalore in the To text box
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		//Select the first option from the drop down
		driver.findElement(By.xpath("//li[@select-id='results[0].BpList[0]']")).click();
		//Select tomorrow's date in Date feild
		driver.findElement(By.xpath("(//td[@class='we day'])[1]")).click();
		//Click Search
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(500);
		
		//Verification: Number of busses found
		System.out.println(driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		
		//Choose Sleeper
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		
		//Print the name of the second result
		System.out.println(driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText());
		
		//Print the title of the page
		System.out.println(driver.getTitle());
	}
}