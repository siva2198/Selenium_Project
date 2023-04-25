/*Website - https://demoblaze.com/
* Sign-up page automate
 */

package SeleniumTasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoBlaze_SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("sign-username")).sendKeys("Hello123455");
		driver.findElement(By.id("sign-password")).sendKeys("Hellopassword");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		Thread.sleep(2000);
		Alert SignUp = driver.switchTo().alert();
		String Text = SignUp.getText();
		System.out.println(Text);
		Thread.sleep(1000);
		SignUp.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
