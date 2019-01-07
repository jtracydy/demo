/*
*  2019 
*/
package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;

/**
 * @author wangdan Date: 2019/1/6 Time: 12:07
 * @version $Id$
 */
@SpringBootConfiguration
@ConfigurationProperties(prefix="author")
@Data
public class UserConfig {

    private String name;
    private String age;
    private String pwd;

    @Autowired
    private Environment env;

    @Override
    public String toString(){
        return name+" "+age+" "+pwd;
    }

    public String getValueName(){
        return env.getProperty("author.name");
    }
}