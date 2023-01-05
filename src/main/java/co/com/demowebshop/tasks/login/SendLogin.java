package co.com.demowebshop.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.userinterfaces.LoginPage.SENDLOGIN;

public class SendLogin implements Task {
    private final Logger LOGGER = Logger.getLogger(SendLogin.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    clickOn(SENDLOGIN)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static SendLogin sendLogin() {
        return new SendLogin();
    }
}
