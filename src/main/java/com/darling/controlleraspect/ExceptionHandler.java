package com.darling.controlleraspect;

import com.darling.GirlException;
import com.darling.domain.Result;
import com.darling.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ling on 17-10-29.
 */
@ControllerAdvice
public class ExceptionHandler {


    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException)e;
            return ResultUtils.error(girlException.getCode(),girlException.getMessage());
        }else{
            return ResultUtils.error(-1,e.getMessage());
        }
    }
}
