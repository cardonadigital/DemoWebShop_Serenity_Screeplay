package co.com.demowebshop.tasks.shoppingcart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.ShoppingCartPage.CHECKOUT;
import static co.com.demowebshop.userinterfaces.ShoppingCartPage.TERMSOFSERVICE;

public class OpenCheckout implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenCheckout.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(TERMSOFSERVICE),
                    clickOn(TERMSOFSERVICE),
                    scrollTo(CHECKOUT),
                    clickOn(CHECKOUT)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenCheckout openCheckout() {
        return new OpenCheckout();
    }
}
