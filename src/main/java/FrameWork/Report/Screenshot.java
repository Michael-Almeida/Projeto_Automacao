package FrameWork.Report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    private static String PATH_SCREENSHOT = Report.PATH_REPORT + File.separator + "Screenshot";

    public static Media capture(WebDriver driver) {

        try {
            CreateFolder.createFolderReport(PATH_SCREENSHOT);
            File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenShotPath = PATH_SCREENSHOT + File.separator + "Imagem_" + DateTime.getDateTimeFormat() + ".png";
            FileUtils.copyFile(scrshot, new File(screenShotPath));
            return MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build();

        } catch (IOException e) {

            System.out.println("Erro ao copiar o arquivo " + e.getMessage());
        }
        return null;
    }
}
