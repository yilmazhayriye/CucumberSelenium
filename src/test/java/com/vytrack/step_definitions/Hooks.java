package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before

    public void setUp() {

        System.out.println("This is coming from BEFORE");
    }

    @After

    public void tearDown() {
        System.out.println("This is coming from AFTER");
    }

    @Before("@db")

    public void setUpDb() {
        System.out.println("Database BEFORE");
    }
    @After("@db")

    public void tearDownDb() {
        System.out.println("Database AFTER");
    }
}
