package co.com.demowebshop.tasks.homepage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.userinterfaces.HomePage.APPARELANDSHOES;

public class OpenApparelAndShoesPage implements Task {
    private final Logger LOGGER = Logger.getLogger(OpenApparelAndShoesPage.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    clickOn(APPARELANDSHOES)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    public static OpenApparelAndShoesPage openApparelAndShoesPage() {
        return new OpenApparelAndShoesPage();
    }
}
