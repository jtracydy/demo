/*
*  2019 
*/
package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangdan Date: 2019/1/6 Time: 12:24
 * @version $Id$
 */
@SpringBootConfiguration
@ConfigurationProperties(prefix = "user")
@Data
public class TestConfig {

    private String name;

    @Override
    public String toString(){
        return name;
    }
}