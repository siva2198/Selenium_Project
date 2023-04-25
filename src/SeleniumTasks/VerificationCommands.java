/*Website- https://formy-project.herokuapp.com/form
 * WebElement and select radio button and check box 
 * Verify that Radio button and check is selected.
 */
package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Siva");
		driver.findElement(By.id("last-name")).sendKeys("raman");
		driver.findElement(By.id("job-title")).sendKeys("Automation testing");
		WebElement Radio = driver.findElement(By.id("radio-button-2"));
		Radio.click();
		// Enabled method is used to verify that the radio button is selected or not
		System.out.println(Radio.isEnabled());
		WebElement Check = driver.findElement(By.id("checkbox-2"));
		Check.click();
		// Selected method is used to verify that the check button is selected or not
		System.out.println(Check.isSelected());
		// Displayed method is used to verify that text is present in the webpage or not
		System.out.println(driver.findElement(By.id("first-name")).isDisplayed());
	}
}
