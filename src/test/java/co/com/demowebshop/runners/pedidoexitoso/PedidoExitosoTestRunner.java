package co.com.demowebshop.runners.pedidoexitoso;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/pedidoExitoso.feature"},
        glue = {"co.com.demowebshop.stepdefinitions.pedidoexitoso"},
        tags = "not @ignore"
)
public class PedidoExitosoTestRunner {
}
