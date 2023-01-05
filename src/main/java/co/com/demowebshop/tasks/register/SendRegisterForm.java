package co.com.demowebshop.tasks.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.RegisterPage.REGISTER;

public class SendRegisterForm implements Task {
    private final Logger LOGGER = Logger.getLogger(SendRegisterForm.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(REGISTER),
                    clickOn(REGISTER)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static SendRegisterForm sendRegisterForm(){
        return new SendRegisterForm();
    }
}
