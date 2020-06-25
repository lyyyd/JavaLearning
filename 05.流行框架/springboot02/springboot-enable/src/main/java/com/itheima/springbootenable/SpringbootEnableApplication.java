package com.itheima.springbootenable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * @ComponentScan 扫描范围：当前引导类所在包及其子包
 *
 * com.itheima.springbootenable
 * com.itheima.config
 * //1.使用@ComponentScan扫描com.itheima.config包
 * //2.可以使用@Import注解，加载类。这些类都会被Spring创建，并放入IOC容器
 * //3.可以对Import注解进行封装。
 */


/**
 * Import4中用法：
 *  1. 导入Bean
 *  2. 导入配置类
 *  3. 导入ImportSelector的实现类。
 *  4. 导入ImportBeanDefinitionRegistrar实现类
 */


//@ComponentScan("com.itheima.config")
//@Import(UserConfig.class)
//@EnableUser


//@Import(User.class)
//@Import(UserConfig.class)
//@Import(MyImportSelector.class)
//@Import({MyImportBeanDefinitionRegistrar.class})

@SpringBootApplication
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

        /*//获取Bean
        Object user = context.getBean("user");
        System.out.println(user);*/

        /*User user = context.getBean(User.class);
        System.out.println(user);

        Role role = context.getBean(Role.class);
        System.out.println(role);*/

      /*  Object user = context.getBean("user");
        System.out.println(user);*/
       /* Map<String, User> map = context.getBeansOfType(User.class);
        System.out.println(map);*/


        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("name","itcast");

        String name = jedis.get("name");
        System.out.println(name);

    }


    @Bean
    public Jedis jedis(){
        return  new  Jedis("localhost",6379);
    }

}
