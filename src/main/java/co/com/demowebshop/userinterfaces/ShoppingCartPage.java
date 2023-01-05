package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage extends PageObject {
    public static final Target TERMSOFSERVICE = Target.the("TermsOfService").located(By.id("termsofservice"));
    public static final Target CHECKOUT = Target.the("Checkout").located(By.id("checkout"));
    public static final Target ALERTTERMOFSERVICE = Target.the("Checkout").located(By.xpath("//*[@id=\"terms-of-service-warning-box\"]/p"));
}
