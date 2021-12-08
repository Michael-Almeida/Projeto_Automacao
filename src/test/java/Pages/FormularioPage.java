package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormularioPage {

    private WebDriver driver;

    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getName(){
        return driver.findElement(By.xpath(""));
    }
}
