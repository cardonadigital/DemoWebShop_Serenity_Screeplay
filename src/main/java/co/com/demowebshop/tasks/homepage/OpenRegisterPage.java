package co.com.demowebshop.tasks.homepage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.log4j.Logger;

import static co.com.demowebshop.userinterfaces.HomePage.REGISTER;

public class OpenRegisterPage implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenRegisterPage.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(REGISTER)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenRegisterPage openRegister(){
        return new OpenRegisterPage();
    }
}
