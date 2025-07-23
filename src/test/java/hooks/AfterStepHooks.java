package hooks;

import com.codeborne.selenide.Selenide;
import gherkin.ast.Scenario;
import io.cucumber.java.AfterStep;


public class AfterStepHooks {

    @AfterStep
    public void takeScreenShotAfterStep(Scenario scenario) {
        Selenide.screenshot(System.currentTimeMillis() + "steps");
    }
}