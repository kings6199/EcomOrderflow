import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("venkatesh");
		driver.findElement(By.name("email")).sendKeys("venky123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("venky");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		staticDropdown.click();

		Select mahesh = new Select(staticDropdown);
		mahesh.selectByIndex(1);
		driver.findElement(By.name("bday")).sendKeys("24022004");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	}

}
