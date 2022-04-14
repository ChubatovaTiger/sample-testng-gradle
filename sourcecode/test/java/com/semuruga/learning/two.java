package com.semuruga.learning;

import org.testng.annotations.*;

public class two {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void twoTest() {
        System.out.print("myFirstTest");
    }

}
