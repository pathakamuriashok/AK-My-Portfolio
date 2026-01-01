package MyPortfolio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunIndexfile 
{
	WebDriver driver;
  @Test
  public void RunnerFile()
  {
	  String userDirectory=System.getProperty("user.dir");
	  WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(userDirectory+"\\src\\main\\java\\MyPortfolio\\index.html");
      
  }
}
