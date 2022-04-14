package com.semuruga.learning;

import org.testng.annotations.*;

public class six {

    @BeforeClass
    void setupClass() {
        System.out.print("Setup Class");
    }

    @AfterClass
    void afterClass() {
        System.out.print("After Class");
    }

    @Test
    void sixTest() {
        System.out.print("myFirstTest");
    }

}
