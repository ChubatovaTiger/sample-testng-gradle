package com.semuruga.learning;

import org.testng.annotations.*;
import java.lang.*;

public class eight {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void eightTest() {

        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        System.out.print("myFirstTest");
    }

}
