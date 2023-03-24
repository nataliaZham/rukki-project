package rukki.pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


/**
 * This class contains all Login page locators and methods.
 */
public class LoginPage extends Page {

    //locators
    protected static By phoneNumberField = By.xpath("//input[@class='sc-cOFTSb jrOaeA']");
    protected static By loginButton = By.xpath("//*[@id='recaptcha-container']");

    //methods
    public void enterPhoneNumber() {
        $(phoneNumberField).setValue(USER_PHONE_NUMBER);
        $(loginButton).click();

    }

    public OrderCreationPage enterPin(String pin) {
        SelenideElement pinInput = $(".pin-input");
        ElementsCollection pinFields = pinInput.$$(".pin-input__field");
        for (int i = 0; i < pin.length(); i++) {
            String digit = Character.toString(pin.charAt(i));
            pinFields.get(i).setValue(digit);
        }
        return page(OrderCreationPage.class);
    }

}
