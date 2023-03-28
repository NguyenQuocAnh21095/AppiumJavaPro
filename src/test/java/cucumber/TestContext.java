package cucumber;

import managers.PageObjectManager;
import managers.DriverManager;

import java.io.IOException;

public class TestContext {
    private DriverManager driverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        driverManager = new DriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}