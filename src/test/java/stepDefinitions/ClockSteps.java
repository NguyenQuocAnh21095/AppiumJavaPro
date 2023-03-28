package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import managers.DriverManager;
import managers.PageObjectManager;
import pageObjects.ClockPage;

import java.io.IOException;

public class ClockSteps {
    TestContext testContext;
    ClockPage clockPage;

    public ClockSteps(TestContext context){
        testContext = context;
        clockPage = testContext.getPageObjectManager().getClockPage();
    }
    @And("I open Clock app")
    public void I_open_Clock_app() throws IOException, InterruptedException {
        System.out.println("Clock App has started...");
        clockPage.click_Clock_tab();
    }

    @And("I add Amsterdam city clock")
    public void I_add_amsterdam_city_clock() throws InterruptedException {
        clockPage.add_Amsterdam_clock();
        clockPage.check_Amsterdam_clock();
    }
}
