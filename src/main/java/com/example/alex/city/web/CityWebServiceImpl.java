package com.example.alex.city.web;

import com.example.alex.city.model.City;
import com.example.alex.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.example.alex.city.web.CityWebService")
public class CityWebServiceImpl implements CityWebService {

    @Autowired
    private CityService cityService;

    @Override
    public List<City> getListCity(@WebParam(name = "filePath") String filePath) {
        return cityService.getListCity(filePath);
    }

}

