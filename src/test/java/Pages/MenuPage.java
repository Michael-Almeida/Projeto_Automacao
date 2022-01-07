package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFormLink() {

        return driver.findElement(By.xpath("div[@class='col s3']/ul[@class='collapsible collapsible-accordion']/li/a[@class='collapsible-header ']"));
    }

    public WebElement getCriarUsuarioLink() {

        return driver.findElement(By.xpath("//div[@class='col s3']/ul[@class='collapsible collapsible-accordion']/li[@class='bold active']/div[@class='collapsible-body']/ul/li/a[@href='/users/new']"));
    }

    public WebElement getTextTitle() {

        return driver.findElement(By.xpath("//div[@class='col s3']/h4"));
    }


}
