package org.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aspect {

	/**
     * 前置通知
     */
    public void before() {
         
        System.out.println("执行了Aspect切面的前置通知");
         
    }
    
    /**
     * 返回后通知，正常返回，抛出异常时不执行
     */
    public void afterReturning() {
         
        System.out.println("执行了Aspect切面的正常返回后通知");
         
    }
    
    
    /**
     * 抛出异常后通知
     */
    public void afterThrowing() {
         
        System.out.println("执行了Aspect切面的抛出异常后通知");
         
    }
    
    
    /**
     * 后通知，不管是否抛出异常
     */
    public void after() {
         
        System.out.println("执行了Aspect切面的后通知");
         
    }
    
    /**
     * 环绕通知，环绕通知的第一个参数必须是ProceedingJoinPoint
     *
     * @param pjp
     */
    public Object around(ProceedingJoinPoint pjp) {
         
        Object obj = null;
        try {
            System.out.println("Aspect切面环绕通知开始执行");
            obj = pjp.proceed();
            System.out.println("Aspect切面环绕通知执行结束");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
         
    }
    
    
    /**
     * 含参环绕通知，环绕通知的第一个参数必须是ProceedingJoinPoint
     *
     * @param pjp
     */
    public Object aroundParamter(ProceedingJoinPoint pjp, String arg1, int arg2) {
         
        Object obj = null;
        try {
            System.out.println("Aspect切面环绕通知开始执行");
            System.out.println("参数是arg1：" + arg1 + "        arg2：" + arg2);
            obj = pjp.proceed();
            System.out.println("Aspect切面环绕通知执行结束");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
         
    }
	
}
