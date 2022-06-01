import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample{
	
	public static void main(String[] args) throws NoSuchElementException, InterruptedException{
		
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
        
		//Get URl
	    driver.get("http://demo.guru99.com/test/guru99home/");  
	   
	    //Maximize window
	    driver.manage().window().maximize();
	    
	    //Javascript executor for scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
       
	   js.executeScript("window.scrollBy(0,2000)");


	   //Switch to frame
	    driver.switchTo().frame("a077aa5e"); //Switching to the frame
		
	    System.out.println("********We are switched to the iframe*******");
	    
	    Thread.sleep(1000);
	    
		driver.findElement(By.xpath("/html/body/a")).click();		
		
		//switch to original page
	    driver.switchTo().defaultContent();

		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	    
	    driver.quit();
	            
	   
	    
	    
	  }
}