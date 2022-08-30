package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private By trip = By.xpath("//a[normalize-space()='Chikkamagaluru - Bengaluru']");
    private By dateOfDeparture = By.xpath("//input[@name='txtJourneyDate']");
    private By day30 = By.xpath("//a[normalize-space()='30']");
    private By searchForBusBtn = By.xpath("//button[normalize-space()='Search for Bus']");
    private By nextArrow = By.xpath("//section//a[1]//span[2]");



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void chooseTheTrip(){
        try {
            driver.findElement(trip).click();
        }
        catch (NoSuchElementException e){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(trip).click();
        }
    }
    public void setDate(){
        driver.findElement(dateOfDeparture).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(day30).click();
    }

    public tripsPage pressSearchBtn(){
        driver.findElement(searchForBusBtn).click();
        return new tripsPage(driver);
    }
    public void Wait(int secs) {
        driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
    }


}
