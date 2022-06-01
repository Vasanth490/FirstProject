import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System Property for chrome Driver   
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		String text= "Shivani";
		
		//get URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//Send name
		driver.findElement(By.id("name")).sendKeys(text);
		
		//click on alert button
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		//Get text
		System.out.println(driver.switchTo().alert().getText());
		
		//Accept alert by clicking on OK button
		driver.switchTo().alert().accept();
		
		//Click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		//Get text
		System.out.println(driver.switchTo().alert().getText());
		
		//Dismiss alert by clicking on cancel
		driver.switchTo().alert().dismiss();

		driver.close();


	}

}
