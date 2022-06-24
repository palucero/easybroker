package com.pdlucero.easybroker.client.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {

    private String error;
    private PaginationDTO pagination;
    private T content;

}
