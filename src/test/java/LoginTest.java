package org.example;

import Pages.LoginPage;
import Pages.ProfilePage;
import Steps.BaseSteps;
import Steps.LoginSteps;
import Steps.ProfilePageSteps;
import io.qameta.allure.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;


public class LoginTest extends BaseSteps {


    LoginSteps loginSteps= new LoginSteps();
    ProfilePageSteps profilePageSteps= new ProfilePageSteps();

    @Epic("TESTING FOR Yandex mail")
    @Feature(value = "Tests for login")
    @Severity(SeverityLevel.BLOCKER)
    @Description("В этом тесте проверяется авторизация в почту и выход из нее")
    @Story(value = "Test for login with correct password")
    @Test
    public void loginTest() {

        loginSteps.loginInput(org.example.ConfProperties.getProperty("login"));
        //нажимаем кнопку входа
        loginSteps.click();
        //вводим пароль
        loginSteps.passwdInput(org.example.ConfProperties.getProperty("password"));
             //нажимаем кнопку входа
        loginSteps.click();
        //получаем отображаемый логин
        String user = profilePageSteps.getName();
        //и сравниваем его с логином из файла настроек
        Assert.assertEquals(org.example.ConfProperties.getProperty("login"), user);
        profilePageSteps.clickMenu();
        profilePageSteps.exitMenu();
    }


}