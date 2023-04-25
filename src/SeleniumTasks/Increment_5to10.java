/*Website - https://the-internet.herokuapp.com/inputs
 *Enter "5" in the field and increment the value to 10 using keyboard actions 
 */
package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Increment_5to10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("5");
		Thread.sleep(2000);
		//Actions class to perform keyboard actions
		Actions Increment = new Actions(driver);
		//increment operation
		for(int i=1;i<=5;i++)
		{
			Increment.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
