/*Website - https://petstore.octoperf.com/actions/Account.action?newAccountForm=
 * Sign-up page 
 */
package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JPetStore {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.findElement(By.name("username")).sendKeys("fsa");
		driver.findElement(By.name("password")).sendKeys("1as2;lkdfasdfjhgfd34");
		driver.findElement(By.name("repeatedPassword")).sendKeys("f");
		driver.findElement(By.name("account.firstName")).sendKeys("sd");
		driver.findElement(By.name("account.lastName")).sendKeys("asasasasasas");
		driver.findElement(By.name("account.email")).sendKeys("emjgmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("12345678df90");
		driver.findElement(By.name("account.address1")).sendKeys("Address 10");
		driver.findElement(By.name("account.address2")).sendKeys("Addrasdfess 02");
		driver.findElement(By.name("account.city")).sendKeys("Cheasnnai");
		driver.findElement(By.name("account.state")).sendKeys("asasas");
		driver.findElement(By.name("account.zip")).sendKeys("69");
		driver.findElement(By.name("account.country")).sendKeys("lkjhgfdsa");
		Select Language = new Select(driver.findElement(By.name("account.languagePreference")));
		Language.selectByVisibleText("japanese");
		Select FavCategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		FavCategory.selectByVisibleText("DOGS");
		WebElement MyList = driver.findElement(By.name("account.listOption"));
		MyList.click();
		WebElement MyBanner = driver.findElement(By.name("account.bannerOption"));
		MyBanner.click();
		// GET attribute
		String UNAttribute = driver.findElement(By.name("username")).getAttribute("type");
		System.out.println(UNAttribute);
		// GET Css
		String CSSUN = driver.findElement(By.name("username")).getCssValue("display");
		System.out.println(CSSUN);
		driver.findElement(By.name("newAccount")).click();
		// GET Methods Title
		String JPetTitle = driver.getTitle();
		System.out.println(JPetTitle);
		// GET URL
		String JPetURL = driver.getCurrentUrl();
		System.out.println(JPetURL);
	}
}
