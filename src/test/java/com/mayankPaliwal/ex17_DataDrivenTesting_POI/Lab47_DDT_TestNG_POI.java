package com.mayankPaliwal.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_TestNG_POI {


    // First we see how we fetch a data

    @Test(dataProvider = "getData")
    public void test_login_VWO(String email, String password,String expected){
        System.out.println("Running");
        System.out.println(email+" --- "+password+" --- "+expected);
        System.out.println();

    }

    //

    @DataProvider
    public Object[][] getData(){

        // this is hard coded but we dont do or want that generally data should not be hardcoded
        return new Object[][]{
                new Object[]{"admin@adin.com","pwd123","expected result"},
                new Object[]{"admin@adin.com","pwd123","expected result"},
                new Object[]{"admin@adin.com","pwd123","expected result"},
        };
    }
}
