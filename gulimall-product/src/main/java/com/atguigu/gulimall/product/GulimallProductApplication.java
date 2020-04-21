package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1).整合mybatis-plus
 * <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1.tmp</version>
 *         </dependency>
 * 2).配置
 *      1.配置数据源
 *          导入数据库驱动.
 *          在application.yaml里配置数据源相关信息
 *      2.配置mybatis-plus
 *          使用MapperScan
 *          告诉mp,sql映射文件位置
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
