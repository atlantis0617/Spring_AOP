package org.spring.test;

import org.junit.Test;
import org.spring.aop.Fit;
import org.spring.aop.biz.AspectBiz;

public class TestSpringAop extends TestBase{
	 /**
     * 通过构造器初始化spring配置文件路径
     */
    public TestSpringAop() {
         
        super("classpath:spring-aop.xml");
         
    }
    
    /**
     * 测试正常业务逻辑
     */
    @Test
    public void testAspect() {
         
        AspectBiz biz = (AspectBiz) super.getBean("aspectBiz");
        biz.biz();
         
    }
    
    /**
     * 测试异常业务逻辑
     */
    @Test
    public void testThrowAspect() {
         
        AspectBiz biz = (AspectBiz) super.getBean("aspectBiz");
        biz.throwingBiz();
         
    }
    
    
    /**
     * 测试含参数业务逻辑
     */
    @Test
    public void testParamterAspect() {
         
        AspectBiz biz = (AspectBiz) super.getBean("aspectBiz");
        biz.paramterBiz("测试数据", 1234);
         
    }
    
    /**
     * 测试Introduction，在不修改类代码的前提下，为类添加新的方法和属性
     */
    @Test
    public void testIntroduction() {
         
        Fit fit = (Fit) super.getBean("aspectBiz");
        fit.filter();
         
    }
}
