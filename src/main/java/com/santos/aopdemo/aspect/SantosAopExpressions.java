package com.santos.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SantosAopExpressions {
    @Pointcut("execution(* com.santos.aopdemo.dao.*.*(..))")
    public void forDaoPackage() { }

    // create a pointcuts for getter methods
    @Pointcut("execution(* com.santos.aopdemo.dao.*.get*(..))")
    public void getter() {}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.santos.aopdemo.dao.*.set*(..))")
    public void setter() {}

    // create a pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}

}
