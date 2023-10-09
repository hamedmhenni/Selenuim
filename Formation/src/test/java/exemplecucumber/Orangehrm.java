package exemplecucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Orangehrm {
	
	WebDriver driver;
	@Given("ouvrir le site {string}")
	public void ouvrir_le_site(String string) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("saisir user {string}")
	public void saisir_user(String string) {
WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
user.sendKeys(string);

	}

	@When("saisir mot de passse {string}")
	public void saisir_mot_de_passse(String string) {
		WebElement motpass = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]"));
		motpass.sendKeys(string);
		
	}

	@When("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {
		WebElement btnconnexion = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	btnconnexion.click();
	}

	@Then("je vérifie si le compte s'ouvre avec url {string}")
	public void je_vérifie_si_le_compte_s_ouvre_avec_url(String string){
	 String monurl =  driver.getCurrentUrl();
	  System.out.println(monurl);
	  
	  if (monurl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
		WebElement dashbord = driver.findElement(By.xpath("//p[normalize-space()='Joa Caceres']"));
		String dashText = dashbord.getText();
	Assert.assertEquals(string, dashText);
	System.out.println("connexion avec succées ");
	} 
	  
	  
	  
	  
	  else if (monurl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
		WebElement messageEreur = driver.findElement(By.xpath("//p[normalize-space()='Invalid credentials']"));

		String testmessageeur = messageEreur.getText();
		Assert.assertEquals(string, testmessageeur);
		
		
		
		System.out.println("echec de connexion veuillez vérifier user or/and motpass");
	} 
	
	
	
	else {


		System.out.println("=====autres problémes========");
	}
	  driver.close();	
	}


}
