package com.semuruga.learning;

import org.testng.annotations.*;

public class three {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void threeTest() {
        System.out.print("myFirstTest");
    }

}
