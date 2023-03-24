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
public class LoginTest extends BaseTest {


    @Before
    public void openLoginPage() {
        loginPage = open(LOGIN_URL, LoginPage.class);
    }

    @Test
    public void loginWithValidCredentials() {
        loginPage.enterPhoneNumber();
        orderCreationPage = loginPage.enterPin(USER_PIN);
        orderCreationPage.checkAuthorization();
    }

}

