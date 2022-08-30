package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class seatPage {
    private WebDriver driver;

    private By broadingPoint = By.xpath("//li[@value='1467550949362']");
    private By droppingPoint = By.xpath("//li[@value='1467467616730']");
    private By mobileField = By.xpath("//input[@name='mobileNo']");
    private By emailField = By.xpath("//input[@name='email']");
    private By seatNumber1 = By.xpath("//li[@title='24(W,S)']");
    private By seatNumber2 = By.xpath("//li[@title='30(A,S)']");
    private By name = By.xpath("//input[@placeholder='Name']");
    private By gender = By.xpath("//select[@name='genderCodeId']");
    private By age = By.xpath("//input[@placeholder='Age']");
    private By selectConcessions = By.xpath("//select[@name='concessionIds']");
    private By makePayment = By.xpath("//input[@title='Make Payment']");


    public seatPage(WebDriver driver){
        this.driver = driver;
    }

    public void FillPageDetails(){
        driver.findElement(broadingPoint).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(droppingPoint).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(mobileField).sendKeys("6789125987");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(emailField).sendKeys("vois_2022@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try{
            driver.findElement(seatNumber1).click();
        }
        catch (Exception e){
            driver.findElement(seatNumber2).click();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(name).sendKeys("Abdallah");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(gender).sendKeys(Keys.ARROW_DOWN);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(age).sendKeys("30");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(selectConcessions).sendKeys(Keys.ARROW_DOWN);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public PaymentPage pressMakePayment(){
        driver.findElement(makePayment).click();
        return new PaymentPage(driver);
    }
}
