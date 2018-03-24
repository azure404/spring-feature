package com.azure.spring.common.model;

import lombok.*;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午12:25
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result<T> {
    @NonNull
    private int code;
    @NonNull
    private String message;
    private T data;
}
