package com.semuruga.learning;

import org.testng.annotations.*;

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
    void eightTest() {
        System.out.print("myFirstTest");
    }

}
