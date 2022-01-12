package Taskes;

import FrameWork.Brownser.Waits;
import FrameWork.Utils.FakerGeneration;
import Pages.FormularioPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {

    private WebDriver driver;
    private FormularioPage formularioPage;
    private Waits waits;
    private FakerGeneration fakerGeneration;

    public FormTask(WebDriver driver) {

        this.driver = driver;
        formularioPage = new FormularioPage(this.driver);
        waits = new Waits(this.driver);
        fakerGeneration = new FakerGeneration(this.driver);
    }

    public void preencherForm() {

        formularioPage.getName().sendKeys(fakerGeneration.getFirstName());
        formularioPage.getLastName().sendKeys(fakerGeneration.getLastName());
        formularioPage.getEmailTextField().sendKeys(fakerGeneration.getEmail());
        formularioPage.getEnderecoTextField().sendKeys(fakerGeneration.getAddress());
        formularioPage.getUniversityTextField().sendKeys(fakerGeneration.getUniversity());
        waits.loadElement(formularioPage.getProfissaoTextField());
        formularioPage.getProfissaoTextField().sendKeys(fakerGeneration.getProfession());
        formularioPage.getGeneroTextField().sendKeys(fakerGeneration.getGenre());
        formularioPage.getIdadeTextField().sendKeys(fakerGeneration.getAge());
        formularioPage.getEnviarButton().click();
        validarCriacaoUsuario();
    }

    private void validarCriacaoUsuario() {

        String text = formularioPage.getMensagemTitle().getText();

        Assertions.assertEquals("Usuário criado com sucesso", text);
    }
}
