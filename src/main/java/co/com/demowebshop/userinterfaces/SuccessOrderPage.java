package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessOrderPage extends PageObject {
    public static final Target SUCCESSORDER = Target.the("SuccessOrder").located(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong"));
    public static final Target CONTINUE = Target.the("Continue").located(By.className("order-completed-continue-button"));
}
