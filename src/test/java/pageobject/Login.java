package pageobject;

import StepDefinitions.Hook;
import com.sun.org.apache.xpath.internal.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(how = How.ID, using ="email")
    private WebElement email;


    public void enterPassword()
    {
        password.sendKeys("adebola1");
    }

    public void enterEmail()
    {
        email.sendKeys("oyindamola_oluwaseun@yahoo.com");
    }
}
