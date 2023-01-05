package co.com.demowebshop.tasks.homepage;

import co.com.demowebshop.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.apache.log4j.Logger;

public class OpenHomePage implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenHomePage.class);
    private HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Open.browserOn(homePage)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenHomePage openHomePage(){
        return new OpenHomePage();
    }
}
