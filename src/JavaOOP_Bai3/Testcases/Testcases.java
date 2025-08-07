package JavaOOP_Bai3.Testcases;

import JavaOOP_Bai3.Common.BaseTest;

public class Testcases extends BaseTest {

    public void login() {

        createDriver();
        System.out.println("Enter email");
        System.out.println("Enter password");
        System.out.println("Click login button");
        closeDriver();

    }

    public void addCategory() {

        createDriver();
        //Login
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashbroad is display");
        //Add new category
        System.out.println("Click menu Product");
        System.out.println("Click menu Category");
        System.out.println("Verify redirect to Category page");
        System.out.println("Click add new category button");
        System.out.println("Enter form data to add new category");
        System.out.println("Click save button");
        System.out.println("Verify new category added successfully");
        System.out.println("Verify the new category information is correct");
        closeDriver();

    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.login();
        System.out.println("================================");
        testcases.addCategory();
    }

}
