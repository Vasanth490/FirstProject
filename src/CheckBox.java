//Select checkbox2 option- Find all checkboxes value, check whether checkbox2 exists or not, if it 
//exits then select checkbox2


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
	    WebDriver driver = new ChromeDriver(); 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    
	    
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='checkbox' and @name='webform']")));

		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' and @name='webform']"));
		int size=checkbox.size();
		System.out.println(size);

		for(int i=0; i<size; i++) {
			
			if(checkbox.get(i).getAttribute("value").contains("checkbox2")) {
				System.out.println("Inside loop");
				
				checkbox.get(i).click();
				System.out.println("Clicked Checkbox");
				break;
			}
			
		}
		
		
		/*for(WebElement check:checkbox) {
			
			if(check.getAttribute("value").contains("checkbox2")) {
				System.out.println("Inside loop");
				
				check.click();
				System.out.println("Clicked Checkbox");
				break;
			}
			
		}*/
		
		
		driver.close();
	}

}
