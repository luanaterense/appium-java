package org.example.pocjunitappium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;


public class ScreenLogin {
    public ScreenLogin(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"email\"]")
    private RemoteWebElement campoEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"senha\"]")
    private RemoteWebElement campoSenha;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"entrar\"]/android.widget.TextView")
    private RemoteWebElement botaoLogar;

    public void logar() {
        campoEmail.sendKeys("qazando@gmail.com");
        campoSenha.sendKeys("1234");
        botaoLogar.click();

    }
}
