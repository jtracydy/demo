/*
*  2018 
*/
package com.example.demo;

import com.example.demo.service.ReadingListService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangdan Date: 2018/12/9 Time: 11:53
 * @version $Id$
 */
public class ReaderServiceImpl extends BaseTest{

    @Autowired
    private ReadingListService readingListService;

    @Test
    public void test(){
        System.out.println( readingListService.findByReader("login"));
    }
}