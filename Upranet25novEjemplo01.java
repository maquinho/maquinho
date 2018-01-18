package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upranet25novEjemplo01 {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
	
	  //driver = new FirefoxDriver ();
	  driver = new ChromeDriver();
    baseUrl = "http://www.upranet.com.ar/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUpranet25novEjemplo01() throws Exception {
    driver.get(baseUrl + "/_esp/");
    //
    driver.findElement(By.linkText("Quiénes Somos")).click();
    driver.findElement(By.xpath("//*[@id='menu-item-12']/a")).click();
    driver.findElement(By.linkText("Asociaciones")).click();
    driver.findElement(By.linkText("Idioma Polaco")).click();
    driver.findElement(By.id("s")).clear();
    driver.findElement(By.id("s")).sendKeys("curso");
    driver.findElement(By.cssSelector("input.searchsubmit")).click();
    driver.findElement(By.cssSelector("a[title=\"Contacto\"] > span")).click();
    driver.findElement(By.cssSelector("div.entry > p > a")).click();
    driver.findElement(By.cssSelector("div.fleft > a")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  @SuppressWarnings("unused")
private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  @SuppressWarnings("unused")
private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
