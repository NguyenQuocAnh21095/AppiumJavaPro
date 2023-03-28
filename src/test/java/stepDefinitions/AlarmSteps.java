package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import managers.PageObjectManager;
import pageObjects.AlarmPage;

public class AlarmSteps {
    TestContext testContext;
    AlarmPage alarmPage;

    public AlarmSteps(TestContext context){
        testContext = context;
        alarmPage = testContext.getPageObjectManager().getAlarmPage();
    }

    @And("I switch to Alarm tab")
    public void I_switch_to_alarm_tab() throws InterruptedException {
        alarmPage.setAlarm();
        alarmPage.checkAlarm();
    }
}
