import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsProgram {
	public static void main(String[] args) {
		
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
        
		driver.get("http://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //wait
		
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername) //move to element
			.click() //click
			.keyDown(txtUsername, Keys.SHIFT) //send input in capital, so hold shift keys
			.sendKeys(txtUsername, "hello") //send keys
			.keyUp(txtUsername, Keys.SHIFT) //release shift key
			.doubleClick(txtUsername) //double click
			.contextClick() //right click
			.build(); //build
			
		seriesOfActions.perform() ; //perform action
		
		driver.close();

		}
}
