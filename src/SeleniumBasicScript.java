import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBasicScript {
	public static void main(String[] args) {


		//Invoking Browser
		// Chrome 
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\ChromeDriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	   /*Firefox 
	     System.setProperty("webdriver.gecko.driver", "D:\\Training\\Selenium\\geckodriver.exe");
	     WebDriver driver1 = new FirefoxDriver();*/


	     /*Microsoft Edge
	     System.setProperty("webdriver.edge.driver", "D:\\Training\\Selenium\\msedgedriver.exe");
	     WebDriver driver2 = new EdgeDriver();*/
	    
	     driver.get("https://rahulshettyacademy.com");
	     String title=driver.getTitle();
	     System.out.println(title);
	     driver.close();
	     //driver.quit();
	}

}
