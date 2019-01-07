/*
*  2018 
*/
package com.example.demo.annotation.condition.all;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author wangdan Date: 2018/12/23 Time: 11:16
 * @version $Id$
 */

@SpringBootConfiguration
public class ConditionConfig {

    @Bean
    @ConditionalOnMissingBean(ConditionConfig.class)
    public Runnable r1(){
        return () ->{};
    }

    @Bean
    @ConditionalOnBean(ConditionConfig.class)
    public Runnable r2(){
        return () -> {};
    }


}