package com.pdlucero.easybroker.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OperationDTO {

    private String type;
    private Integer amount;
    @JsonProperty( "formated_amount" )
    private String formattedAmount;
    private String currency;
    private String unit;
    private String period;

}
