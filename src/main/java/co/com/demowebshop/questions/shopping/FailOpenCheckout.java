package co.com.demowebshop.questions.shopping;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demowebshop.userinterfaces.ShoppingCartPage.ALERTTERMOFSERVICE;
import static co.com.demowebshop.userinterfaces.SuccessOrderPage.SUCCESSORDER;

public class FailOpenCheckout implements Question<Boolean> {
    private static String message;

    public FailOpenCheckout is(String message){
        this.message = message;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (ALERTTERMOFSERVICE.resolveFor(actor).containsText(message));
    }

    public static FailOpenCheckout failOpenCheckout() {
        return new FailOpenCheckout();
    }
}
