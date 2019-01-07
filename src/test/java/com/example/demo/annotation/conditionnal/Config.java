/*
*  2018 
*/
package com.example.demo.annotation.conditionnal;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author wangdan Date: 2018/12/23 Time: 10:53
 * @version $Id$
 */
@SpringBootConfiguration
public class Config {

    @Bean
    @Conditional(MyCondition.class)
    public Runnable runnableBean1() {
        return () ->{};
    }

    @Bean
    public Runnable runnableBean2() {
        return () ->{};
    }

    @Bean
    @Conditional(MyCondition.class)
    public Runnable runnableBean3() {
        return () ->{};
    }

}