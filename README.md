# spring-IOC

实现springIOC中最基本的功能：bean容器、扫描发现bean、bean的生命周期、自动注入

可用方法和注解`Autowired`、`Lazy`、`Scope`、`Component`

**bean容器**

容器放在zhangkxApplicationContext中，用singletonObjectMap实现。

**构造bean**

在beanDefinition中存有该类的class，主要是利用反射构造出bean。构造的同时注意BeanPostProcessor和Autowired

**扫描bean**

就获取当前的ClassLoader，再在用户目录层面进行扫描限定名，转化为String，通过loadClass加载，依次判断是否有相关注解，实现扫描。扫描后将bean信息放入beandefinition中。

**bean的单例和原型**

只要有beandefinition，我们就可以根据其创建bean。具体单例和原型看代码的逻辑。