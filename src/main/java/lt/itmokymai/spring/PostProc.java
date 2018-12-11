package lt.itmokymai.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class PostProc implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Bean is going to be initialized : " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

        System.out.println("Bean has just been initialized " + beanName);
        return bean;
    }
}

