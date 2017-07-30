package com.example.alex.city.service;

import com.example.alex.city.model.City;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Override
    public List<City> getListCity(String filePath) {
        List<City> listCity = new ArrayList<>();
        File file = null;
        if (filePath != null && new File(filePath).canExecute()) {
            file = new File(filePath);
        } else {
            URL url = getClass().getClassLoader().getResource("cities.txt");
                file = new File(url.getFile());
        }
        try {
            BufferedReader bfdReader = new BufferedReader(new FileReader(file));
            String str;
            while ((str = bfdReader.readLine()) != null) {
                listCity.add(new City(str));
            }
            bfdReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCity;
    }

}
