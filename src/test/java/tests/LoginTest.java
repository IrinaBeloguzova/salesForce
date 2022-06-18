package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.NewAccountModal;

import java.util.concurrent.TimeUnit;

@Test
public class LoginTest {
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://tms9.my.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("kotiqboniq-pdnf@force.com");
        driver.findElement(By.id("password")).sendKeys("!Irina4386");
        driver.findElement(By.id("Login")).click();

        driver.get("https://tms9.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        driver.findElement(By.cssSelector("a[title=New]")).click();

        NewAccountModal newAccountModal = new NewAccountModal(driver);
        newAccountModal.create("Irina1", "teachmeskills.by");
        newAccountModal.save();


        driver.quit();

    }
}
