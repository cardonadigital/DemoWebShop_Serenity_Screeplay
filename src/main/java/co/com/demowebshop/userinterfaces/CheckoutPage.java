package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CheckoutPage extends PageObject {
    public static final Target CONFIRMORDER = Target.the("ConfirmOrder").located(By.xpath("//input[@value=\"Confirm\"]"));

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }

    public static List<WebElementFacade> continuesButton(Actor actor){
        return BrowseTheWeb
                        .as(actor)
                        .findAll(By.xpath("//input[@value=\"Continue\"]"));
    }

    public static CheckoutPage checkoutPage() {
        return new CheckoutPage();
    }
}
