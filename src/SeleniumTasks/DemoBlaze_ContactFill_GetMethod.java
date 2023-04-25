/*Get Methods - functions
 * Website(E-commerce) - https://demoblaze.com/index.html
 * Handle the Pop-Up and print the tag_name, Attribute of class, Css_value of font-size, Text present in the pop-up
 */
package SeleniumTasks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoBlaze_ContactFill_GetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Filling the form
		
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("recipient-email")).sendKeys("asdfasdf");
		driver.findElement(By.id("recipient-name")).sendKeys("lkjas;dldkfja;lskdfjz");
		driver.findElement(By.id("message-text")).sendKeys("lkjas;dldkfja;lskdfjz");
		driver.findElement(By.xpath("//button[text()='Send message']")).click();
		Thread.sleep(2000);
		/*Handling the pop-up
		 *use alert class - switching the selenium focus to pop-up
		 */
		Alert Pop = driver.switchTo().alert();
		String Text = Pop.getText();
		System.out.println("Alert POP up text = "+Text);
		Pop.accept();
		Thread.sleep(2000);
		System.out.println();
		driver.findElement(By.xpath("//a[contains(text(),'Iphone 6 32gb')]")).click();
		Thread.sleep(2000);
		
		/*Get Method
		 * getTagName - to find the tag of the particular Web element in the DOM
		 * getAttribute - to find the attribute value of the particular attribute
		 * getCssValue - to find the Css_value of the css property
		 * getText - to get the text present the webpage.
		 */
		String Title = driver.getTitle();
		System.out.println("Title = "+Title);
		String tagname = driver.findElement(By.id("message-text")).getTagName();
		System.out.println("Tagname = "+tagname);
		String Attribute = driver.findElement(By.id("myTab")).getAttribute("class");
		System.out.println("Attribute = "+Attribute);
		String CSSValue = driver.findElement(By.id("more-information")).getCssValue("font-size");
		System.out.println("CSSVAlue = "+CSSValue);
		String ProductText = driver.findElement(By.id("tbodyid")).getText();
		System.out.println("Product Text = "+ ProductText);
		
		Thread.sleep(2000);
		//close the present tab
	driver.close();
	}

}
