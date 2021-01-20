package uestc.zhangkx;

import uestc.zhangkx.framework.ZhangkxApplicationContext;
import uestc.zhangkx.service.UserService;

/**
 * 测试Spring
 * @author zhangkx
 * @create 2020-10-13 19:32
 */
public class Test {

    public static void main(String[] args) {
        // 启动Spring，创建bean，提供给用户使用
        // Spring启动过程：
            // 1.扫描（不是项目中所有bean都要创建对象）
            // 2.创建bean（非懒加载的单例bean）
        ZhangkxApplicationContext applicationContext = new ZhangkxApplicationContext(AppConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        Object userService1 = applicationContext.getBean("userService");
        System.out.println(userService1);
    }
}
