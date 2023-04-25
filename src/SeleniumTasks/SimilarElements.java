package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimilarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.manage().window().maximize();
		// total links the webpage
		int TotalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("aksjhdfkjahsdfhashdfashdf " + TotalLinks);
		// total image in webpage
		int TotalImg = driver.findElements(By.tagName("img")).size();
		System.out.println(TotalImg);
		// total paragraph in webpage
		int TotalPara = driver.findElements(By.tagName("p")).size();
		System.out.println(TotalPara);
		// total links in the webpage
		int Tottallinks = driver.findElements(By.tagName("a")).size();
		System.out.println(Tottallinks);
	}
}
