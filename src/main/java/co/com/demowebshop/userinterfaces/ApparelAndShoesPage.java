package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApparelAndShoesPage extends PageObject {
    public static final Target PRODUCT1 = Target
            .the("Product1")
            .located(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a"));

    public static final Target PRODUCT2 = Target
            .the("Product2")
            .located(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a"));

    public static final Target PRODUCT3 = Target
            .the("Product3")
            .located(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a"));

    public static final Target PRODUCT4 = Target
            .the("Product4")
            .located(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a"));
}
