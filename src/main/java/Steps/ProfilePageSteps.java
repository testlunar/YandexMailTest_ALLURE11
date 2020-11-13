package Steps;

import Pages.LoginPage;
import Pages.ProfilePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageSteps {

    public static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    @Step("Получаем имя пользователя из меню пользователя")
    public String getName(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'user-account__name')]")));
        String name = new ProfilePage().getUserName();
        return name;
    }
    @Step("Нажимаем кнопку меню пользователя")
    public void clickMenu(){
        new ProfilePage().entryMenu();
    }
    @Step("Нажимаем кнопку выхода из аккаунта")
    public void exitMenu( ){
        new ProfilePage().userLogout();
    }

}
