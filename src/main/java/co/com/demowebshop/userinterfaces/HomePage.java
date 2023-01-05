package co.com.demowebshop.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target REGISTER = Target
            .the("Register")
            .located(By.xpath("//a[contains(text(), 'Register')]"));

    public static final Target APPARELANDSHOES = Target
            .the("ApparelAndShoes")
            .located(By.xpath("//a[contains(text(), 'Apparel')]"));

    public static final Target LOGIN = Target
            .the("Login")
            .located(By.className("ico-login"));

    public static final Target SHOPPINGCART = Target
            .the("ShopingCart")
            .located(By.className("ico-cart"));
}
