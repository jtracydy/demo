/*
*  2018 
*/
package com.example.demo.entity;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Date;

/**
 * @author wangdan Date: 2018/11/25 Time: 12:00
 * @version $Id$
 */


public class TestStuBuilder {

    @Test
    public void testStuBuilder() {
        Student.StudentBuiler builer = new Student.StudentBuiler();

        builer.setAddress("asdfadf");
        builer.setAge(12);
        builer.setGrade(99);
        builer.setName("danlucas.wang");
        builer.setSex(1);

        System.out.println(JSON.toJSONString(builer.build()));
    }

    @Test
    public void testPersonBuilder() {
        Person.Builder builder = new Person.Builder("rico", "boy", new Date(), "rico@tju.edu.cn");
        Person p1 = builder.height(173).addr("天津市").nickName("书呆子").build();
        System.out.println(JSON.toJSONString(p1));
    }

    @Test
    public void testUserBuilder(){
        User user = pack();
        System.out.println();
    }

    public User pack(){
        User user = User.builder().addr("asdadf").edu("asdadf").email("jtracydy").build();
        return user;
    }
}