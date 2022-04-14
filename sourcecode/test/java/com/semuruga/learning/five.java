package com.semuruga.learning;

import org.testng.annotations.*;

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
    void fiveTest() {
        System.out.print("myFirstTest");
    }

}
