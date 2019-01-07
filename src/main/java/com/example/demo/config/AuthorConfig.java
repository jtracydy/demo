/*
*  2019 
*/
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wangdan Date: 2019/1/7 Time: 11:15
 * @version $Id$
 */
@Component
@PropertySource(value = { "classpath:config/author.properties" })
public class AuthorConfig {

    @Value("${hhhhhhname}")
    private String name;

    @Override
    public String toString(){
        return name;
    }
}