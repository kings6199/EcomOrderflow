import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EcomOrderFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://qa.jazeerapaints.com/saudi-en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".HeaderMenu__title"))).build().perform();
		driver.findElement(By.xpath("//p[contains(text(),'Sign In')]")).click();
		driver.switchTo().frame("webpush-onsite");
		driver.findElement(By.cssSelector("#deny")).click();
		driver.findElement(By.id("email")).sendKeys("mpalukuru@jazeeratech.in");
		driver.findElement(By.id("password")).sendKeys("9985028661");
		driver.findElement(By.className("Login__button")).click();
		driver.findElement(By.id("searchMenu")).sendKeys("Green matt");
		driver.findElement(By.className("SearchMenu__product-name")).click();

		Thread.sleep(7000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.switchTo().frame("webpush-onsite");
		driver.findElement(By.cssSelector("#deny")).click();
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".ProductPageMainComponent__dynamic-panel\").scrollTop=5000");
		for (int i = 0; i < 4; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@alt='add'])[1]")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.className("ProductSelectButton__button")).click();
		driver.findElement(By.className("block")).click();

		driver.findElement(By.id("searchMenu")).sendKeys("Dragging");
		Thread.sleep(2000);
		driver.findElement(By.className("SearchMenu__product-name")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("PaintingToolInformation__sizes-title")).getText());
		js.executeScript("window.scrollBy(0, 500)");
		System.out.println(driver.findElement(By.xpath("//img[@alt='add']")));
		System.out.println("adding");

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//img[@alt='add']")).click();
			Thread.sleep(1000);
		}
		System.out.println("added........");
		driver.findElement(By.className("PaintingToolPageMainComponent__cartButton")).click();
		driver.findElement(By.className("Alert__button")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("NavHeader__ecommerce-cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Check Out')]")).click();

		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.switchTo().frame("webpush-onsite");
		driver.findElement(By.cssSelector("#deny")).click();
		js.executeScript("window.scrollBy(0,500)");
		WebElement var11 = driver.findElement(By.xpath(
				"//div[@class='ShippingInformation__details-container']/child::div[3]/child::div[2]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::div[1]/following::div[1]"));
		Thread.sleep(1000);
		try {
			var11.click();
		} catch (Exception e) {
			var11.click();
		}
		Thread.sleep(2000);
		List<WebElement> areas = driver.findElements(By.className("multiselect__element"));
		for (WebElement option : areas) {
			if (option.getText().equals("RIYADH AIR BASE")) {
				option.click();
			}
		}

		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("ShippingInformation__continue-to-payment")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Continue to Payment')]")).click();

		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.className("CardPayment__input-name")).sendKeys("TestingAuTo");
		driver.findElement(By.className("CardPayment__input-card-number")).sendKeys("4242424242424242");

		WebElement selectExpiryMonthDropdown = driver.findElement(By.className("CardPayment__select--placeholder"));
		Select expiryMonthDropdown = new Select(selectExpiryMonthDropdown);
		expiryMonthDropdown.selectByIndex(2);

		WebElement selectExpiryYearDropdown = driver.findElement(By.className("CardPayment__selectYear"));
		Select expiryYearDropdown = new Select(selectExpiryYearDropdown);
		expiryYearDropdown.selectByIndex(5);

		driver.findElement(By.className("CardPayment__input-cvv")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.className("SecurePayment__btn-pay")).click();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("Checkout1!");
		driver.findElement(By.id("txtButton")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Continue')]")).click();
		driver.switchTo().frame("webpush-onsite");
		driver.findElement(By.cssSelector("#deny")).click();
		WebElement orderId = driver.findElement(By.className("Preview__value"));
		System.out.println(orderId.getText());

		WebElement price = driver.findElement(By.xpath(
				"//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]"));
		System.out.println(price.getText());

		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		driver.findElement(By.className("OrderActions__print-section")).click();

	}

}
