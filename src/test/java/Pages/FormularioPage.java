package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormularioPage {

    private WebDriver driver;

    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getName() {
        return driver.findElement(By.xpath(""));
    }

    public WebElement getLastName() {
        return driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_lastname']"));
    }

    public WebElement getEmailTextField() {

        return this.driver.findElement(By.id("user_email"));
    }

    public WebElement getEnderecoTextField() {

        return this.driver.findElement(By.id("user_address"));
    }

    public WebElement getUniversityTextField() {

        return this.driver.findElement(By.id("user_university"));
    }

    public WebElement getProfissaoTextField() {

        return this.driver.findElement(By.id("user_profile"));
    }

    public WebElement getGeneroTextField() {

        return this.driver.findElement(By.id("user_gender"));
    }

    public WebElement getIdadeTextField() {

        return this.driver.findElement(By.id("user_age"));
    }

    public WebElement getEnviarButton() {

        return this.driver.findElement(By.name("commit"));
    }

    public WebElement getMensagemTitle() {

        return this.driver.findElement(By.id("notice"));
    }


}
