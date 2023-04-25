/*Website-http://zero.webappsecurity.com/
 *Navigation to url - "https://www.naukri.com/"
 *use back, forward and refresh the page 
 */
package SeleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.navigate().back();// back to the previous page
		Thread.sleep(2000);
		driver.navigate().refresh();// refresh the current page
		Thread.sleep(2000);
		driver.navigate().forward();// forward to the naukri
		Thread.sleep(3000);
		driver.quit();
	}
}
