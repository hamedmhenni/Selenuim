package Proservice.Formation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RechercheGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		WebElement barreDeRecherce = driver.findElement(By.name("q"));
		barreDeRecherce.sendKeys("tunisia");
		barreDeRecherce.sendKeys(Keys.ENTER);  // utilisation de clavier 
		
		
		// verification 
		WebElement ann = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
		String textann = ann.getText();
		
		if (textann.contains("résultats")) {
			System.out.println("test ok ");
		}else {
			System.out.println("test Ko ");
		}
		driver.close();
		
	}
}
