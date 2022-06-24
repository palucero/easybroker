package com.pdlucero.easybroker.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import java.util.Map;

@Data
public class RequestPropertiesDTO {

    @Min( value = 1, message = "page must be greater than or equal to 1." )
    private Integer page;
    @Min( value = 1, message = "limit must be greater than or equal to 1." )
    private Integer limit;
    @JsonProperty( "search[property_types]" )
    private String[] propertyTypes;
    @JsonProperty( "search[statuses]" )
    private String[] statuses;
    @JsonProperty( "object" )
    private Map<String, String> others;

}
