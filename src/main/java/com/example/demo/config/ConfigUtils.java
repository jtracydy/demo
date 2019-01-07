/*
*  2019 
*/
package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author wangdan Date: 2019/1/6 Time: 11:56
 * @version $Id$
 */
@Component
@PropertySource(value = { "classpath:user.properties" })
@Data
public class ConfigUtils {

    @Value("${general.value}")
    private String generalValue;

    @Autowired
    private Environment env;

    public String getConfigValue(){
        return env.getProperty("general.value")+" " + generalValue;
    }


}