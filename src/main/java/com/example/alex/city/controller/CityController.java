package com.example.alex.city.controller;

import java.util.List;

import com.example.alex.city.model.City;
import com.example.alex.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.ws.rs.QueryParam;

@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<City> getCity(@QueryParam("filePath") String filePath) {
        return cityService.getListCity(filePath);
    }
}