package uestc.zhangkx.service;

import uestc.zhangkx.framework.BeanPostProcessor;
import uestc.zhangkx.framework.Component;

/**
 * @author zhangkx
 * @create 2020-10-15 21:25
 */
@Component
public class CommonAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public void autowired() {
        System.out.println("处理Resource注解");

    }
}
