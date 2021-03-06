package Taskes;

import FrameWork.Brownser.Waits;
import Pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomeTask {

    private static WebDriver driver;
    private static HomePage homePage;
    private static Waits waits;

    public HomeTask(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(this.driver);
        waits = new Waits(this.driver);
    }

    public void acessaPageAutomacaoWeb(){

        homeValidation();
        waits.loadElement(homePage.getStartButton());
        homePage.getStartButton().click();
    }


    private void homeValidation(){

        Assertions.assertTrue(homePage.getStartButton().isDisplayed());
    }
}
