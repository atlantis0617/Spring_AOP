package org.spring.test;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class TestBase {
	private ClassPathXmlApplicationContext context;
	private String springXmlPath;

	public TestBase() {
		
	}
	
	 /**
     * 含参构造器，初始化spring配置文件路径
     *
     * @param springXmlPath
     *                      spring配置文件路径
     */
    public TestBase(String springXmlPath) {
 
        this.springXmlPath = springXmlPath;
         
    }
    
    /**
     * 初始化加载spring配置文件到IOC容器中
     */
    @Before
    public void before() {
         
        if(StringUtils.isEmpty(springXmlPath)){
            springXmlPath = "classpath:spring-*.xml";
        }
        context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        context.start();
         
    }
    
    /**
     * 销毁IOC容器
     */
    public void after() {
         
        if(context != null){
            context.destroy();
        }
         
    }
    
    
    /**
     * 根据bean ID获取bean对象
     *
     * @param beanId
     *                  bean ID
     * @return
     */
    public Object getBean(String beanId) {
         
        return context.getBean(beanId);
         
    }

}
