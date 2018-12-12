/*
*  2018 
*/
package com.example.demo.test;

/**
 * @author wangdan Date: 2018/12/10 Time: 17:50
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {
        A a = new A();
        if(a instanceof A){
            System.out.println("aaaa");
        }

        B b = null;
        if(b instanceof B){
            System.out.println("bbbb");
        }else{
            System.out.println("no bbbb");
        }
    }
}

class A {

}

class B{

}