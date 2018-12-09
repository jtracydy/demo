/*
*  2018 
*/
package com.example.demo.service.impl;

import com.example.demo.dao.ReaderRepository;
import com.example.demo.entity.Reader;
import com.example.demo.service.ReaderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author wangdan Date: 2018/12/9 Time: 11:00
 * @version $Id$
 */
@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    @Override
    public Reader findOneByUserName(String userName) {
        if(StringUtils.isEmpty(userName)){
            return null;
        }
        Optional<Reader>  reader = readerRepository.findById(userName);
        return reader.get();
    }
}