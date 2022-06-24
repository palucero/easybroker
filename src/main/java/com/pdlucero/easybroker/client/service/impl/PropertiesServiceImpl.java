package com.pdlucero.easybroker.client.service.impl;

import com.pdlucero.easybroker.client.dto.PropertyDTO;
import com.pdlucero.easybroker.client.dto.ResponseDTO;
import com.pdlucero.easybroker.client.feignclient.EasyBrokerPropertiesClient;
import com.pdlucero.easybroker.client.service.PropertiesService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class PropertiesServiceImpl implements PropertiesService {

    @Value( "${easybroker.authorization-header}" )
    private String authorizationHeader;
    private final EasyBrokerPropertiesClient easyBrokerPropertiesClient;

    @Override
    public List<PropertyDTO> listPropertiesByRange( Integer page, Integer limit ) {

        ResponseDTO<List<PropertyDTO>> response =
                easyBrokerPropertiesClient.getProperties( authorizationHeader, page, limit );

        return response.getContent();
    }

}
