package Steps;

import Pages.LoginPage;
import Pages.ProfilePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

public class BaseSteps {

    //public static LoginPage loginPage;
    //public static ProfilePage profilePage;
    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    @Before

    public  void setup() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //loginPage = new LoginPage(driver);
        //profilePage = new ProfilePage(driver);
        //окно разворачивается на полный экран
        driver.get("https://passport.yandex.ru/auth");
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек

    }

    @After
    public  void tearDown() {
        driver.quit();
    }
}
