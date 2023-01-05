package co.com.demowebshop.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class ClickElements implements Interaction {
    private List<WebElementFacade> elements;

    @Override
    public <T extends Actor> void performAs(T actor) {
        elements.stream().forEach(element->{
            Scroll.to(element);
            element.click();
        });
    }

    public static ClickElements clickElements(){
        return new ClickElements();
    }

    public Performable setWebElements(List<WebElementFacade> elements){
        this.elements = elements;
        return this;
    }
}
