package Taskes;

import FrameWork.Brownser.Waits;
import Pages.MenuPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MenuTask {

    private  WebDriver driver;
    private  MenuPage menuPage;
    private Waits waits;

    public MenuTask(WebDriver driver){

        this.driver= driver;
        menuPage = new MenuPage(this.driver);
        waits = new Waits(this.driver);
    }

    public void acessarFormularios(){
        validaPaginaForm();
        menuPage.getFormLink().click();
        waits.loadElement(menuPage.getCriarUsuarioLink());
        menuPage.getCriarUsuarioLink().click();
    }

    private void validaPaginaForm(){

        String text = menuPage.getTextTitle().getText();
        Assertions.assertEquals("Lista de Funcionalidades", text);
    }

}
