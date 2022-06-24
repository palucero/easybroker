package com.pdlucero.easybroker.client.service;

import com.pdlucero.easybroker.client.dto.PropertyDTO;

import java.util.List;

public interface PropertiesService {

    List<PropertyDTO> listPropertiesByRange( Integer page, Integer limit );

}
