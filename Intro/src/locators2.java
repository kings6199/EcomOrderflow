import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		locators2 pickpass = new locators2();
		String ab = pickpass.getPassword(driver);
		System.out.println(ab);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("mahesh");
		driver.findElement(By.name("inputPassword")).sendKeys(ab);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(30000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.className("logout-btn")).click();
	
		
		
		

	}
	
	public String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(20000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String splittedArray[] = passwordText.split("'");
		String password[] = splittedArray[1].split("'");
		String pass = password[0];
		return pass;
	}

}
