package mavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNG {

  @Test
  public void samepleTestMethod() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://demo.automationtesting.in");
    driver.findElement(By.id("email")).sendKeys("abcd@gamil.com");
    driver.findElement(By.id("enterimg")).click();
    Thread.sleep(3000);
    driver.quit();
  }

}
