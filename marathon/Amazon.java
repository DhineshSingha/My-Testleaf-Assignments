package marathon;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Amazon
{
	public static void main(String[] args) throws InterruptedException
	{
		//Disable notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(option);
				
		//Load the URL
		driver.get("https://www.amazon.in/");
		//Maximize the Window
		driver.manage().window().maximize();
		//Creating an implicitly wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter Bags in the search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		
		//Select the result (Bags for boys)
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		Thread.sleep(500);
		
		//Verification: Print the number of results
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
		Thread.sleep(2000);
		
		//Select the first 2 brands
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span)[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/li/span/a/div)[2]")).click();
		Thread.sleep(500);
		
		//Sort according to New Arrivals
		WebElement Sort = driver.findElement(By.id("s-result-sort-select"));
		Select so = new Select(Sort);
		so.selectByVisibleText("Newest Arrivals");
		Thread.sleep(5000);

		//First result bag name and discounted price
		System.out.println(driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span\n")).getText());
		System.out.println(driver.findElement(By.className("a-price-whole")).getText());
		
		//Page title
		System.out.println(driver.getTitle());
		
		//Close the browser
		driver.close();
	}
}