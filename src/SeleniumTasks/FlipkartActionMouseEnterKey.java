/*Website - https://www.flipkart.com/
Search for "Mobiles" in search filed and click enter using keyboard actions
 */
package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FlipkartActionMouseEnterKey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Create an')]/preceding::button[2]")).click();
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		//Actions class used to perform keyboard actions
		Actions Enter = new Actions(driver);
		Enter.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		driver.close();
	}

}
