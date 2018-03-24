package com.azure.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 功能说明：TODO
 *
 * @author guyi
 * @date 2018年03月24日 下午1:11
 */
@Configuration
@ComponentScan("com.azure.spring")
@EnableAspectJAutoProxy
public class SpringConfig {
}
