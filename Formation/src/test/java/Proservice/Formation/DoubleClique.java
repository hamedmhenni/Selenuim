package Proservice.Formation;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClique {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
// ouverture de chrome 
		WebDriver driver = new ChromeDriver();
	// maximiser la fenetre 
		driver.manage().window().maximize();
		// accéder à un url
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClik1,rightClik1;
		doubleClik1= driver.findElement(By.id("doubleClickBtn"));
		rightClik1=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(5000);	
		
//		Thread.sleep(5000);
		////*[@id="no24q"]
		Actions action = new Actions(driver);
		
		action.doubleClick(doubleClik1).perform();
		action.contextClick(rightClik1).perform();
		
		// verifier si l'actions fonctionnent 
		WebElement text1 =driver.findElement(By.id("doubleClickMessage"));
		WebElement text2 =driver.findElement(By.id("rightClickMessage"));
		String text11 , text22;
		
		text11 = text1.getText();
		text22 = text2.getText();
		
		assertEquals(text11, "You have done a double click");
		assertEquals(text22, "You have done a right click");
		
		System.out.println(text11+"=====>"+text22);

	}

}
