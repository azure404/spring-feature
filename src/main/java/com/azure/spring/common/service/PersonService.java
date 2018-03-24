package com.azure.spring.common.service;

import com.azure.spring.aop.Validate;
import com.azure.spring.common.factory.ResultFactory;
import com.azure.spring.common.model.Person;
import com.azure.spring.common.model.Result;
import org.springframework.stereotype.Component;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:44
 */
@Component
public class PersonService {

    @Validate
    public Result validate(Person person){
        return ResultFactory.success(person);
    }
}
