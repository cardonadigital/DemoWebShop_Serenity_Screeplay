package co.com.demowebshop.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.log4j.Logger;

import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.LoginPage.EMAIL;
import static co.com.demowebshop.userinterfaces.LoginPage.PASSWORD;


public class FillFieldsLogin implements Task {
    private final Logger LOGGER = Logger.getLogger(FillFieldsLogin.class);
    private String email;
    private String password;

    public FillFieldsLogin setEmail(String email) {
        this.email = email;
        return this;
    }

    public FillFieldsLogin setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(EMAIL),
                    Clear.field(EMAIL),
                    Enter.theValue(email).into(EMAIL),
                    scrollTo(PASSWORD),
                    Clear.field(PASSWORD),
                    Enter.theValue(password).into(PASSWORD)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }


    public static FillFieldsLogin fillFieldsLogin() {
        return new FillFieldsLogin();
    }
}
