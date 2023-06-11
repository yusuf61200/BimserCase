package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class AbstractClass {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));


    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }


    public void sendKeysFunction(WebElement sendKeysElement,String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void Assertion(WebElement actual,String expected){

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(expected,actual.getText());
        System.out.println("Doğrulandı.");

    }


    public void selectElementFromDropdown(WebElement dropdown,String element){

        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }




}
