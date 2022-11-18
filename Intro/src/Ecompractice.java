import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecompractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://pre-prod.jazeerapaints.com/saudi-en/");
		
		driver.findElement(By.xpath("//div[contains(class,aos-animate)]//child::a[2]//div[@class='CategoryTypes__box-img']")).click();

	}

}
