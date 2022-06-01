import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);

		//check that option1 button is not selected
		Assert.assertFalse(driver.findElement(By.id("vfb-7-1")).isSelected());
				
		
		//click button
		driver.findElement(By.id("vfb-7-1")).click();
		
		//isSelected will return true or false value
		System.out.println(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		//check that option1 button is selected
		Assert.assertTrue(driver.findElement(By.id("vfb-7-1")).isSelected());
		
		driver.close();
	}

}



















