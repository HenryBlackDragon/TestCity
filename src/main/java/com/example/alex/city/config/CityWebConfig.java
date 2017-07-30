package com.example.alex.city.config;

import com.example.alex.city.web.CityWebServiceImpl;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CityWebConfig {

    @Autowired
    private Bus bus;

    @Bean(name="cityWebServiceImpl")
    public CityWebServiceImpl getCityWebServiceImpl()
    {
        return new CityWebServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, getCityWebServiceImpl());
        endpoint.publish("/soap/city");
        return endpoint;
    }
}
