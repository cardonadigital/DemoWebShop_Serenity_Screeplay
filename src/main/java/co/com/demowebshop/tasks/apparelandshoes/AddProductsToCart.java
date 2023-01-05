package co.com.demowebshop.tasks.apparelandshoes;

import co.com.demowebshop.userinterfaces.ApparelAndShoesPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.log4j.Logger;

import java.util.List;

import static co.com.demowebshop.interactions.Click.clickOn;
import static co.com.demowebshop.interactions.Scroll.scrollTo;
import static co.com.demowebshop.userinterfaces.ApparelAndShoesPage.PRODUCT1;
import static co.com.demowebshop.userinterfaces.ApparelAndShoesPage.PRODUCT2;
import static co.com.demowebshop.userinterfaces.ApparelAndShoesPage.PRODUCT3;
import static co.com.demowebshop.userinterfaces.ApparelAndShoesPage.PRODUCT4;
import static co.com.demowebshop.userinterfaces.HomePage.APPARELANDSHOES;
import static co.com.demowebshop.userinterfaces.ProductPage.ADDTOCARTPRODUCT;

public class AddProductsToCart implements Task {
    private final Logger LOGGER = Logger.getLogger(AddProductsToCart.class);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    scrollTo(PRODUCT1),
                    clickOn(PRODUCT1),
                    scrollTo(ADDTOCARTPRODUCT),
                    clickOn(ADDTOCARTPRODUCT),
                    clickOn(APPARELANDSHOES),
                    scrollTo(PRODUCT2),
                    clickOn(PRODUCT2),
                    scrollTo(ADDTOCARTPRODUCT),
                    clickOn(ADDTOCARTPRODUCT),
                    clickOn(APPARELANDSHOES),
                    scrollTo(PRODUCT3),
                    clickOn(PRODUCT3),
                    scrollTo(ADDTOCARTPRODUCT),
                    clickOn(ADDTOCARTPRODUCT),
                    clickOn(APPARELANDSHOES),
                    scrollTo(PRODUCT4),
                    clickOn(PRODUCT4),
                    scrollTo(ADDTOCARTPRODUCT),
                    clickOn(ADDTOCARTPRODUCT),
                    clickOn(APPARELANDSHOES)
            );
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }

    }

    public static AddProductsToCart addProductsToCart() {
        return new AddProductsToCart();
    }
}
