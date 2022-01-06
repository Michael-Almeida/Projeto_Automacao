package Testes;

import FrameWork.BaseTest;
import Taskes.FormTask;
import Taskes.HomeTask;
import Taskes.MenuTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CadastrarUsuarioTesteCase extends BaseTest {

    private WebDriver driver = this.getDriver();
    private HomeTask homeTask = new HomeTask(driver);
    private MenuTask menuTask = new MenuTask(driver);
    private FormTask formTask = new FormTask(driver);

    @Test
    public void realizarCadastro() {

        homeTask.acessaPageAutomacaoWeb();
        menuTask.acessarFormularios();
        formTask.preencherForm();

    }

}
