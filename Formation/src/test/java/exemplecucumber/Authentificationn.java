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

public class Authentificationn {
WebDriver driver;


	@Given("ouvrir Navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("ouvrir url")
	public void ouvrir_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("saisir username")
	public void saisir_username() {
	 WebElement username =   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	 username.sendKeys("Admin");
	}

	@When("sasir mdp")
	public void sasir_mdp() {
		 WebElement mdp =   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		 mdp.sendKeys("admin123");
	   
	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		 WebElement btnlogin =   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		 btnlogin.click();
	}

	@Then("vérifier le nom du profil")
	public void vérifier_le_nom_du_profil() {
	WebElement   nomadmin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
	
		String adminN = nomadmin.getText();
		Assert.assertEquals(adminN, "Paul Collings");
		System.out.println("test ok ");
				
		
	
	}

	
	
}
