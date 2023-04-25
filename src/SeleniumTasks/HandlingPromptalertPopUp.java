/*Website - https://demo.automationtesting.in/Alerts.html
 * Handling Prompt Pop-Up
 *Send "Great" in the pop-up text field Print the text present in the pop-up and click on "OK" 
 */
package SeleniumTasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptalertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("Great");
		a.accept();
		String Textresult = driver.findElement(By.id("demo1")).getText();
		System.out.println(Textresult);
		Thread.sleep(2000);
		driver.close();
	}

}
