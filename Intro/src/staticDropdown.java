import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	WebElement  staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(staticDropdown);
//		
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		
//		driver.findElement(By.xpath("//input[@placeholder = 'Type to Select']")).sendKeys("ind");
//		Thread.sleep(50000);
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
//			
		
	}

}
