package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target EMAIL = Target
            .the("Email")
            .located(By.className("email"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.className("password"));

    public static final Target SENDLOGIN = Target
            .the("SendLogin")
            .located(By.className("login-button"));

        public static final Target USERNAME = Target
            .the("UserName")
            .located(By.xpath("//a[contains(text(), 'melo123')]"));
}

