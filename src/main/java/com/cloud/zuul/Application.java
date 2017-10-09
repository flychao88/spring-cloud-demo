package com.cloud.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Date:16/11/23
 * Name:chao.cheng
 **/
@EnableZuulProxy
@SpringCloudApplication
public class Application {
    public static void main(String[] args) {
        //	SpringApplication.run(DemoApplication.class, args);

        new SpringApplicationBuilder(Application.class).web(true).run(args);

    }
}
