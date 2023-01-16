package org.example.pocjunitappium.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.example.pocjunitappium.Page.ScreenLoginPage;
import org.example.pocjunitappium.Support.GeradorDataHora;
import org.example.pocjunitappium.Support.Screenshot;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class ScreenLoginTest {
    private static ScreenLoginPage screenLogin;
    private Screenshot screenshot;

    private GeradorDataHora geradorDataHora;
    private static AppiumDriver<RemoteWebElement> driver;

    @Rule
    public TestName test = new TestName();

    @BeforeClass
    public static void caps() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", new File("apps/app-release.apk"));
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard", true);
        driver = new AndroidDriver<RemoteWebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        screenLogin = new ScreenLoginPage(driver);}

    @Test
    public void loginTest(){
        screenLogin.logar();

        String file = "evidências/" + GeradorDataHora.gerarDataHora() + ".png";
        screenshot.salvarScreenshot(driver, file);
    }

}
