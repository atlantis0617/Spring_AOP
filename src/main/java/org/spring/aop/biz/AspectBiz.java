package org.spring.aop.biz;

public class AspectBiz {
	/**
     * 执行正常的业务方法
     */
    public void biz() {
         
        System.out.println("执行了AspectBiz中的业务方法,无异常");
         
    }
    
    /**
     * 执行存在异常的业务方法
     */
    public void throwingBiz() {
         
        System.out.println("执行了AspectBiz中的业务方法,存在异常");
        throw new RuntimeException();
         
    }
    
    /**
     * 执行正常的含参的业务方法
     *
     * @param arg1
     *              参数一
     * @param arg2
     *              参数二
     */
    public void paramterBiz(String arg1, int arg2) {
         
        System.out.println("执行了AspectBiz中的业务方法，参数是arg1：" + arg1 + "           arg2：" + arg2);
         
    }
}
