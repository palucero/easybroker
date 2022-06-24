package com.pdlucero.easybroker.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaginationDTO {

    private Integer limit;
    private Integer page;
    private Integer total;
    @JsonProperty( "next_page" )
    private String nextPage;

}
