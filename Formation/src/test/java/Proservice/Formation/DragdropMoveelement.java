package Proservice.Formation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragdropMoveelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement element1, element2;
		element1 = driver.findElement(By.id("draggable"));
		element2 = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
		
		

		WebElement textdelaction;
		textdelaction = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	
		
		String textadact = textdelaction.getText();
	System.out.println(textadact);
	
	//assertEquals(textadact, "Dropped");
driver.get("https://demoqa.com/menu");
WebElement position = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
action.moveToElement(position).perform();



		
	}

}
