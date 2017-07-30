package com.example.alex.city.web;

import com.example.alex.city.controller.CityController;
import com.example.alex.city.model.City;
import com.example.alex.city.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CityWebServiceImplTest {

    @Mock
    private CityService mock;

    @InjectMocks
    private CityWebServiceImpl cityWebService;

    @Test
    public void getListCity() throws Exception {
        List<City> listTest = new ArrayList<>();
        when(mock.getListCity("filePath")).thenReturn(listTest);
        assertEquals(listTest, cityWebService.getListCity("filePath"));
        verify(mock).getListCity("filePath");
    }

}