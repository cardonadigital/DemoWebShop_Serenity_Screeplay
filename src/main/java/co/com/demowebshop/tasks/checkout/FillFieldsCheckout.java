package co.com.demowebshop.tasks.checkout;

import co.com.demowebshop.interactions.ClickElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;

import static co.com.demowebshop.interactions.ClickElements.clickElements;
import static co.com.demowebshop.userinterfaces.CheckoutPage.CONFIRMORDER;
import static co.com.demowebshop.userinterfaces.CheckoutPage.continuesButton;
import static net.serenitybdd.core.Serenity.getDriver;

public class FillFieldsCheckout implements Task {
    private final Logger LOGGER = Logger.getLogger(FillFieldsCheckout.class);


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    clickElements().setWebElements(continuesButton(actor)),
                    Scroll.to(CONFIRMORDER),
                    Click.on(CONFIRMORDER)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }


    public static FillFieldsCheckout fillFieldsCheckout() {
        return new FillFieldsCheckout();
    }
}
