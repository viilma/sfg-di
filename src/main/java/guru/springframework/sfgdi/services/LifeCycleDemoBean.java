package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
                                          ApplicationContextAware {
    @Override
    public void destroy() throws Exception {
        System.out.println("##The Lifecycle bean has bean terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##The Lifecycle bean has it's properties");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("##My bean name is " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##Bean factory has bean set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##Application context has bean set");
    }
}
