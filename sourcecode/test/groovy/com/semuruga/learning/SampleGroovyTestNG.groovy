package com.semuruga.learning

import org.testng.annotations.*

class SampleGroovyTestNG {

    @Test
    void myGroovyTestNGFirstTest() {
        assert 1 == 1
        println "This is myGroovyTestNGFirstTest"
    }
}
