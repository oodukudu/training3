package StepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hook {

    public static WebDriver driver;

    @Before
    public void setup()
    {
        //FireFox
        System.setProperty("webdriver.gecko.driver", "/Users/oyinodukudu/IdeaProjects/geckodriver");
        driver = new FirefoxDriver();

        //Chrome
        //System.setProperty("webdriver.chrome.driver", "/Users/oyinodukudu/IdeaProjects/chromedriver");
        //driver = new ChromeDriver();

        //InternetExplorer
        //driver = new InternetExplorerDriver();
    }

    @After
    public void afterScenario(Scenario scenario)
    {
        driver.close();
    }
}
