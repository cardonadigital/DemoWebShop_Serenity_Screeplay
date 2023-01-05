package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    public static final Target ADDTOCARTPRODUCT = Target
            .the("AddToCartProduct")
            .located(By.xpath("//input[contains(@id, 'add-to-cart')]"));
}
