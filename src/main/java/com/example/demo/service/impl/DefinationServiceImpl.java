/*
*  2019 
*/
package com.example.demo.service.impl;

import com.example.demo.config.AuthorConfig;
import com.example.demo.config.ConfigUtils;
import com.example.demo.config.UserConfig;
import com.example.demo.service.DefinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangdan Date: 2019/1/6 Time: 11:24
 * @version $Id$
 */
@Service
public class DefinationServiceImpl implements DefinationService {


    @Autowired
    private ConfigUtils configUtils;

    @Autowired
    private UserConfig userConfig;

    @Autowired
    private AuthorConfig authorConfig;

    @Override
    public String getUserConfig() {
        return userConfig.toString();
    }

    @Override
    public String getYmlValue() {
        return userConfig.getValueName();
    }

    @Override
    public String generalValue() {
        return configUtils.getConfigValue();
    }

    @Override
    public String getAuthorValue() {
        return authorConfig.toString();
    }


}