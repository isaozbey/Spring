package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Builder
public class ResponseWrapper {

    private boolean success;
    private String message;
    private Integer code;
    private Object data;

    public ResponseWrapper(String message, Object data, HttpStatus httpStatus) {
        this.success=true;
        this.message = message;
        this.data = data;
        this.code = httpStatus.value();
    }

    public ResponseWrapper(String message,HttpStatus httpStatus){
        this.message = message;
        this.code = httpStatus.value();
        this.success=true;
    }
}
