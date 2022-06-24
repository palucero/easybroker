package com.pdlucero.easybroker.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class PropertyDTO {

    private String agent;
    @JsonProperty( "public_id" )
    private String publicId;
    private String title;
    @JsonProperty( "title_image_full" )
    private String titleImageFull;
    @JsonProperty( "title_image_thumb" )
    private String titleImageThumb;
    private Integer bedrooms;
    private Integer bathrooms;
    @JsonProperty( "parking_spaces" )
    private Integer parkingSpaces;
    private String location;
    @JsonProperty( "property_type" )
    private String propertyType;
    private List<OperationDTO> operations;
    @JsonProperty( "updated_at" )
    private Timestamp updatedAt;
    @JsonProperty( "show_prices" )
    private Boolean showPrices;

}
