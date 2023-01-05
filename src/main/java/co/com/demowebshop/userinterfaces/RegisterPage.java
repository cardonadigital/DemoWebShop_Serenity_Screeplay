package co.com.demowebshop.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

public class RegisterPage extends PageObject {
    public static final Target MALE = Target
            .the("Male")
            .located(id("gender-male"));

    public static final Target FEMALE = Target
            .the("Female")
            .located(id("gender-female"));

    public static final Target FIRSTNAME = Target
            .the("FirstName")
            .located(id("FirstName"));

    public static final Target LASTNAME = Target
            .the("LastName")
            .located(id("LastName"));

    public static final Target EMAIL = Target
            .the("Email")
            .located(id("Email"));

    public static final Target PASSWORD = Target
            .the("Male")
            .located(id("Password"));

    public static final Target CONFIRMPASSWORD = Target
            .the("ConfirmPassword")
            .located(id("ConfirmPassword"));

    public static final Target REGISTER = Target
            .the("Register")
            .located(id("register-button"));

    public static final Target REGISTRATIONCOMPLETE = Target
            .the("Register")
            .located(className("result"));


}
