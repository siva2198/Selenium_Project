/*Handling Pop up - Alert pop up 
 *Website - https://demo.automationtesting.in/Alerts.html
 *Print the text present in the pop-up and click on "OK" 
 */
package SeleniumTasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlertPopUp {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'display an')]")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		String TextInPopUp = a.getText();
		System.out.println("Text present in the alert pop up = "+ TextInPopUp);
		Thread.sleep(3000);
		a.accept();
		driver.close();	
	}
}
