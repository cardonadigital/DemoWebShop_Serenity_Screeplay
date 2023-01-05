package co.com.demowebshop.tasks.shoppingcart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.ShoppingCartPage.CHECKOUT;

public class ErrorOpenCheckout implements Task {
    private final Logger LOGGER = Logger.getLogger(ErrorOpenCheckout.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(CHECKOUT),
                    clickOn(CHECKOUT)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static ErrorOpenCheckout errorOpenCheckout() {
        return new ErrorOpenCheckout();
    }
}
