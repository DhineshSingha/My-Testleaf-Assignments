package week2.day1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentCreateLead
{
	public static void main(String[] args)
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
		//Click on Leads, Create Lead using LinkText locator
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the Company name, First name, Last name, First name (Local) using ID locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singha");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhinesh");
		
		//Enter the Department, Description using Name locator
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.name("description")).sendKeys("I'm currently learning Software Testing and I wish to get into a Software testing job in another month");
		
		//Enter the Email and phone number using ID locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhineshsinghak@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9600051969");
		
		//Click on the Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Verification: Title of the Resulting page
		System.out.println(driver.getTitle());
	}
}