package learning;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;

public class Sele {

	//public WebDriver driver;
	//String path = "C://Users//nrampelly//Downloads//Libraries//chromedriver_win32//";

	@Test
	public void launch() {

		//driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://google.com");
		Selenide.open("https://google.com");
		Selenide.$(Selectors.byLinkText("Images")).click();
		//driver.findElement(By.linkText("Images")).click();
		//$(By.name("")).setValue("");
		Selenide.$("//input[@name='btnK']").click();
				//$("Images").click();
		//$("//INPUT[@id='lst-ib']").setValue("test");
		//$(By.xpath("//a[@class='gb_P'][contains(text(),'Gmail')]")).click();
	}
	
	
}
