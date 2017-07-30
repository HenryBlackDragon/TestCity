package com.example.alex.city.service;

import com.example.alex.city.model.City;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CityServiceImplTest {

    private  CityService cityService;

    @Before
    public void setUp() throws Exception {
        cityService = new CityServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
        cityService = null;
    }

    @Test
    public void testGetListCity() throws Exception {
        List<City> listCity = cityService.getListCity(null);
        if(listCity.isEmpty()) fail();
    }

    @Test
    public void testSizeEquals() throws Exception {
        List<City> listCity = cityService.getListCity(null);
        assertEquals(listTest().size(),listCity.size());
    }

    @Test
    public void testArraysEquals() throws Exception {
        List<City> listCity = cityService.getListCity(null);

        for (int i = 0; i <listCity.size() ; i++) {
            assertEquals(listTest().get(i).getName(),listCity.get(i).getName());
        }
    }

    private List<City> listTest(){
        List<City> listTest = new ArrayList<>();
        URL url = getClass().getClassLoader().getResource("cities.txt");
        File file = new File(url.getFile());
        try {
            BufferedReader bfdReader = new BufferedReader(new FileReader(file));
            String str;
            while ((str = bfdReader.readLine()) != null) {
                listTest.add(new City(str));
            }
            bfdReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listTest;
    }

}