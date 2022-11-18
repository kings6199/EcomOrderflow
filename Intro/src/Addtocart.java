import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter product names with space...");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] itemsneeded = str.split(" ");
		sc.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jazeera\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size() ; i++) {
			
	      String[] name = products.get(i).getText().split("-");
	      String nameText = name[0].trim();
	      
	      List<String> converted = Arrays.asList(itemsneeded);
	      
	      int j=0;
	      
	      if(converted.contains(nameText)) {
	    	  
	    	  if(nameText.equals("Beetroot")) {
	    		  System.out.println("Beetroot Beetroot");
	    		  
	    		  for(int ai =1; ai<10; ai++) {
	    			  driver.findElement(By.className("increment")).click();
	    		  }
	    		  Thread.sleep(5000);
	    		  driver.findElement(By.className("decrement")).click();
	    	  }
	    	  
	    	  driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
	    	  Thread.sleep(5000);
	    	  System.out.println("hi");
	    	 
	    	  if(j==3)
	    		  break;
	    	  
	      }
		}

	}

}
