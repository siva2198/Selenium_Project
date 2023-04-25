/*Website - https://www.flipkart.com/
 * Browser - Firefox
 * Select a product and add to card - get the total amount of the product
 */
package SeleniumTasks;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FlipkartFollow {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver", "D:\\Selenium\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']/preceding::button[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']/preceding::button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'FAST Trenddy Tainer Lace-ups')]")).click();
		Thread.sleep(5000);
		ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Tabs.get(1));
		driver.getTitle();
		driver.findElement(By.id("swatch-3-size")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		String Total =driver.findElement(By.xpath("//div[text()='Total Amount']")).getText();
		String Price =driver.findElement(By.xpath("//span[text()=' ₹299']")).getText();
		System.out.println(Total);
		System.out.println(Price);
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(text(),'Special Price')]")).getText();
		System.out.println(text);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
