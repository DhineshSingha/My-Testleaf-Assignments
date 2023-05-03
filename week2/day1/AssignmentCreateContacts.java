package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentCreateContacts
{
	public static void main(String[] args) throws InterruptedException
	{
		//Creating object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the Window
		driver.manage().window().maximize();
		//Creating an implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter username and password using ID locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login using Class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA using PartialLinkText locator
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on Contacts, Create Contact using LinkText locator
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter First name and Last name using ID locator
		driver.findElement(By.id("firstNameField")).sendKeys("Dhinesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Singha");
		
		//Click on the Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Verification: First name and Title of the Resulting page
		String firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(firstname);
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
		
		//Close the browser
		driver.close();
	}
}