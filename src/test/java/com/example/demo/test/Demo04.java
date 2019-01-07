/*
*  2019 
*/
package com.example.demo.test;

import com.google.common.collect.ImmutableList;

/**
 * @author wangdan Date: 2019/1/2 Time: 10:47
 * @version $Id$
 */
public class Demo04 {

    public static void main(String[] args) {
        ImmutableList<String> list = new ImmutableList.Builder<String>()
                .add("a")
                .add("b")
                .build();
        System.out.println(list);
    }
}