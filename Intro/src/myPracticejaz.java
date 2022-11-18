import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myPracticejaz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.jazeerapaints.com/saudi-en/");	
//		Thread.sleep(5000);
		By path = By.xpath("(//a[@class='NavHeader__btn-bottom'])[2]");
		WebElement a = driver.findElement(path);
		a.click();
	}

}
