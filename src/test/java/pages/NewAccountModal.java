package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;

public class NewAccountModal {
    WebDriver driver;
    public NewAccountModal(WebDriver driver) {
        this.driver = driver;
    }
    public void create(String accountName, String website){
        //driver.findElement(By.xpath("//span[text()='Account Name']/ancestor::div[contains(@class, 'uiInput')]//input")).sendKeys("Irina");
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Website").write(website);
    }
    public void save(){
        driver.findElement(By.cssSelector("[title='Save']")).click();
    }
}
