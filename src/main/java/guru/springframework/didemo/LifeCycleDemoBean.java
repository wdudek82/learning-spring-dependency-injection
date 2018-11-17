package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactory, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Predestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycle bean has its properties set!");
    }

    @Override
    public Object getBean(String s) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(String s, Class<T> aClass) throws BeansException {
        return null;
    }

    @Override
    public Object getBean(String s, Object... objects) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> aClass) throws BeansException {
        return null;
    }

    @Override
    public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
        return null;
    }

    @Override
    public boolean containsBean(String s) {
        return false;
    }

    @Override
    public boolean isSingleton(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isPrototype(String s) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String s, ResolvableType resolvableType) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public boolean isTypeMatch(String s, Class<?> aClass) throws NoSuchBeanDefinitionException {
        return false;
    }

    @Override
    public Class<?> getType(String s) throws NoSuchBeanDefinitionException {
        return null;
    }

    @Override
    public String[] getAliases(String s) {
        return new String[0];
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass) {
        return null;
    }

    @Override
    public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType) {
        return null;
    }
}
