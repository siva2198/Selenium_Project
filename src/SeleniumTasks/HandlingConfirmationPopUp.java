/*Handling Confirmation pop-up
 *Website - https://demo.automationtesting.in/Alerts.html
 *Print the text present in the pop-up and click on "Cancel" 
 */
package SeleniumTasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
		//Alert class - to hanlde confirmation pop-up 
		Alert a = driver.switchTo().alert();
		String PopUpText = a.getText(); 
		System.out.println(PopUpText);
		//dismiss- used to click on cancel 
		a.dismiss();
		String result = driver.findElement(By.id("demo")).getText();
		System.out.println(result);
		driver.close();
}
}
