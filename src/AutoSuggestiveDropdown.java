import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Find autosuggestive dropdown elemnet and send keys
//Get all options and select India from those options
public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		//get URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Find element and send key
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		
		//get all options 
		List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
	
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
					option.click();
					break;

			}
		}

		driver.close();
	}

}
