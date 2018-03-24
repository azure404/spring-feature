package com.azure.spring.common.factory;

import com.azure.spring.common.model.Response;
import com.azure.spring.common.model.Result;

import java.text.MessageFormat;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:27
 */
public class ResultFactory {

    public static <T> Result success(T data){
        return newResult(Response.SUCCESS, data);
    }

    public static <T> Result result(Response resp, String... message){
        String format = resp.getMessage();
        return newResult(resp.getCode(), String.format(format, message), null);
    }

    private static <T> Result newResult(Response resp, T data){
        return new Result(resp.getCode(), resp.getMessage(), data);
    }

    private static <T> Result newResult(int code, String message, T data){
        return new Result(code, message, data);
    }
}
