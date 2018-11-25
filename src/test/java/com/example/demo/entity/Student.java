/*
*  2018 
*/
package com.example.demo.entity;

import lombok.Data;

/**
 * @author wangdan Date: 2018/11/25 Time: 11:40
 * @version $Id$
 */


@Data
public class Student {
    private String name;
    private int age;
    private int sex;
    private String address;
    private float grade;

    private Student(StudentBuiler builer) {
        this.address = builer.address;
        this.age = builer.age;
        this.sex = builer.sex;
        this.address = builer.address;
        this.grade = builer.grade;
    }

    public static final class StudentBuiler {

        private String name;
        private int age;
        private int sex;
        private String address;
        private float grade;

        public static StudentBuiler builder() {
            return new StudentBuiler();
        }

        public StudentBuiler setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuiler setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuiler setSex(int sex) {
            this.sex = sex;
            return this;
        }

        public StudentBuiler setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuiler setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}