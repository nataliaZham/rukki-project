package rukki;

import org.junit.Before;
import org.junit.Test;
import rukki.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static rukki.pages.Page.LOGIN_URL;
import static rukki.pages.Page.USER_PIN;

/**
 * This class contains login tests
 */
public class OrderCreationTest extends BaseTest {

    @Before
    public void makeAuthorization() {
        loginPage = open(LOGIN_URL, LoginPage.class);
        loginPage.enterPhoneNumber();
        orderCreationPage = loginPage.enterPin(USER_PIN);
        orderCreationPage.checkAuthorization();
    }

    @Test
    public void makeOrder() {
        orderCreationPage.chooseVehicle();
        orderCreationPage.chooseAddress();
        orderPage = orderCreationPage.clickOnMakeOrderBtn();
        orderPage.checkOrderStatus();
    }

}
