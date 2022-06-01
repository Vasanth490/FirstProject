import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SeleniumLocators {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//invoke driver
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
	    
	    //create driver instance
		WebDriver driver = new ChromeDriver();
		
		//wait for 100ms
		Thread.sleep(100);
		
		//navigate to URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Enter username and password and click on sign in button			
		driver.findElement(By.id("inputUsername")).sendKeys("shivani");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		//wait for 1000ms
		Thread.sleep(1000);
		
		//print error message
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//click on forget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//wait for 1000ms
		Thread.sleep(1000);
		
		//Enter name, email, phone number and click on reset pwd btn
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Print message
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		//Click on login button
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		
		//Enter username, passwork, click checkbox, and click submit button
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shivani");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//close driver instance
		driver.close();
	}

}
