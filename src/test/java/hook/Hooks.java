package hook;

import io.cucumber.java.AfterStep;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("Starting Scenario....");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("Execute Step..");
    }

    @After
    public void afterScenario(){
        System.out.println("Scenario Finished!");
    }
}
