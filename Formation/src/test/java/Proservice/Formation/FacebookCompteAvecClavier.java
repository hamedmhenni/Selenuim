package Proservice.Formation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookCompteAvecClavier {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		WebElement BtnNewAccompte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		BtnNewAccompte.click();

		WebElement nom, prenom, nummobil, motpass;
		prenom = driver.findElement(By.xpath("//input[@placeholder='Prénom']"));
		nom = driver.findElement(By.xpath("//input[@aria-label='Nom de famille']"));
		nummobil = driver.findElement(By.xpath("//input[@aria-label='Numéro de mobile ou e-mail']"));
		motpass = driver.findElement(By.xpath("//input[@aria-label='Nouveau mot de passe']"));

		// utilisation de clavier copier/coller
		prenom.sendKeys("hamed");
		
		Actions action = new Actions(driver);
		action.keyDown(prenom,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(nom,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		nummobil.sendKeys("50930538");
		motpass.sendKeys("azerty123456à@");
		
		WebElement selectjour,selectmois,selectannee  ;
		
		selectjour = driver.findElement(By.xpath("//select[@title='Jour']"));
		
		
		
		selectjour.click();
		Select slct =new Select(selectjour);
		slct.selectByValue("11");
		
	
	 
	
		selectmois = driver.findElement(By.xpath("//select[@title='Mois']"));
        selectmois.click();
    	Select slct1 =new Select(selectmois);
		slct1.selectByValue("6");
		
		selectannee = driver.findElement(By.xpath("//select[@title='Année']"));
        selectannee.click();
		Select slct2 =new Select(selectannee);
		slct2.selectByVisibleText("1993");
		
	       
		
		
		
		//WebElement genre ,genreH,genreA,genreF;
		
		System.out.println("entrfer le genre");
		
		Scanner scan =new Scanner(System.in);
		
		String genre = scan.nextLine();
		
		if(genre=="H") {
			WebElement genreh = driver.findElement(By.xpath("//input[@value='2']"));

		genreh.click();	} else if (genre=="F") {WebElement		genref = driver.findElement(By.xpath("//input[@value='1']"));

			genref.click();
		}else {WebElement 		genrea = driver.findElement(By.xpath("//input[@value='-1']"));
		
			genrea.click();
			Thread.sleep(5000);
			WebElement selector12 = driver.findElement(By.xpath("select[name='preferred_pronoun']"));
			selector12.click();
			Select lasell = new Select(selector12);
			lasell.selectByVisibleText("Sélectionnez votre pronom");
		}
		
		
			
		
		

		
		
		
		WebElement ok = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/form[@method='post']/div/div/button[1]"));
		action.click(ok).perform();
	}

}
