/*
*  2018 
*/
package com.example.demo.test;


/**
 * @author wangdan Date: 2018/12/27 Time: 11:52
 * @version $Id$
 */
public class Demo03 {

    public static void main(String[] args) {
        int i = 0;
        while(true){
            get(i);
            if(i == 10){
                System.out.println(i);
                return;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void get(int i){
        if(i == 5){
            return;
        }
    }
}