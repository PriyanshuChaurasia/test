package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement e=driver.findElement(By.linkText("Dropdown"));
		e.click();
		
	
		
		WebElement element=driver.findElement(By.id("dropdown")); 
		
		
		Select sel=new Select(element);
		sel.selectByIndex(2);
		 Thread.sleep(3000);
	 driver.close();
	 driver.quit();
		
		
		
		
	}

}
