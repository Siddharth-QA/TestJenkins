package StepDefs;

import io.cucumber.java.en.When;

public class launchChromeStepDef extends BaseStepDef {

    @When("Launch chrome")
    public void setLaunchChrome() throws InterruptedException {
        launchChrome.launch();
        launchChrome.search();
    }
}
