/*
*  2018 
*/
package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author wangdan Date: 2018/11/25 Time: 12:10
 * @version $Id$
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private  String name;    // required，使用final修饰
    private  String sex;     // required，使用final修饰
    private  Date date;      // required，使用final修饰
    private  String email;       // required，使用final修饰

    private int height;     // optional，不使用final修饰
    private String edu;     // optional，不使用final修饰
    private String nickName;     // optional，不使用final修饰
    private int weight;     // optional，不使用final修饰
    private String addr;     // optional，不使用final修饰
}