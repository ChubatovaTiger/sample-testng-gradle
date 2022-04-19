package com.chubatova.learning;

import org.testng.annotations.*;
import java.lang.*;

import static java.com.semuruga.learning.Config.TIMEOUT;

public class SampleTestNG {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void myFirstTest(){
        try
        {
            Thread.sleep(TIMEOUT);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        System.out.print("myFirstTest");
    }

}