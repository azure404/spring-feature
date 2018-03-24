package com.azure.spring.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午1:05
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clothes{

    @NotEmpty(message = "颜色不能为空")
    private String color;

}
