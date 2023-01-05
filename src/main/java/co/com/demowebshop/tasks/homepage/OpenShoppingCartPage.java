package co.com.demowebshop.tasks.homepage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.HomePage.SHOPPINGCART;

public class OpenShoppingCartPage implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenShoppingCartPage.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(SHOPPINGCART),
                    clickOn(SHOPPINGCART)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenShoppingCartPage openShoppingCartPage() {
        return new OpenShoppingCartPage();
    }
}
