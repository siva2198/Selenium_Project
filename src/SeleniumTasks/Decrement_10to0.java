/* Given Website perform actions using Keyboard actions
*Website - https://the-internet.herokuapp.com/inputs
 *Enter the value 10 in the text field and decrement value to 0 
 */

package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Decrement_10to0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("10");
		Thread.sleep(2000);
		Actions Decrement = new Actions(driver);
		// loop used to iterate
		for (int i = 10; i >= 1; i--) {
			Decrement.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(2000);
		driver.close();

	}

}
