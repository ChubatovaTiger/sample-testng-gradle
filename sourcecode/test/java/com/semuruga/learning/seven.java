package com.semuruga.learning;

import org.testng.annotations.*;

public class seven {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void sevenTest() {
        System.out.print("myFirstTest");
    }

}
