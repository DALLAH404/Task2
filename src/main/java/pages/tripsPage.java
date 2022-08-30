package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tripsPage {
    private WebDriver driver;
    private By selectSeatsBtn = By.xpath("(//input[@name='SrvcSelectBtnForward'])[2]");


    public tripsPage(WebDriver driver){
        this.driver = driver;
    }


    public seatPage pressSelectSeats(){
        driver.findElement(selectSeatsBtn).click();
        return new seatPage(driver);
    }
}
