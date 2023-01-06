package SeleniumPAC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multiple_Dropdown {
	
	
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
       driver.get("https://training.qaonlinetraining.com/");
		
       driver.findElement(By.xpath("//*[@id=\"menu-item-48\"]/a")).click();
       
     //  driver.findElement(By.xpath("")).multiple = "";
		
       Select selectByValue = new Select(driver.findElement(By.id("//*[@id=\\\"menu-item-48\\\"]/a")));
       selectByValue.selectByValue("Manual Testing Video");
       selectByValue.selectByVisibleText("Sofware testing Tutorial");
       selectByValue.selectByVisibleText("Business Anylsis");
       selectByValue.selectByVisibleText("STLC");
       selectByValue.selectByVisibleText("More Testing Concepts");
       selectByValue.selectByVisibleText("Teset Cases");
       selectByValue.selectByVisibleText("Test fPlan");
       selectByValue.selectByVisibleText("Test Strategy");
       selectByValue.selectByVisibleText("Requirment");
       selectByValue.selectByVisibleText("Traceaility");
       selectByValue.selectByVisibleText("Defect Managament");
       selectByValue.selectByVisibleText("Travel Portal");
       selectByValue.selectByIndex(12);
       
       
       
	}

}
