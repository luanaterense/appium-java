package org.example.pocjunitappium.Support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class Screenshot {

    public static void salvarScreenshot(AppiumDriver driver, String arquivo) {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception e) {
            System.out.println("Houveram problemas ao copiar o arquivo para a pasta: " + e.getMessage());
        }
    }
}
