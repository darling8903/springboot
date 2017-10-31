package com.darling;

/**
 * Created by ling on 17-10-29.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Integer code, String message){
        super(message);
        this.code = code;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}

