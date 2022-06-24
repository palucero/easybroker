package com.pdlucero.easybroker.client.controller.impl;

import com.pdlucero.easybroker.client.controller.PropertiesController;
import com.pdlucero.easybroker.client.dto.PropertyDTO;
import com.pdlucero.easybroker.client.dto.RequestPropertiesDTO;
import com.pdlucero.easybroker.client.service.PropertiesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PropertiesControllerImpl implements PropertiesController {

    private final PropertiesService propertiesService;

    @Override
    public ResponseEntity<List<PropertyDTO>> getProperties( @Valid @RequestBody RequestPropertiesDTO requestProperties ) {
        List<PropertyDTO> response = propertiesService.listPropertiesByRange(
                requestProperties.getPage(),
                requestProperties.getLimit()
        );

        return new ResponseEntity<>( response, HttpStatus.OK );
    }

}
