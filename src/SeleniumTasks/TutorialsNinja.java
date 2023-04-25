/*Website - http://tutorialsninja.com/demo/index.php?route=account/register
 * Registeration form 
 */
package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TutorialsNinja {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("Siva");
		driver.findElement(By.id("input-lastname")).sendKeys("raman");
		driver.findElement(By.id("input-email")).sendKeys("Sivarman@email.com");
		driver.findElement(By.id("input-telephone")).sendKeys("12304567991");
		driver.findElement(By.id("input-password")).sendKeys("123");
		driver.findElement(By.id("input-confirm")).sendKeys("123");
		driver.findElement(By.name("newsletter")).click();;
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@name='agree']/following::*[1]")).click();
	}
}
