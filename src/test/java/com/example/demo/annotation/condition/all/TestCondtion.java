/*
*  2018 
*/
package com.example.demo.annotation.condition.all;

import com.example.demo.ReadingListApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author wangdan Date: 2018/12/23 Time: 11:21
 * @version $Id$
 */
public class TestCondtion {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ReadingListApplication.class, args);
        String[] beans = context.getBeanNamesForType(Runnable.class);
        System.out.println(Arrays.toString(beans));

        context.close();
    }
}