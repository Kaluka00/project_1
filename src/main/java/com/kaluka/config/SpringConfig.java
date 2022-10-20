package com.kaluka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//设置配置类
@Configuration
//加载配置Bean
@ComponentScan({"com.kaluka.service"})
//连接数据库配置
@PropertySource("classpath:jdbc.properties")
//加载配置类
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
