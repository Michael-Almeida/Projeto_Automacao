package Taskes;

import Pages.FormularioPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {

    private WebDriver driver;
    private FormularioPage formularioPage;

    public FormTask(WebDriver driver) {

        this.driver = driver;

        formularioPage = new FormularioPage(this.driver);
    }

    public void preencherForm() {

        formularioPage.getName().sendKeys("João");
        formularioPage.getLastName().sendKeys("Silva");
        formularioPage.getEmailTextField().sendKeys("Teste@teste.com.br");
        formularioPage.getEnderecoTextField().sendKeys("Rua não sei");
        formularioPage.getUniversityTextField().sendKeys("fundatec");
        formularioPage.getProfissaoTextField().sendKeys("TI");
        formularioPage.getGeneroTextField().sendKeys("M");
        formularioPage.getIdadeTextField().sendKeys("28");
        formularioPage.getEnviarButton().click();
    }

    private void validarCriacaoUsuario(){

        String text = formularioPage.getMensagemTitle().getText();

        Assertions.assertEquals("Usuário criado com sucesso", text);
    }
}
