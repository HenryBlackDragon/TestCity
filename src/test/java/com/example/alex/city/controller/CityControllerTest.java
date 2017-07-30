package com.example.alex.city.controller;

import com.example.alex.city.model.City;
import com.example.alex.city.service.CityService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CityControllerTest {

    @Mock
    private CityService mock;

    @InjectMocks
    private CityController cityController;

    @Test
    public void testGetCity() throws Exception {
        List<City> listTest = new ArrayList<>();
        when(mock.getListCity("filePath")).thenReturn(listTest);
        assertEquals(listTest, cityController.getCity("filePath"));
        verify(mock).getListCity("filePath");
    }
}