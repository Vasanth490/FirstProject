import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzztable {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
	    
	    WebElement table=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
	    
	    List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']//tbody/tr"));
	    
	    for(int i=1;i<rows.size();i=i+2) {
	    	
	    	String teamName=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']//tbody/tr["+i+"]/td[1]/a")).getText();
	    	//String matchWon=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']//tbody/tr[i]/td[3]")).getText();
	    	System.out.println("Team name is"+teamName);
	    	//System.out.print("Match won by team is"+matchWon);

	    
	    
	}
	}

}
