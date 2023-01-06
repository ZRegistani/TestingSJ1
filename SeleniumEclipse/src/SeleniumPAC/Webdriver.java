package SeleniumPAC;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();  //controlling chrome testing options
		//options.setExperimentalOption("useAutomationExtension", false);
		//options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		//WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		driver.get("http://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rachelreedbuz@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.name("password")).sendKeys("Annandale2020!");
//		driver.findElements(By.name("")).click();
		
		
		 System.out.println("Successfully opened the website");


      //   driver.quit();	

		



         
		
		
	}

}
