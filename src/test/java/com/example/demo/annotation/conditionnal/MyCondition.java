/*
*  2018 
*/
package com.example.demo.annotation.conditionnal;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author wangdan Date: 2018/12/23 Time: 10:42
 * @version $Id$
 */
public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}