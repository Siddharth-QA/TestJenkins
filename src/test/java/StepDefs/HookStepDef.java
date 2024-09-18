package StepDefs;

import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookStepDef {
    @Before
    public void before(Scenario scenario) {
        BasePage.initializeBrowser();
    }
    @After
    public void after(Scenario scenario) {
        BasePage.quitBrowser();
    }
}
