package Steps;

import Pages.LoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginSteps {


        public static WebDriver driver;
        public static WebDriver getDriver(){
            return driver;
        }

    @Step("Вводим логин")
    public void loginInput(String login){
        new LoginPage().inputLogin(login);
    }

    @Step("Вводим пароль")
    public void passwdInput(String passwd){
        new LoginPage().inputPasswd(passwd);
    }

    @Step("Кликаем 'войти'")
    public void click(){
        new LoginPage().clickLoginBtn();
    }

}
