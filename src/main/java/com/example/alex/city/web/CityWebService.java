package com.example.alex.city.web;

import com.example.alex.city.model.City;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CityWebService {

    @WebMethod
    List<City> getListCity(@WebParam(name="filePath") String filePath);
}