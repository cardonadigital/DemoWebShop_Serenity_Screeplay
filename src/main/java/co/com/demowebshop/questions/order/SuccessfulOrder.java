package co.com.demowebshop.questions.order;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demowebshop.userinterfaces.SuccessOrderPage.SUCCESSORDER;

public class SuccessfulOrder implements Question<Boolean> {
    private String message;

    public SuccessfulOrder is(String message){
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (SUCCESSORDER.resolveFor(actor).containsText(message));
    }

    public static SuccessfulOrder successfulOrder() {
        return new SuccessfulOrder();
    }
}
