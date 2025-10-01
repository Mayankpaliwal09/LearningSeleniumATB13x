package com.mayankPaliwal.ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_DDT_TestNG_POI {

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
       // so we need similar kind of thing to read data from excel file
        // and convert that data in 2d array
        // return that array
        return null;
    }
}
