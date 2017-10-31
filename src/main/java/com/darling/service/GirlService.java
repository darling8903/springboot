package com.darling.service;

import com.darling.GirlException;
import com.darling.dao.GirlRepository;
import com.darling.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ling on 17-10-29.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girl1 = new Girl();
        girl1.setAge(24);
        girl1.setCupSize("A");
        girlRepository.save(girl1);
        Girl girl2 = new Girl();
        girl2.setAge(27);
        girl2.setCupSize("AAaa");
        girlRepository.save(girl2);


    }

    public void savegirl(Girl girl) throws Exception{
        try{
            girlRepository.save(girl);
        }catch (Exception e){
            throw new GirlException(5000,"shu ju ku wrong");
        }

    }
}
