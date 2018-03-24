package com.azure.spring.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:44
 */
@Getter
@Setter
@AllArgsConstructor
public class Person {

    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Min(value = 1, message = "性别未知")
    @Max(value = 2, message = "性别未知")
    private int gender;
    @Valid
    private Clothes clothes;
}

