/*Website - https://www.naukri.com/
 *Login  and search for "Automation testing" and location as"Chennai"
 */
package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaukriLoginAutomation {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Email ID')]/following::input[1]"))
				.sendKeys("abcde@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Password')]/following::input[1]")).sendKeys("*********");
		driver.findElement(By.xpath("//small[text()='Show']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Search jobs here')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='experienceDD']/preceding::input")).sendKeys("Automation testing");
		driver.findElement(By.id("experienceDD")).click();
		Thread.sleep(2000);
		// Select experience = new Select(driver.findElement(By.xpath("//span[text()='1
		// year']")));
		// experience.selectByVisibleText("1 year");
		driver.findElement(By.xpath("//span[text()='1 year']")).click();
		driver.findElement(By.xpath("//span[text()='Search']/preceding::input[1]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
