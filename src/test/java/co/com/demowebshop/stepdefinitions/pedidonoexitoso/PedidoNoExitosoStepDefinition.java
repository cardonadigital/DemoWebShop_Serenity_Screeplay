package co.com.demowebshop.stepdefinitions.pedidonoexitoso;

import co.com.demowebshop.exceptions.TextDontMatch;
import co.com.demowebshop.setup.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.demowebshop.questions.login.SuccessLogin.successLogin;
import static co.com.demowebshop.questions.shopping.FailOpenCheckout.failOpenCheckout;
import static co.com.demowebshop.tasks.apparelandshoes.AddProductsToCart.addProductsToCart;
import static co.com.demowebshop.tasks.homepage.OpenApparelAndShoesPage.openApparelAndShoesPage;
import static co.com.demowebshop.tasks.homepage.OpenHomePage.openHomePage;
import static co.com.demowebshop.tasks.homepage.OpenLoginPage.openLoginPage;
import static co.com.demowebshop.tasks.homepage.OpenShoppingCartPage.openShoppingCartPage;
import static co.com.demowebshop.tasks.login.FillFieldsLogin.fillFieldsLogin;
import static co.com.demowebshop.tasks.login.SendLogin.sendLogin;
import static co.com.demowebshop.tasks.shoppingcart.ErrorOpenCheckout.errorOpenCheckout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PedidoNoExitosoStepDefinition extends Setup {
    private static final String ACTOR_NAME = "Pepe";
    private static final String USER_NAME = "melo12345@gmail.com";


    @Dado("el usuario ingresa al modulo de login")
    public void elUsuarioIngresaAlModuloDeLogin() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openHomePage()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Cuando("ingresa el usuario: {string} y la contraseña: {string}")
    public void ingresaElUsuarioYLaContraseña(String email, String password) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    openLoginPage(),
                    fillFieldsLogin()
                            .setEmail(email)
                            .setPassword(password),
                    sendLogin()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Entonces("podrá ingresar con la cuenta correspondiente")
    public void podráIngresarConLaCuentaCorrespondiente() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            successLogin().is(USER_NAME), equalTo(true)
                    )
            );
        } catch (Exception e) {
            Assertions.fail(e.getMessage(), e);
            LOGGER.warn(e.getMessage(), e);
        }
    }


    @Dado(": el usuario previamente registrado")
    public void elUsuarioPreviamenteRegistrado() {
        try {
            theActorInTheSpotlight().wasAbleTo(
                    openApparelAndShoesPage()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Cuando(": agregue {int} productos al carrito de compras")
    public void agregueProductosAleatoriosAlCarritoDeCompras(int products) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    addProductsToCart()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Y(": no acepte los términos y condiciones")
    public void noAcepteLosTérminosYCondiciones() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    openShoppingCartPage(),
                    errorOpenCheckout()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Entonces(": el sistema deberá mostrar el siguiente mensaje: {string}")
    public void elSistemaDeberáMostrarElSiguienteMensaje(String message) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            failOpenCheckout().is(message), equalTo(true)
                    ).orComplainWith(
                            TextDontMatch.class,
                            "texto esperado: " + message
                    )
            );
        } catch (Exception e) {
            Assertions.fail(e.getMessage(), e);
            LOGGER.warn(e.getMessage(), e);
        }
    }
}
