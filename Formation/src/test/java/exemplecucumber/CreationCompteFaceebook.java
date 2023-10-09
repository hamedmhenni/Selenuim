package exemplecucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationCompteFaceebook {
WebDriver driver;
	
	@Given("ouvrir le navigateur choisi")
	public void ouvrir_le_navigateur_choisi() {
	   System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	}

	@Given("se connecterr au site {string}")
	public void se_connecterr_au_site(String string) {
	   driver.get(string);
	}

	@When("cliquer sur le bouton créer nouveau compte")
	public void cliquer_sur_le_bouton_créer_nouveau_compte() {
	    WebElement btncnc =driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	   btncnc.click();
	}

	@When("saisir votre prénom {string}")
	public void saisir_votre_prénom(String string) {
	    WebElement prenom = driver.findElement(By.name("firstname"));
	    prenom.sendKeys(string);
	}

	@When("saisir votre nom de famille {string}")
	public void saisir_votre_nom_de_famille(String string) {
		WebElement nomfamille = driver.findElement(By.name("lastname"));
	    nomfamille.sendKeys(string);
	}

	@When("entrer votre num mobile ou adresse mail {string}")
	public void entrer_votre_num_mobile_ou_adresse_mail(String string) {
		WebElement nummob = driver.findElement(By.name("reg_email__"));
	    nummob.sendKeys(string);
	}

	@When("saisir votre mot de passe {string}")
	public void saisir_votre_mot_de_passe(String string) {
		WebElement motpass = driver.findElement(By.name("reg_passwd__"));
	    motpass.sendKeys(string);
	}

	@When("choisir votre jour de naissance {string}")
	public void choisir_votre_jour_de_naissance(String string) {
		WebElement jourB = driver.findElement(By.name("birthday_day"));
		Select slct =new Select(jourB);
		slct.selectByValue(string);
	    
	}

	@When("choisir votre mois de naissance {string}")
	public void choisir_votre_mois_de_naissance(String string) {
		WebElement mois = driver.findElement(By.name("birthday_month"));
		Select slctM =new Select(mois);
		slctM.selectByValue(string);
	}

	@When("choisir votre annee de naissance {string}")
	public void choisir_votre_annee_de_naissance(String string) {
		WebElement an = driver.findElement(By.name("birthday_year"));
		Select slctA =new Select(an);
		slctA.selectByValue(string);
	}

	@When("choisir votre genre {string}")
	public void choisir_votre_genre(String string) {
	  WebElement homme, femme , perszonnalisé;
	  homme = driver.findElement(By.xpath("//input[@value='2']"));
	  femme = driver.findElement(By.xpath("//input[@value='1']"));
	  perszonnalisé = driver.findElement(By.xpath("//input[@value='-1']"));
	  if (string.equals("homme")) {
		homme.click();
	} else if (string.equals("femme")) {femme.click();}
	else {perszonnalisé.click();
	
	
	}
	  
	}

	@When("cliquer sur s'inscrire")
	public void cliquer_sur_s_inscrire() {
	   
		Actions action = new Actions(driver);
		WebElement ok = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/form[@method='post']/div/div/button[1]"));
		action.click(ok).perform();
	}

	@Then("vérifier  la creation du compte \\(oui pour données valide \\/\\/ et nom pour invalide){string}")
	public void vérifier_la_creation_du_compte_oui_pour_données_valide_et_nom_pour_invalide(String string) throws InterruptedException {
	Thread.sleep(6000);
	String url  =driver.getCurrentUrl(); 
	System.out.println(url);
	
	
		if (string.equals(url)) {
			
			System.out.println("======okokokokok=======");

		} else {System.out.println("======echecc  url=======");

	}
	}

}
