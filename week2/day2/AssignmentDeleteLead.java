package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentDeleteLead
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
		
		//Click on the Phone icon and enter the phone number
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9600051969");
		
		//Click the find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		
		//Verification: Capture lead ID of the first resulting lead
		String leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(leadID);
		
		//Selecting the first result
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Delete the lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click on Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter the captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		//Click on find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(500);
		
		//Verification: Need to verify whether the 
		String nrf = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(nrf);
		Thread.sleep(10000);
		
		//Close the browser
		//driver.close();
	}
}