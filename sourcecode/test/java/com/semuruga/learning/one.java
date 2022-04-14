package com.semuruga.learning;

import org.testng.annotations.*;

public class one {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void oneTest() {
        System.out.print("myFirstTest");
    }

}
