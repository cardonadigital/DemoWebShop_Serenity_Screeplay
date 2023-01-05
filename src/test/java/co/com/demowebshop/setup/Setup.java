package co.com.demowebshop.setup;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static co.com.demowebshop.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {
    protected static final Logger LOGGER = Logger.getLogger(Setup.class);

    @Managed()
    protected WebDriver browser;

    protected void actorSetupTheBrowser(String actorName) {
        try {
            setupBrowser(browser);
            setupUser(actorName, browser);
            setUpLog4j2();
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private void setupBrowser(WebDriver browser) {
        try {
            browser.manage().deleteAllCookies();
            browser.manage().window().maximize();
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private void setUpLog4j2() {
        try {
            PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private void setupUser(String name, WebDriver driver) {
        try {
            OnStage.setTheStage(new OnlineCast());
            theActorCalled(name).can(BrowseTheWeb.with(driver));
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }
}
