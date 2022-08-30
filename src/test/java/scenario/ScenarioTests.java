package scenario;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ScenarioTests extends BaseTests {

    @Test
    public void testTask2(){
        homePage.Wait(30);
        homePage.chooseTheTrip();
        homePage.Wait(30);
        homePage.chooseTheTrip();
        homePage.setDate();
        homePage.Wait(30);
        var tripsPage = homePage.pressSearchBtn();
        homePage.Wait(30);
        var seatPage = tripsPage.pressSelectSeats();
        homePage.Wait(30);
        seatPage.FillPageDetails();
        homePage.Wait(30);
        var paymentPage = seatPage.pressMakePayment();
        paymentPage.FillPaymentForm();
        assertEquals(paymentPage.getCardNumber(),"4024-0071-9736-9282","Invalid Card Number");
        assertEquals(paymentPage.getCardHolderName(),"ABDALLAH MOHAMED HAMDY","Invalid Holder Name");

    }
}
