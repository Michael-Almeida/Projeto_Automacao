package Pages;


import FrameWork.Brownser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private Waits waits;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
    }

    public WebElement getStartButton() {
       /*WebElement botao = driver.findElement(By.xpath("//div[@class='row col s12']/div[@class='col s6']/div[@id='index-banner']/div/div/a]"));
        return botao;*/

        return waits.visibilityofElement(By.xpath("//div[@class='row col s12']/div[@class='col s6']/div[@id='index-banner']/div/div/a"));
       //return driver.findElement(By.xpath("//div[@class='row col s12']/div[@class='col s6']/div[@id='index-banner']/div/div/a]"));

    }
}
