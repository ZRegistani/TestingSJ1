package SeleniumPAC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitting_FORM {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Program Files//ChromeDriver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"ybarAccountProfile\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"createacc\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys("Zeba");
		driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")).sendKeys("Registani");
		driver.findElement(By.xpath("//*[@id=\"usernamereg-userId\"]")).sendKeys("zebar23");
		driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("Annandale2020!");
		driver.findElement(By.xpath("//*[@id=\"usernamereg-birthYear\"]")).sendKeys("1972");
		driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]")).sendKeys("5714070749");
		driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
		
		
		driver.close();
		
		
		
	}

}
