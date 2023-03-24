package rukki.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


/**
 * This class contains all Create order page locators and methods.
 */
public class OrderPage extends Page {

    //locators
    protected static By orderStatus = By.xpath("//div[@class='process-steps']/div[1]/div[1]");

    //methods
    public void checkOrderStatus() {
        $(orderStatus).shouldHave(Condition.text(ORDER_CREATION_STATUS));
    }

}
