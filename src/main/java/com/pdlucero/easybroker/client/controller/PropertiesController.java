package com.pdlucero.easybroker.client.controller;

import com.pdlucero.easybroker.client.dto.RequestPropertiesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( path = "/properties" )
public interface PropertiesController {

    @GetMapping
    ResponseEntity getProperties( RequestPropertiesDTO requestProperties );

}
