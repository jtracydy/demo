/*
*  2019 
*/
package com.example.demo.config;

import com.example.demo.BaseTest;
import com.example.demo.service.DefinationService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2019/1/6 Time: 11:14
 * @version $Id$
 */
@Slf4j
public class DefinationConfigTest extends BaseTest{

    @Autowired
    private DefinationService config;

    @Autowired
    private TestConfig testConfig;

    @Test
    public void test(){
        String str3 = config.getUserConfig();
        log.info("config3....."+str3);

        String str4 = config.getYmlValue();
        log.info("config4....."+str4);

        String str5 = config.generalValue();
        log.info("config5....."+str5);

        String str6 = config.getAuthorValue();
        log.info("config6....."+str6);

    }

    @Test
    public void testConfig(){
        log.info("testconfig "+testConfig.toString());
    }
}