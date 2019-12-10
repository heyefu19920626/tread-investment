package com.heyefu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 * <p>
 * 第三方外部数据服务.
 *
 * @author heyefu
 * Create in: 2019-12-10
 * Time: 17:09
 **/
@SpringBootApplication
@EnableEurekaClient
public class ExternalDataApplication {


    public static void main(String[] args) {


        SpringApplication.run(ExternalDataApplication.class, args);
    }
}
