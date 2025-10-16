package hooks;

import io.cucumber.core.runtime.SingletonRunnerSupplier;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Hooks {

    private static final Logger log = LogManager.getLogger(Hooks.class);
    @Before("@UI")
    public void beforeUITest(){
        driver = Singleton.gerDriver();
        driver.manage().window().maximize();
    }
    @After("@UI")
    public void afterUITest(){
        Singleton.closeDriver();
    }
    @AfterStep("@UI")
    public void takeSreenShot(Scenario scenario){
        log.info("take a screenshot before steps");
        takeSreenShot(scenario, driver);
    }
}
