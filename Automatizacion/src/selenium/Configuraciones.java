package selenium;

import java.util.regex.Pattern;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Configuraciones {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    baseUrl = "http://sr-sigmafront-ad01/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testConfiguraciones() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Toggle navigation")).click();
    driver.findElement(By.linkText("Configuraci�n")).click();
    driver.findElement(By.linkText("Transponder")).click();
    driver.findElement(By.name("prefijo")).clear();
    driver.findElement(By.name("prefijo")).sendKeys("asdd");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    assertTrue(isElementPresent(By.linkText("Toggle navigation")));
    driver.findElement(By.linkText("Toggle navigation")).click();
    assertTrue(isElementPresent(By.xpath("//li[3]/a/span")));
    driver.findElement(By.linkText("Configuraci�n")).click();
    assertTrue(isElementPresent(By.linkText("Transponder")));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}