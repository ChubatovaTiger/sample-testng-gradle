package com.chubatova.learning;

import org.testng.annotations.*;
import java.lang.*;

public class five {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void fiveTest(){
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
