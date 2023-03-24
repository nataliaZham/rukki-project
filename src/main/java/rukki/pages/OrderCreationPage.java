package rukki.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


/**
 * This class contains all Create order page locators and methods.
 */
public class OrderCreationPage extends Page {

    protected static By myProfileBtn = By.xpath("//*[@id='navbar']/div/div[3]/div[1]");
    protected static By exitBtn = By.xpath("//li[2]/span[@class='ant-dropdown-menu-title-content']");
    protected static By vehicleSelectBtn = By.cssSelector(".sc-hCDzWh > .sc-keNpes:nth-child(2) .text");
    protected static By specificVehicleSelectBtn = By.xpath("//div[@class='sc-DJmSI cudPhh']/div[1]");
    protected static By addressSelectBtn = By.cssSelector(".sc-hCDzWh > .sc-keNpes:nth-child(3) .text");
    protected static By addressInputField = By.cssSelector("input:nth-child(2)");
    protected static By selectSpecificAddress = By.xpath("//div[@class='sc-fYHEnZ bnPSaC']/div[1]");
    protected static By makeOrderBtn = By.xpath("//button[@class='sc-gSAPjG bGTuPI']");

    //methods
    public void checkAuthorization() {
        $(myProfileBtn).click();
        $(exitBtn).shouldHave(Condition.text("Выйти"));
    }

    public void chooseVehicle() {
        $(vehicleSelectBtn).click();
        sleep(3000);
        $(specificVehicleSelectBtn).click();
    }

    public void chooseAddress() {
        $(addressSelectBtn).click();
        $(addressInputField).setValue(TEST_CITY);
        $(selectSpecificAddress).click();
    }

    public OrderPage clickOnMakeOrderBtn() {
        $(makeOrderBtn).click();
        return page(OrderPage.class);
    }

}
