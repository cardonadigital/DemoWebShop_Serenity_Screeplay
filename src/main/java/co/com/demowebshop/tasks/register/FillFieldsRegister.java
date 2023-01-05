package co.com.demowebshop.tasks.register;

import co.com.demowebshop.models.Person;
import co.com.demowebshop.util.CreatePerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.log4j.Logger;

import java.util.Objects;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.RegisterPage.CONFIRMPASSWORD;
import static co.com.demowebshop.userinterfaces.RegisterPage.EMAIL;
import static co.com.demowebshop.userinterfaces.RegisterPage.FEMALE;
import static co.com.demowebshop.userinterfaces.RegisterPage.FIRSTNAME;
import static co.com.demowebshop.userinterfaces.RegisterPage.LASTNAME;
import static co.com.demowebshop.userinterfaces.RegisterPage.MALE;
import static co.com.demowebshop.userinterfaces.RegisterPage.PASSWORD;

public class FillFieldsRegister implements Task {
    private final Logger LOGGER = Logger.getLogger(FillFieldsRegister.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Person person = new CreatePerson().createPerson();
            actor.attemptsTo(
                    selectGender(person.getGender()),
                    scrollTo(FIRSTNAME),
                    Clear.field(FIRSTNAME),
                    Enter.theValue(person.getFirstName()).into(FIRSTNAME),
                    Clear.field(LASTNAME),
                    Enter.theValue(person.getLastName()).into(LASTNAME),
                    Clear.field(EMAIL),
                    Enter.theValue(person.getEmail()).into(EMAIL),
                    Clear.field(PASSWORD),
                    Enter.theValue(person.getPassword()).into(PASSWORD),
                    Clear.field(CONFIRMPASSWORD),
                    Enter.theValue(person.getPassword()).into(CONFIRMPASSWORD)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private Performable selectGender(String gender){
        if (Objects.equals(gender, "female")){
            scrollTo(FEMALE);
            return clickOn(FEMALE);
        }else {
            scrollTo(MALE);
            return clickOn(MALE);
        }
    }

    public static FillFieldsRegister fillFieldsRegister(){
        return new FillFieldsRegister();
    }
}
