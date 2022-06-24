package com.pdlucero.easybroker.client.feignclient;

import com.pdlucero.easybroker.client.dto.PropertyDTO;
import com.pdlucero.easybroker.client.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient( name = "easybroker-properties", url = "${easybroker.url}" )
public interface EasyBrokerPropertiesClient {

    @RequestMapping( method = RequestMethod.GET, value = "/properties" )
    ResponseDTO<List<PropertyDTO>> getProperties(
            @RequestHeader( value = "X-Authorization" ) String authorizationHeader,
            @RequestParam( "page" ) Integer page,
            @RequestParam( "limit" ) Integer limit
    );

}
