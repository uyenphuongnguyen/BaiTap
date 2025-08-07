package JavaOOP_Bai3.Common;

public class BaseTest {

    public void createDriver() {

        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);

    }

    // Tính đa hình
    public void closeDriver(String browser) {

        System.out.println( "Closed browser: " + browser);

    }

    public void closeDriver() {

        System.out.println( "Closed browser: " + Constants.browser);

    }

}
