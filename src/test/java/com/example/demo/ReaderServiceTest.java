/*
*  2018 
*/
package com.example.demo;

import com.example.demo.entity.Reader;
import com.example.demo.service.ReaderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2018/12/9 Time: 11:27
 * @version $Id$
 */
public class ReaderServiceTest extends BaseTest{

    @Autowired
    private ReaderService readerService;

    @Test
    public void test(){
        Reader reader = readerService.findOneByUserName("lucas");
        System.out.println(reader.getUsername());
    }
}