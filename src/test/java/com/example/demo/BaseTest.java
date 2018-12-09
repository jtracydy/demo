/*
*  2018 
*/
package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangdan Date: 2018/11/24 Time: 10:37
 * @version $Id$
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringJUnit4ClassRunnerSpringBootApplication
@SpringBootTest(classes = ReadingListApplication.class)
@WebAppConfiguration
public class BaseTest {

    @Test
    public void test(){

    }
}