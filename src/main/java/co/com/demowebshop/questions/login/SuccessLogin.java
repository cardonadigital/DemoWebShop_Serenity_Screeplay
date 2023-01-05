package co.com.demowebshop.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.demowebshop.userinterfaces.LoginPage.USERNAME;
import static co.com.demowebshop.userinterfaces.SuccessOrderPage.SUCCESSORDER;

public class SuccessLogin implements Question<Boolean> {
    private String username;

    public SuccessLogin is(String username){
        this.username = username;
        return this;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (USERNAME.resolveFor(actor).containsText(username));
    }


    public static SuccessLogin successLogin() {
        return new SuccessLogin();
    }
}
