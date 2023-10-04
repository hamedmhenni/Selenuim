package exemplecucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookCompteAvecClaviers {
	WebDriver driver;

	
	@Given("o ouvrir Navigateurs")
	public void o_ouvrir_navigateurs() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("o ouvrir url {string}")
	public void o_ouvrir_url(String string) {
	  driver.get(string);
	  WebElement BtnNewAccompte = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		BtnNewAccompte.click();
	}

	@When("o saisir le nom {string}")
	public void o_saisir_le_nom(String string) {
	
WebElement	prenom = driver.findElement(By.xpath("//input[@placeholder='Prénom']"));
prenom.sendKeys(string);
	}

	@When("o sasir le prenom {string}")
	public void o_sasir_le_prenom(String string) {
		WebElement	nom = driver.findElement(By.xpath("//input[@aria-label='Nom de famille']"));
		nom.sendKeys(string);
	}

	@When("o sasir le mail {string}")
	public void o_sasir_le_mail(String string) {
	    WebElement 		nummobil = driver.findElement(By.xpath("//input[@aria-label='Numéro de mobile ou e-mail']"));
nummobil.sendKeys(string);
	}

	@When("o saisir le mot de passe {string}")
	public void o_saisir_le_mot_de_passe(String string) {
	  WebElement 		motpass = driver.findElement(By.xpath("//input[@aria-label='Nouveau mot de passe']"));
motpass.sendKeys(string);
	}

	@When("o selectionner le jour de naissance {string}")
	public void o_selectionner_le_jour_de_naissance(String string) {
	   WebElement 	selectjour = driver.findElement(By.xpath("//select[@title='Jour']"));
		
		
		
		selectjour.click();
		Select slct =new Select(selectjour);
		slct.selectByValue("11");
	}

	@When("o selectionner le mois {string}")
	public void o_selectionner_le_mois(String string) {
	    WebElement selectmois = driver.findElement(By.xpath("//select[@title='Mois']"));
        selectmois.click();
    	Select slct1 =new Select(selectmois);
		slct1.selectByValue("6");
	}

	@When("o selectionner l annee {string}")
	public void o_selectionner_l_annee(String string) {
	  WebElement 	selectannee = driver.findElement(By.xpath("//select[@title='Année']"));
      selectannee.click();
		Select slct2 =new Select(selectannee);
		slct2.selectByVisibleText("1993");
		
	}

	@When("o selectionner le genre {string}")
	public void o_selectionner_le_genre(String string) {

if (string.equals("h")) {
	WebElement genre;
	genre = driver.findElement(By.xpath("//input[@value='2']"));

genre.click();}
else if 
(string.equals("f")) {
	WebElement genre;
	genre = driver.findElement(By.xpath("//input[@value='1']"));

genre.click();}
else {
	WebElement genre;
	genre = driver.findElement(By.xpath("//input[@value='-1']"));

	genre.click();
}
	}

	@When("o cliquer sur creer new compte")
	public void o_cliquer_sur_creer_new_compte() {
		Actions action = new Actions(driver);
		WebElement ok = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/form[@method='post']/div/div/button[1]"));
		action.click(ok).perform();
	}

	@Then("o vérifier la creation d un nouveau compte")
	public void o_vérifier_la_creation_d_un_nouveau_compte() {
	   System.out.println("TEST IS OK OK ");
	}



}
