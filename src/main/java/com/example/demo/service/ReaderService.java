/*
*  2018 
*/
package com.example.demo.service;

import com.example.demo.entity.Reader;

/**
 * @author wangdan Date: 2018/12/9 Time: 11:00
 * @version $Id$
 */
public interface ReaderService {

    Reader findOneByUserName(String userName);
}