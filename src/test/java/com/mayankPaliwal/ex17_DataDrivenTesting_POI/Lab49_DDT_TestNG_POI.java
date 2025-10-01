package com.mayankPaliwal.ex17_DataDrivenTesting_POI;

import com.mayankPaliwal.utils.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab49_DDT_TestNG_POI {
    // First we see how we fetch a data

    @Test(dataProvider = "getData")
    public void test_login_VWO(String email, String password){
        System.out.println("Running");
        System.out.println(email+" --- "+password);
        System.out.println();

    }

    //

    @DataProvider
    public Object[][] getData(){
        // so we need similar kind of thing to read data from excel file
        // and convert that data in 2d array
        // return that array
        return UtilExcel.getData("sheet1");
    }
}
