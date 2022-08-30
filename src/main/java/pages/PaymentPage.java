package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PaymentPage {
    private WebDriver driver;
    private By cardNumber = By.xpath("//input[@placeholder='Enter card number']");
    private By month = By.xpath("//select[@name='expmon']");
    private By year = By.xpath("//select[@name='expyr']");
    private By cvv = By.xpath("//input[@type='password']");
    private By name = By.xpath("//input[@placeholder='Enter card holder name']");


    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public void FillPaymentForm(){
        driver.findElement(cardNumber).sendKeys("4024007197369282");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        selectFromDropDownM("01");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        selectFromDropDownY("2032");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(cvv).sendKeys("995");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(name).sendKeys("ABDALLAH MOHAMED HAMDY");
    }
    private Select findMonthDropDown(){
        return new Select(driver.findElement(month));
    }
    public void selectFromDropDownM(String value){
        findMonthDropDown().selectByValue(value);
    }
    private Select findYearDropDown(){
        return new Select(driver.findElement(year));
    }
    public void selectFromDropDownY(String value){
        findYearDropDown().selectByVisibleText(value);
    }
    public String getCardNumber(){
        return driver.findElement(cardNumber).getAttribute("value");
    }
    public String getCardHolderName(){
        return driver.findElement(name).getAttribute("value");
    }


}
