package FrameWork.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Report {

    //Classe de configuração do HTML

    public static WebDriver driver;
    public static String PATH_REPORT = System.getProperty("user.dir") + File.separator + "Report_" + DateTime.getDateTimeFormat();
    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static void setExtentReports() {

        CreateFolder.createFolderReport(PATH_REPORT);

        sparkReporter = new ExtentSparkReporter(PATH_REPORT + File.separator + "Execucao_" + DateTime.getDateTimeFormat() + ".html");

        sparkReporter.config().setDocumentTitle("Relatório de execução de Testes automatizados");
        sparkReporter.config().setReportName("Relatório de Execução Cadastro Site do Batista");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setEncoding("UTF-8");
        sparkReporter.config().setTimeStampFormat(" EEE , MMM , dd , yyy , hh:mm a '('zzz')");

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    //Start report do relatório

    public static void startReport(String testName) {

        extentTest = extentReports.createTest(testName);
    }

    //End Report do relatório
    public static void endReport() {

        extentReports.flush();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
