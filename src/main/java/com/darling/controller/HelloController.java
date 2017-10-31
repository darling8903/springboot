package com.darling.controller;

import com.darling.dao.GirlRepository;
import com.darling.domain.Girl;
import com.darling.domain.Result;
import com.darling.service.GirlService;
import com.darling.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by ling on 17-10-29.
 */
@RestController
public class HelloController {
    @Autowired
    GirlRepository girlRepository;
    @Autowired
    GirlService girlService;



    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public Result<Girl> AddGirl(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtils.error(500,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtils.success(girlRepository.save(girl));
    }

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public void showGirl(Girl girl) throws Exception {
        girlService.savegirl(girl);

    }
}
