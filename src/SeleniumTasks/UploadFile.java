/*Uploading a file in a website
 * Website- https://demo.guru99.com/test/upload/
 */
package SeleniumTasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver",
				"D:\\Selenium\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\Selenium\\Xpaths\\xpath using following.png");
		Thread.sleep(5000);
		WebElement click = driver.findElement(By.id("terms"));
		click.click();
		driver.findElement(By.id("submitbutton")).click();
		driver.close();
	}
}
