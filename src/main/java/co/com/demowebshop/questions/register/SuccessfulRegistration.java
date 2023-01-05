package co.com.demowebshop.questions.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demowebshop.userinterfaces.RegisterPage.REGISTRATIONCOMPLETE;

public class SuccessfulRegistration implements Question<Boolean> {
    private String message;

    public SuccessfulRegistration is(String message){
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (REGISTRATIONCOMPLETE.resolveFor(actor).containsText(message));
    }

    public static SuccessfulRegistration successfulRegistration() {
        return new SuccessfulRegistration();
    }


}
