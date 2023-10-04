package Proservice.Formation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationLi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://best.aliexpress.com/?af=9736961616588223721&gclid=EAIaIQobChMIpqPpmezQgQMVWsHVCh1eHApQEAAYASAAEgKjdfD_BwE&aff_fcid=95ba7d5dedda4b329afc7f7b81687d4c-1696025769959-05163-_DdFxffh&tt=CPS_NORMAL&aff_fsk=_DdFxffh&aff_platform=portals-promotion&sk=_DdFxffh&aff_trace_key=95ba7d5dedda4b329afc7f7b81687d4c-1696025769959-05163-_DdFxffh&terminal_id=b70f6e6f645347e1a8a71e1220689c9f");
	
	WebElement cookies = driver.findElement(By.xpath("/html/body/div[11]/div/img"));
	cookies.click();
	WebElement recherche = driver.findElement(By.xpath("//*[@id=\"search-key\"]"));
	recherche.sendKeys("dior sauvage"); 
	WebElement selectRecherche = driver.findElement(By.xpath("//*[@id=\"form-searchbar\"]/div[1]/input"));
	selectRecherche.click();
	WebElement alerteNon = driver.findElement(By.xpath("//div[@class='law18--btn--29ue4Ne law18--left--2XI39FE']"));
	alerteNon.click();
	WebElement imagparf = driver.findElement(By.xpath("//*[@id=\"card-list\"]/a/div[1]/img"));
	imagparf.click();
	
	WebElement annonce = driver.findElement(By.xpath("/html/body/div[12]/div/img"));
	annonce.click();
	
	WebElement bynow = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[8]/button[1]/span"));
	bynow.click();
	
	
	
	
	}

}
