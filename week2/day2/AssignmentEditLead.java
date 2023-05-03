package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentEditLead
{
	public static void main(String[] args) throws InterruptedException
	{
		//Creating object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the Window
		driver.manage().window().maximize();
		//Creating an implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click login
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on Leads, Find Lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter the First name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Dhinesh");
		//Click on the Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Verification: Title of the page
		System.out.println(driver.getTitle());
		
		//Click on Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Edit the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Amazon");
		//Click on Submit
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Verification: Confirm the changed company name appears
		String compname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(compname);
		Thread.sleep(10000);
		
		//Close the browser
		driver.close();
	}
}