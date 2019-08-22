package days_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Drag_Drop {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement src= driver.findElement(By.id("draggable"));
		WebElement targ= driver.findElement(By.id("droppable"));
		
		Actions obj=new Actions(driver);
		Sleeper.sleepTightInSeconds(3);
		
		obj.dragAndDrop(src, targ).build().perform();
  }
}












