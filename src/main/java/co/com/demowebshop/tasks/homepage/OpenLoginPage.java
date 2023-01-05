package co.com.demowebshop.tasks.homepage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.userinterfaces.HomePage.LOGIN;

public class OpenLoginPage implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenLoginPage.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    clickOn(LOGIN)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenLoginPage openLoginPage() {
        return new OpenLoginPage();
    }
}
