package com.azure.spring.aop.aspect;

import com.azure.spring.common.factory.ResultFactory;
import com.azure.spring.common.model.Response;
import com.azure.spring.util.ValidationUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:04
 */
@Aspect
@Component
public class ValidateAspect {

    @Around("@annotation(com.azure.spring.aop.Validate)")
    public Object validate(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (Object arg : args){
            String errMsg = ValidationUtil.validate(arg);
            if(errMsg == null){
                continue;
            }
            return ResultFactory.result(Response.PARAMETER_VALIDATE_FAILED, errMsg);
        }
        return pjp.proceed();
    }
}
