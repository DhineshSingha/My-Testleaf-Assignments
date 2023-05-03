package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignmentFacebook
{
	public static void main(String[] args) throws InterruptedException
	{
		//Creating object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize the Window
		driver.manage().window().maximize();
		//Creating an implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		
		//Enter the first name, second name and mobile number
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dhinesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9600051969");
		Thread.sleep(1000);
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Facebook@8715");
		Thread.sleep(1000);
		
		//Select the Date in Date of birth
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		d.selectByIndex(26);
		Thread.sleep(1000);		
		//Select the Month in Date of birth
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Sep");
		Thread.sleep(1000);		
		//Select the Year in Date of birth
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		y.selectByValue("1997");
		Thread.sleep(1000);		
		
		//Select the gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}
}