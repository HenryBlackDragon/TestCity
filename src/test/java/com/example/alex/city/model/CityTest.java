package com.example.alex.city.model;

import org.junit.*;

import static org.junit.Assert.*;

public class CityTest {

    private City city;

    @Before
    public void setUp() throws Exception {
        city = new City("test1");
    }

    @After
    public void tearDown() throws Exception {
        city = null;
    }

    @Test
    public void getName() throws Exception {
        assertEquals("test1", city.getName());
    }

    @Test
    public void setName() throws Exception {
        city.setName("test2");
        assertEquals("test2", city.getName());
    }

}