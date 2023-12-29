package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {

    @Test
    @Disabled("Don´t run this test until I fix Jira #12345")
    void basicTests() {
         //Execute method and perform assertions
     }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForJava17() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForJava13() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max=JRE.JAVA_18)
    void testForJavaRange() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11)
    void testForJavaRangeMin() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV", matches = "DEV")
    void testForDevEnvironment() {
        //Execute method and perform assertions
    }

    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testForSystemProperty() {
        //Execute method and perform assertions
    }

}
