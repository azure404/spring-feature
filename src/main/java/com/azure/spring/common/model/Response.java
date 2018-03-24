package com.azure.spring.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:31
 */
@AllArgsConstructor
@Getter
public enum Response {

    SUCCESS(0, "成功"),
    FAILED(1, "失败"),
    PARAMETER_VALIDATE_FAILED(2, "参数校验失败, %s");

    private int code;
    private String message;
}
